# Penyelesaian Permainan Queens LinkedIn - Tucil 1 IF2211

Program ini dibuat untuk memenuhi Tugas Kecil 1 Mata Kuliah IF2211 Strategi Algoritma. Program ini merupakan solver (pencari solusi) untuk permainan teka-teki logika **Queens** yang tersedia pada situs jejaring profesional LinkedIn. Pencarian solusi diimplementasikan menggunakan algoritma **Brute Force** murni tanpa menggunakan heuristik apapun.

## a. Penjelasan Singkat Program

Tujuan dari gim **Queens** adalah menempatkan bidak queen pada sebuah papan persegi berwarna. Agar solusi dianggap valid, penempatan queen harus mematuhi aturan berikut:
1. **Satu per Baris:** Terdapat hanya satu queen pada tiap baris.
2. **Satu per Kolom:** Terdapat hanya satu queen pada tiap kolom.
3. **Satu per Warna:** Terdapat hanya satu queen pada tiap daerah warna.
4. **Tidak Bersentuhan:** Satu queen tidak dapat ditempatkan bersebelahan dengan queen lainnya, termasuk secara diagonal.

Program ini bekerja dengan metode Exhaustive Search (pencarian menyeluruh). Algoritma membangkitkan kombinasi posisi secara iteratif (layaknya sistem odometer atau pencacah), lalu menguji setiap kombinasi tersebut terhadap aturan permainan. Program akan terus meninjau kasus hingga satu solusi penempatan queen ditemukan atau menampilkan bahwa tidak ada solusi yang valid.

Fitur utama program:
* Membaca masukan file test case berekstensi .txt yang berisi konfigurasi awal dari papan Queens.
* Memvalidasi apakah input yang diberikan merupakan input valid atau bukan.
* Visualisasi proses peninjauan (Live Update) di terminal.
* Menampilkan banyak konfigurasi atau iterasi yang ditinjau oleh algoritma.
* Menampilkan waktu eksekusi program dalam milisecond (cukup waktu pencarian algoritma).
* Menampilkan hasil akhir dari papan yang sudah terisi oleh queens dengan aturan yang benar.

## b. Requirement Program

Untuk menjalankan program ini, pastikan lingkungan komputasi Anda memenuhi syarat berikut:
* **Java Development Kit (JDK):** Versi 8 atau yang lebih baru.
* **Sistem Operasi:** Windows atau Linux (program dipastikan dapat dikompilasi setidaknya pada kedua OS ini).
* **Dependensi:** Tidak ada instalasi tertentu bila ada karena program ini hanya menggunakan pustaka standar bawaan Java.

## c. Cara Mengkompilasi Program

Repositori ini menggunakan struktur folder sebagai berikut:
* `src/`: Folder berisi source code program.
* `bin/`: Folder berisi executable file hasil kompilasi.
* `test/`: Folder berisi solusi jawaban dari data uji.
* `doc/`: Folder berisi laporan tugas kecil dalam bentuk PDF.

Lakukan langkah-langkah berikut untuk mengkompilasi program bila perlu dikompilasi:
1. Buka terminal atau command prompt.
2. Arahkan direktori aktif ke root folder proyek ini.
3. Jalankan perintah kompilasi berikut:

    javac -d bin src/SolverGameQueens.java

Perintah ini akan membaca kode dari folder src dan meletakkan hasil kompilasinya ke dalam folder bin. 

## d. Cara Menjalankan dan Menggunakan Program

Setelah kompilasi berhasil, Anda dapat menjalankan dan menggunakan program dengan perintah berikut dari root direktori:

    java -cp bin SolverGameQueens

**Panduan Penggunaan:**
1. Program akan memberikan pengguna sebuah arahan pada terminal untuk memilih file test case berekstensi .txt.
2. Ketikkan path lengkap ke file uji coba (contoh: test/test1.txt), lalu tekan Enter.
3. Program akan memvalidasi input. Jika valid, proses pencarian akan dimulai.
4. Program memvisualisasikan proses brute force yang dilakukan secara berkala di layar.
5. Setelah selesai, program akan menampilkan hasil akhir dari papan yang sudah terisi oleh queens, waktu eksekusi dalam ms, dan banyak kasus (iterasi) yang ditinjau.
6. Program akan menanyakan apakah Anda ingin menyimpan solusi. Ketik y untuk menyimpan, lalu masukkan nama file keluaran (contoh: test/solusi1.txt).

## e. Author / Identitas Pembuat

* **Nama:** Fayyaz Akmal Lauda
* **NIM:** 13524076
* **Kelas:** 02  
* **Program Studi:** Teknik Informatika
* **Institusi:** Institut Teknologi Bandung
