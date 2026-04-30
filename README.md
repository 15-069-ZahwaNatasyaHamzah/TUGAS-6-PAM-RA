# Newsly - Modern Space News Reader 

**Newsly** adalah aplikasi pembaca berita modern yang dibangun menggunakan **Compose Multiplatform (Kotlin Multiplatform)**. Aplikasi ini dirancang untuk memberikan pengalaman membaca berita luar angkasa yang elegan, cepat, dan interaktif dengan dukungan penuh untuk mode gelap.

---

## Fitur Utama 

1.  **Fetch Data Real-time**: Mengambil berita terbaru dari API publik secara asinkron.
2.  **Daftar Berita Modern**: Menampilkan list artikel dengan Judul, Gambar, Ringkasan, dan Nama Sumber.
3.  **Halaman Detail**: Menampilkan konten berita secara lengkap dengan tata letak *edge-to-edge*.
4.  **Pull to Refresh**: Memperbarui berita terbaru hanya dengan menarik layar ke bawah.
5.  **State Management**: Penanganan kondisi *Loading* (dengan Shimmer), *Success* (dengan Animasi), dan *Error* (dengan tombol Retry).
6.  **Repository Pattern**: Pemisahan logika data dan UI menggunakan arsitektur yang bersih.

---

## API yang Digunakan

Aplikasi ini menggunakan **[Spaceflight News API (v4)](https://api.spaceflightnewsapi.net/v4/articles/)**.
*   **Kenapa API ini?**: API ini menyediakan data berita nyata (bukan dummy) tentang eksplorasi luar angkasa, lengkap dengan gambar berkualitas tinggi.
*   **Kelebihan**: Tidak memerlukan API Key (Public Access), sehingga memudahkan proses instalasi dan pengecekan oleh penilai tanpa hambatan autentikasi.

---

## Teknologi & Library

*   **Compose Multiplatform**: Framework UI utama untuk Android dan Desktop.
*   **Ktor Client**: Library networking untuk melakukan HTTP request ke API.
*   **Coil3**: Library modern untuk memuat dan menampilkan gambar dari internet.
*   **Kotlinx Serialization**: Untuk parsing data JSON dari API ke objek Kotlin.
*   **ViewModel & StateFlow**: Untuk manajemen state aplikasi yang reaktif.

---

## Cara Menjalankan Project

1. **Persiapan Resource**: Pastikan file `profile_user.png` berada di folder `composeApp/src/commonMain/composeResources/drawable/`.
2. **Sync Project**: Lakukan *Gradle Sync* di Android Studio.
3. **Run**:
   - Untuk Android: Pilih modul `composeApp` lalu klik **Run**.
   - Untuk Desktop: Jalankan perintah `./gradlew :composeApp:run` di terminal.

---

## Dokumentasi Visual

|Profile | Favorite | Home | Search news |
| :---: | :---: | :---: | :---: |
|<img width="435" height="796" alt="image" src="https://github.com/user-attachments/assets/410f30f9-e015-48db-bfc6-3f3a8a5e5673" />|<img width="436" height="792" alt="image" src="https://github.com/user-attachments/assets/c5dbc735-4baa-4950-aa74-564147f3abd1" />|<img width="437" height="799" alt="image" src="https://github.com/user-attachments/assets/6c910d25-fb1d-4ec4-b6b9-fef4582bb7fd" />|<img width="435" height="798" alt="image" src="https://github.com/user-attachments/assets/44be6fdf-af78-4659-a0df-19e26b97f196" />|

##  Video Demo

Video demo fitur aplikasi :
<img width="720" height="1280" alt="Image" src="https://github.com/user-attachments/assets/803699fa-565f-40f8-9a66-19dc286f72e5" />

