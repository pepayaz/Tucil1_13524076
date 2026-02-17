# Penyelesaian Permainan Queens LinkedIn - Tucil 1 IF2211

Program ini dibuat untuk memenuhi Tugas Kecil 1 Mata Kuliah IF2211 Strategi Algoritma. [cite_start]Program ini merupakan *solver* (pencari solusi) untuk permainan teka-teki logika **Queens** yang tersedia pada situs jejaring profesional LinkedIn[cite: 1322]. [cite_start]Pencarian solusi diimplementasikan menggunakan algoritma **Brute Force** murni tanpa menggunakan heuristik apapun[cite: 1326, 1331, 1332].

## a. Penjelasan Singkat Program

[cite_start]Tujuan dari gim **Queens** adalah menempatkan bidak *queen* pada sebuah papan persegi berwarna[cite: 1323]. Agar solusi dianggap valid, penempatan *queen* harus mematuhi aturan berikut:
1.  [cite_start]**Satu per Baris:** Terdapat hanya satu *queen* pada tiap baris[cite: 1323].
2.  [cite_start]**Satu per Kolom:** Terdapat hanya satu *queen* pada tiap kolom[cite: 1323].
3.  [cite_start]**Satu per Warna:** Terdapat hanya satu *queen* pada tiap daerah warna[cite: 1323].
4.  [cite_start]**Tidak Bersentuhan:** Satu *queen* tidak dapat ditempatkan bersebelahan dengan *queen* lainnya, termasuk secara diagonal[cite: 1324].

Program ini bekerja dengan metode *Exhaustive Search* (pencarian menyeluruh). Algoritma membangkitkan kombinasi posisi secara iteratif (layaknya sistem *odometer* atau pencacah), lalu menguji setiap kombinasi tersebut terhadap aturan permainan. [cite_start]Program akan terus meninjau kasus hingga satu solusi penempatan *queen* ditemukan atau menampilkan bahwa tidak ada solusi yang valid[cite: 1325].

Fitur utama program:
* [cite_start]Membaca masukan file test case berekstensi `.txt` yang berisi konfigurasi awal dari papan *Queens*[cite: 1333].
* [cite_start]Memvalidasi apakah input yang diberikan merupakan input valid atau bukan[cite: 1334].
* [cite_start]Visualisasi proses peninjauan (*Live Update*) di terminal[cite: 1341].
* [cite_start]Menampilkan banyak konfigurasi atau iterasi yang ditinjau oleh algoritma[cite: 1339].
* [cite_start]Menampilkan waktu eksekusi program dalam *milisecond* (cukup waktu pencarian algoritma)[cite: 1340].
* [cite_start]Menampilkan hasil akhir dari papan yang sudah terisi oleh *queens* dengan aturan yang benar[cite: 1338].

## b. Requirement Program

Untuk menjalankan program ini, pastikan lingkungan komputasi Anda memenuhi syarat berikut:
* **Java Development Kit (JDK):** Versi 8 atau yang lebih baru.
* [cite_start]**Sistem Operasi:** Windows atau Linux (program dipastikan dapat dikompilasi setidaknya pada kedua OS ini)[cite: 1377].
* [cite_start]**Dependensi:** Tidak ada instalasi tertentu bila ada karena program ini hanya menggunakan pustaka standar bawaan Java[cite: 1370].

## c. Cara Mengkompilasi Program

[cite_start]Repositori ini menggunakan struktur folder sebagai berikut[cite: 1363, 1364, 1365, 1366, 1367]:
* `src/`: Folder berisi *source code* program.
* `bin/`: Folder berisi *executable file* hasil kompilasi.
* `test/`: Folder berisi solusi jawaban dari data uji.
* `doc/`: Folder berisi laporan tugas kecil dalam bentuk PDF.

[cite_start]Lakukan langkah-langkah berikut untuk mengkompilasi program bila perlu dikompilasi[cite: 1371]:
1.  Buka terminal atau *command prompt*.
2.  Arahkan direktori aktif ke *root* folder proyek ini.
3.  Jalankan perintah kompilasi berikut:

```bash
javac -d bin src/SolverGameQueens.java
```

Perintah ini akan membaca kode dari folder `src` dan meletakkan hasil kompilasinya ke dalam folder `bin`. 

## d. Cara Menjalankan dan Menggunakan Program

[cite_start]Setelah kompilasi berhasil, Anda dapat menjalankan dan menggunakan program dengan perintah berikut dari *root* direktori[cite: 1372]:

```bash
java -cp bin SolverGameQUeens
```

**Panduan Penggunaan:**
1.  [cite_start]Program akan memberikan pengguna sebuah arahan pada terminal untuk memilih file test case berekstensi `.txt`[cite: 1333].
2.  Ketikkan *path* lengkap ke *file* uji coba (contoh: `test/test1.txt`), lalu tekan **Enter**.
3.  Program akan memvalidasi input. Jika valid, proses pencarian akan dimulai.
4.  [cite_start]Program memvisualisasikan proses *brute force* yang dilakukan secara berkala di layar[cite: 1341].
5.  [cite_start]Setelah selesai, program akan menampilkan hasil akhir dari papan yang sudah terisi oleh *queens*, waktu eksekusi dalam ms, dan banyak kasus (iterasi) yang ditinjau[cite: 1338, 1339, 1340].
6.  Program akan menanyakan apakah Anda ingin menyimpan solusi. Ketik `y` untuk menyimpan, lalu masukkan nama *file* keluaran (contoh: `test/solusi1.txt`).

## e. Author / Identitas Pembuat

* **Nama:** Fayyaz Akmal Lauda
* **NIM:** 13524076
* **Kelas:** 02  
* **Program Studi:** Teknik Informatika
* **Institusi:** Institut Teknologi Bandung
