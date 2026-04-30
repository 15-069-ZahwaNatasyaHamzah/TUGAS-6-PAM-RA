# Newsly - Modern Space News Reader 🚀

**Newsly** adalah aplikasi pembaca berita modern yang dibangun menggunakan **Compose Multiplatform (Kotlin Multiplatform)**. Aplikasi ini dirancang untuk memberikan pengalaman membaca berita luar angkasa yang elegan, cepat, dan interaktif dengan dukungan penuh untuk mode gelap.

Aplikasi ini dikembangkan untuk memenuhi **Tugas 6 Praktikum Pemrograman Aplikasi Mobile (PAM)**.

---

## 🌟 Fitur Utama (Sesuai Instruksi Tugas)

1.  **Fetch Data Real-time**: Mengambil berita terbaru dari API publik secara asinkron.
2.  **Daftar Berita Modern**: Menampilkan list artikel dengan Judul, Gambar, Ringkasan, dan Nama Sumber.
3.  **Halaman Detail**: Menampilkan konten berita secara lengkap dengan tata letak *edge-to-edge*.
4.  **Pull to Refresh**: Memperbarui berita terbaru hanya dengan menarik layar ke bawah.
5.  **State Management**: Penanganan kondisi *Loading* (dengan Shimmer), *Success* (dengan Animasi), dan *Error* (dengan tombol Retry).
6.  **Repository Pattern**: Pemisahan logika data dan UI menggunakan arsitektur yang bersih.

## ✨ Fitur Unggulan (Bonus)

*   🔍 **Fitur Pencarian**: Cari berita berdasarkan kata kunci judul atau isi berita.
*   ❤️ **Sistem Favorit**: Simpan artikel yang disukai ke tab "Saved" untuk dibaca nanti.
*   👤 **Profil Interaktif**: Halaman profil yang menampilkan identitas pengguna beserta foto asli.
*   ✏️ **Edit Profil**: Pengguna dapat mengubah Nama dan Bio secara langsung melalui Dialog Box.
*   🌙 **Dark Mode**: Mendukung tema gelap yang nyaman untuk mata saat membaca di malam hari.
*   🪄 **Animasi Premium**: Transisi halus saat memuat data dan berpindah halaman.

---

## 🔌 API yang Digunakan

Aplikasi ini menggunakan **[Spaceflight News API (v4)](https://api.spaceflightnewsapi.net/v4/articles/)**.
*   **Kenapa API ini?**: API ini menyediakan data berita nyata (bukan dummy) tentang eksplorasi luar angkasa, lengkap dengan gambar berkualitas tinggi.
*   **Kelebihan**: Tidak memerlukan API Key (Public Access), sehingga memudahkan proses instalasi dan pengecekan oleh penilai tanpa hambatan autentikasi.

---

## 🛠️ Teknologi & Library

*   **Compose Multiplatform**: Framework UI utama untuk Android dan Desktop.
*   **Ktor Client**: Library networking untuk melakukan HTTP request ke API.
*   **Coil3**: Library modern untuk memuat dan menampilkan gambar dari internet.
*   **Kotlinx Serialization**: Untuk parsing data JSON dari API ke objek Kotlin.
*   **ViewModel & StateFlow**: Untuk manajemen state aplikasi yang reaktif.

---

## 🚀 Cara Menjalankan Aplikasi

Pastikan Anda sudah menginstal **Android Studio** versi terbaru (Ladybug atau Koala) dan **JDK 17/21**.

1.  **Clone Repository**:
    ```bash
    git clone https://github.com/15-069-ZahwaNatasyaHamzah/TUGAS-6-PAM-RA.git
    ```
2.  **Buka di Android Studio**:
    *   Klik `File` > `Open` > Pilih folder `Tugas6PAM`.
    *   Tunggu proses **Gradle Sync** selesai (pastikan koneksi internet stabil).
3.  **Jalankan di Emulator/HP**:
    *   Pilih konfigurasi run `composeApp`.
    *   Pilih emulator atau perangkat Android fisik Anda.
    *   Klik tombol **Run (Segitiga Hijau)**.

---

**Dibuat oleh:**
Zahwa Natasya Hamzah (123140069)
Mahasiswa Informatika - Institut Teknologi Sumatera (ITERA)
