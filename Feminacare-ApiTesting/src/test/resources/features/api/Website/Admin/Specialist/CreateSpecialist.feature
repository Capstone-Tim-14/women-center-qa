Feature: Create Specialist
  sebagai admin
  saya bisa membuat tag spesialis baru
  sehingga tag spesialis baru berhasil ditambahkan

  Scenario: berhasil menambahkan spesialis baru dengan memasukan data valid, lengkap dan menyisipkan token
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru dengan menyisipkan data dan token
    Then saya menerima status kode 201
    And saya menerima pesan sukses membuat spesialis baru

  Scenario: gagal menambahkan spesialis baru dengan memasukan data yang sudah tersimpan
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru dengan menyisipkan data yang sudah tersimpan
    Then saya menerima status kode 409
    And saya menerima pesan error email sudah terdaftar

  Scenario: Gagal menambahkan spesialis baru karena mengisikan data hanya di sebagian field
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru dengan mengisi sebagian data
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal menambahkan spesialis baru karena mengosongkan data
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru dengan mengosongkan data Spesialis
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal menambahkan spesialis baru dengan mengisi data namun tidak menggunakan token
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru tanpa menyisipkan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal menambahkan spesialis baru karena mengisikan data nama dengan yang sudah tersedia
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru namun mengisikan nama dengan nama yang sudah tersedia
    Then saya menerima status kode 409
    And saya menerima pesan error email sudah terdaftar

  Scenario: Gagal menambahkan spesialis baru dengan menggunakan endpoint yang salah
    Given saya menetapkan Api endpoint yang salah untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru dengan menggunakan Api endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menambahkan spesialis baru dengan menggunakan method GET
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk menambahkan spesialis baru dengan method GET
    Then saya mendapatkan status kode 200
    And saya menerima data tag artikel

  Scenario: Gagal menambahkan spesialis baru dengan menggunakan method PUT
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru dengan method PUT
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menambahkan spesialis baru dengan menggunakan method DELETE
    Given saya menetapkan Api endpoint untuk membuat spesialis baru
    When saya mengirimkan request untuk membuat spesialis baru dengan method DELETE
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found