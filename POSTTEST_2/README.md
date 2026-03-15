# ₊˚⊹ ᰔ LuxeClaws - Sistem Manajemen Reservasi Nail Art

Program ini merupakan aplikasi berbasis **Java** yang digunakan untuk mengelola data reservasi layanan nail art pada sebuah salon.  

Program dibuat sebagai **Posttest 2 Praktikum Pemrograman Berorientasi Objek (PBO)** dengan menerapkan konsep **Object Oriented Programming (OOP)** khususnya **Encapsulation**, penggunaan **Access Modifier**, serta penerapan **Getter dan Setter** pada setiap class.

Data reservasi pada sistem ini disimpan sementara menggunakan **ArrayList**.

---

# ⋆˚࿔ Deskripsi Program

Sistem ini memungkinkan pengguna untuk melakukan pengelolaan data reservasi nail art melalui menu yang tersedia di terminal.

Program akan terus berjalan hingga pengguna memilih **menu Exit**.

Data yang dikelola pada sistem ini meliputi:
- Data pelanggan
- Data layanan nail art
- Harga layanan
- Tanggal reservasi

---

# ⋆˚࿔ Fitur Program

Program ini memiliki fitur utama berupa **CRUD (Create, Read, Update, Delete)** terhadap data reservasi.

### 1. Create (Tambah Reservasi)
Menambahkan data reservasi baru yang berisi:
- Nama customer
- Nomor HP
- Jenis layanan nail art
- Harga layanan
- Tanggal reservasi

### 2. Read (Lihat Reservasi)
Menampilkan seluruh data reservasi yang telah tersimpan di dalam sistem.

### 3. Update (Perbarui Reservasi)
Mengubah data reservasi yang sudah ada.

### 4. Delete (Hapus Reservasi)
Menghapus data reservasi dari sistem.

---

# ⋆˚࿔ Struktur Class

Program ini menggunakan beberapa class untuk menerapkan konsep **Object Oriented Programming**.

### 1. Customer
Class ini digunakan untuk menyimpan data pelanggan.

Atribut:
- `nama`
- `noHp`

Pada class ini diterapkan **Encapsulation** dengan penggunaan `private` pada atribut serta metode **Getter dan Setter** untuk mengakses data.

---

### 2. NailArtService
Class ini digunakan untuk menyimpan data layanan nail art.

Atribut:
- `namaLayanan`
- `harga`

Atribut pada class ini bersifat `private` dan diakses melalui metode **Getter dan Setter**.

---

### 3. Reservation
Class ini digunakan untuk menyimpan data reservasi yang menghubungkan customer dengan layanan nail art serta tanggal reservasi.

Atribut:
- `customer`
- `layanan`
- `tanggal`

Class ini berperan sebagai penghubung antara data pelanggan dan layanan yang dipilih.

---

### 4. Main
Class utama yang berisi:
- Menu program
- Pengolahan CRUD
- Penyimpanan data menggunakan **ArrayList**

Class ini juga menangani interaksi pengguna melalui terminal/console.

---

# ⋆˚࿔ Tampilan Program

### Menu Program
![Menu Program](assets/menu.png)

---

### Tambah Reservasi
![Tambah Reservasi](assets/tambah.png)

---

### Lihat Reservasi
![Lihat Reservasi](assets/lihat.png)

---

### Update Reservasi
![Update Reservasi](assets/update.png)

---

### Hapus Reservasi
![Hapus Reservasi](assets/hapus.png)

---

# ⋆˚࿔ Konsep OOP yang Digunakan

Program ini menerapkan beberapa konsep dasar **Object Oriented Programming**, yaitu:

- Class dan Object
- Encapsulation
- Penggunaan ArrayList sebagai penyimpanan data
- Modularisasi program menggunakan beberapa class
- Access Modifier (public, private, protected, default)
- Getter dan Setter

---

Made with love by **Ghesya Rhegyta Al Rachman** ₍ᐢ. .ᐢ₎ ₊˚⊹♡

