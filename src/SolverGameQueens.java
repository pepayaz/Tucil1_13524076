import java.io.*;
import java.util.*;

public class SolverGameQueens {
    static int n;
    static char[][] warna;
    static int[] queens;
    static boolean isSolved = false;
    static long iterasi = 0;

    static long lastUpdateTime = 0;
    static final long UPDATE_INTERVAL = 300;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Program Solver Game Queens ===");
            System.out.print("Masukkan nama file input (misal: test/test1.txt): ");
            String filename = scanner.nextLine();
            
            if (!loadValidasi(filename)) {
                System.out.println("File input tidak valid. Pastikan formatnya benar.");
                return;
            }
            queens = new int[n];
            System.out.println("Memulai proses...\n");

            long StartTime = System.currentTimeMillis();
            lastUpdateTime = StartTime;
            generateTest();
            long EndTime = System.currentTimeMillis();
        
            if (isSolved) {
                System.out.println("=== Solusi ditemukan! ===\n");
                printBoard(queens);
            } else {
                System.out.println("=== Tidak ada solusi yang ditemukan. ===");
            }

            long executionTime = EndTime - StartTime;
            System.out.println("Waktu eksekusi: " + executionTime + " ms");
            System.out.println("Total iterasi: " + iterasi);

            if (isSolved) {
                System.out.print("Apakah Anda ingin menyimpan solusi ke file? (y/n): ");
                String saveChoice = scanner.nextLine().trim().toLowerCase();
                if (saveChoice.equals("y")) {
                    System.out.print("Masukkan nama file output:");
                    String outputFilename = scanner.nextLine();
                    save(outputFilename, executionTime);
                }
            }
        }
    }

    private static void generateTest() {
        boolean lanjut = true;

        while (lanjut && !isSolved) {
            iterasi++;
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastUpdateTime >= UPDATE_INTERVAL) {
                System.out.println("Live update: Iterasi ke-" + iterasi + ": ");
                printBoard(queens);
                System.out.println("===============================");
                lastUpdateTime = currentTime;
            }

            if (isValid(queens)) {
                isSolved = true;
                break;
            }

            int i = n - 1;
            while (i >= 0 && queens[i] == n - 1) {
                queens[i] = 0;
                i--;
            }

            if (i >= 0) {
                queens[i]++;
            } else {
                lanjut = false;
            }
        }
    }

    private static boolean isValid(int[] state) {
        boolean[] col = new boolean[n];
        boolean[] region = new boolean[26];

        for (int r1 = 0; r1 < n; r1++) {
            int c1 = state[r1];
            char regionChar = warna[r1][c1];
            int regionIdx = regionChar - 'A';

            if (col[c1]) {
                return false;
            }
            col[c1] = true;
            if (region[regionIdx]) {
                return false;
            }
            region[regionIdx] = true;

            for (int r2 = 0; r2 < r1; r2++) {
                int c2 = state[r2];
                if (Math.abs(r1 - r2) <= 1 && Math.abs(c1 - c2) <= 1) {
                    return false;
                }
            }
        }
        return true;
    }

    // Utilitas 
    private static boolean loadValidasi(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    lines.add(line);
                }
            }
            
            if (lines.isEmpty()) {
                System.out.println("File input kosong.");
                return false;
            }
            n = lines.size();
            warna = new char[n][n];
            Set<Character> daerahValid = new HashSet<>();

            for (int i = 0; i < n; i++) {
                if (lines.get(i).length() != n) {
                    System.out.println("Panjang baris tidak sesuai dengan ukuran papan.");
                    return false;
                }
                for (int j = 0; j < n; j++) {
                    char c = lines.get(i).charAt(j);
                    if (c < 'A' || c > 'Z') {
                        System.out.println("Error: Karakter harus antara A-Z.");
                        return false;
                    }
                    warna[i][j] = c;
                    daerahValid.add(c);
                }
            }
 
            if (daerahValid.size() != n) {
                System.out.println("Jumlah daerah tidak sesuai dengan ukuran papan.");
                return false;
            }
            return true;
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
            return false;
        }
    }

    private static void printBoard(int[] state) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (state[i] == j) {
                    System.out.print(Character.toLowerCase(warna[i][j]) + " ");
                } else {
                    System.out.print(warna[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    private static void save(String filename, long executionTime) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (queens[i] == j) {
                        pw.print(Character.toLowerCase(warna[i][j]) + " ");
                    } else {
                        pw.print(warna[i][j] + " ");
                    }
                }
                pw.println();
            }

            pw.println();
            pw.println("Waktu eksekusi: " + executionTime + " ms");
            pw.println("Total iterasi: " + iterasi);
            System.out.println("Solusi berhasil disimpan ke " + filename);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan file: " + e.getMessage());
        }
    }
}

