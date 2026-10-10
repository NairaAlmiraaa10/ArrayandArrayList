 <div align="center">

# 🏦 Latihan ArrayList 

### Customer • BankAccount • Pengelolaan Rekening

![Java](https://img.shields.io/badge/Java-JDK-orange?style=for-the-badge\&logo=openjdk\&logoColor=white)
![ArrayList](https://img.shields.io/badge/Java-ArrayList-blue?style=for-the-badge)
![Encapsulation](https://img.shields.io/badge/🔒-Encapsulation-blueviolet?style=for-the-badge)

*Latihan mata kuliah **Pemrograman Berorientasi Objek (PBO)***

</div>

---

## 📖 Tentang Proyek

Proyek ini merupakan latihan untuk mempraktikkan penggunaan `ArrayList` dalam bahasa pemrograman Java serta penerapan konsep pemrograman berorientasi objek (OOP). Program ini digunakan untuk menyimpan data pelanggan, menghubungkan pelanggan dengan rekening bank, dan melakukan operasi pada data yang tersimpan di dalam daftar.

Terdapat tiga kelas yang saling berhubungan, yaitu `BankAccount` untuk mengelola rekening bank, `Customer` untuk menyimpan data pelanggan, dan `RunBank` sebagai kelas utama untuk menjalankan program serta menguji penggunaan `ArrayList`.

---

## 🌳 Struktur Kelas

```text
RunBank
   |
   |-- ArrayList<Customer>
   |       |
   |       |-- Customer 1
   |       |      └── BankAccount
   |       |
   |       |-- Customer 2
   |       |      └── BankAccount
   |       |
   |       └-- Customer 3
   |              └── BankAccount
   |
   └-- Operasi data pelanggan dan rekening
```

* `RunBank` merupakan kelas utama yang menjalankan program.
* `Customer` menyimpan nama depan, nama belakang, dan objek rekening pelanggan.
* `BankAccount` menyimpan saldo dan nomor rekening serta menyediakan operasi penyetoran dan penarikan uang.
* `ArrayList<Customer>` digunakan untuk menampung kumpulan objek pelanggan yang dapat ditambah atau dihapus.

---

## 📁 Daftar File

| 📄 File            | 📝 Keterangan                                                                                                            |
| ------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `BankAccount.java` | Kelas untuk mengelola nomor rekening, saldo, penyetoran, dan penarikan uang.                                             |
| `Customer.java`    | Kelas untuk menyimpan identitas pelanggan dan menghubungkannya dengan rekening bank.                                     |
| `RunBank.java`     | Program utama untuk membuat daftar pelanggan, menambahkan dan menghapus data, serta mengakses rekening setiap pelanggan. |

---

## 🧩 Penjelasan Kelas

### 🏦 `BankAccount`

Kelas `BankAccount` digunakan untuk mengelola data rekening bank milik pelanggan.

| Anggota                           | Keterangan                                                |
| --------------------------------- | --------------------------------------------------------- |
| `private int saldo`               | Menyimpan saldo rekening.                                 |
| `private int nomorrekening`       | Menyimpan nomor rekening.                                 |
| `static int nextnorek`            | Menentukan nomor rekening berikutnya, dimulai dari 1000.  |
| `static final int jumlahpengguna` | Menyimpan konstanta jumlah pengguna sebesar 100.          |
| `static int index`                | Variabel untuk menyimpan nilai indeks.                    |
| `BankAccount()`                   | Konstruktor untuk membuat rekening dengan nomor otomatis. |
| `getnomorrekening()`              | Menampilkan dan mengembalikan nomor rekening.             |
| `deposit(int depo)`               | Menambahkan uang ke saldo rekening.                       |
| `tarik(int narik)`                | Melakukan penarikan uang jika saldo mencukupi.            |

### 👤 `Customer`

Kelas `Customer` digunakan untuk menyimpan informasi pelanggan serta objek rekening yang dimilikinya.

| Anggota                                       | Keterangan                                             |
| --------------------------------------------- | ------------------------------------------------------ |
| `private String firstname`                    | Menyimpan nama depan pelanggan.                        |
| `private String lastname`                     | Menyimpan nama belakang pelanggan.                     |
| `private BankAccount account`                 | Menyimpan objek rekening pelanggan.                    |
| `Customer(String firstname, String lastname)` | Konstruktor untuk mengisi nama pelanggan.              |
| `getAccount()`                                | Mengambil objek rekening pelanggan.                    |
| `setAccount(BankAccount account)`             | Menghubungkan objek rekening dengan pelanggan.         |
| `getfirstname()`                              | Menampilkan dan mengembalikan nama depan pelanggan.    |
| `getlastname()`                               | Menampilkan dan mengembalikan nama belakang pelanggan. |

### 💻 `RunBank`

Kelas `RunBank` merupakan kelas utama yang menjalankan seluruh proses program.

| Kode                                                 | Keterangan                                           |
| ---------------------------------------------------- | ---------------------------------------------------- |
| `ArrayList<Customer> customers = new ArrayList<>();` | Membuat daftar untuk menyimpan objek pelanggan.      |
| `customers.add(...)`                                 | Menambahkan objek pelanggan ke dalam daftar.         |
| `customers.get(index)`                               | Mengakses pelanggan berdasarkan indeks.              |
| `customers.add(2, ...)`                              | Menambahkan pelanggan pada indeks ke-2.              |
| `setAccount(...)`                                    | Menghubungkan pelanggan dengan rekening bank.        |
| `getAccount()`                                       | Mengakses rekening milik pelanggan.                  |
| `tarik(50000)`                                       | Mencoba menarik uang sebesar Rp50.000 dari rekening. |

---

## 🧠 Penerapan Konsep Pemrograman

### 📋 1. ArrayList

```java
ArrayList<Customer> customers = new ArrayList<>();
```


```java
customers.add(new Customer("Naira", "Almira"));
customers.add(new Customer("Evalinda", "Gracia F."));
customers.add(new Customer(null, null));

customers.add(2, new Customer("Suci", "Mustika"));
```

### 🔒 2. Encapsulation (Enkapsulasi)
```java
private int saldo;
private int nomorrekening;
```

Pada kelas `Customer`, atribut identitas dan rekening juga dibuat `private`.

```java
private String firstname, lastname;
private BankAccount account;
```
Akses terhadap atribut dilakukan melalui method seperti `getfirstname()`, `getlastname()`, `getAccount()`, dan `setAccount()`.

### 🔗 3. Hubungan Antarobjek

```java
customers.get(0).setAccount(akun1);
```

```java
customers.get(0).getAccount().getnomorrekening();
customers.get(0).getAccount().tarik(50000);
```

---

## 🔄 Alur Program

1. Program membuat `ArrayList<Customer>` untuk menampung data pelanggan.
2. Program menambahkan tiga objek pelanggan dan membuat tiga objek rekening.
3. Setiap pelanggan awalnya dihubungkan dengan objek rekening menggunakan `setAccount()`.
4. Program menyisipkan pelanggan baru pada indeks ke-2 dan menghapus pelanggan pada indeks ke-1.
5. Program mengakses data pelanggan berdasarkan indeks, menampilkan nama dan nomor rekening, lalu mencoba menarik uang sebesar Rp50.000.

## 🖥️ Hasil Keluaran Program


<img width="260" height="318" alt="Screenshot 2026-10-10 082657" src="https://github.com/user-attachments/assets/39d115eb-937d-4742-8949-d77142afd9e3" />




## 👨‍🎓 Identitas Mahasiswa

| Keterangan      | Data                                 |
| --------------- | ------------------------------------ |
| **Nama**        | *Naira Almira*                       |
| **NIM**         | *F1D02510085*                        |
| **Kelas**       | B                                    |
| **Mata Kuliah** | Pemrograman Berorientasi Objek (PBO) |

</div>
