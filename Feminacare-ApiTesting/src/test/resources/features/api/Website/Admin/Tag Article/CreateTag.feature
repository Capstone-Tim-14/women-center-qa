Feature: Create Tag Article
  sebagai admin
  saya bisa membuat tag artikel baru
  sehingga tag artikel baru berhasil ditambahkan

  Scenario: berhasil menambahkan tag baru dengan memasukan data valid, lengkap dan menyisipkan token
    Given saya menetapkan Api endpoint untuk membuat tag baru
    When saya mengirimkan request untuk membuat tag baru dengan menyisipkan data dan token
    Then saya menerima status kode 201
    And saya menerima data tag yang berhasil ditambahkan

  Scenario: Gagal menambahkan tag baru karena mengisikan data hanya di sebagian field
    Given saya menetapkan Api endpoint untuk membuat tag baru
    When saya mengirimkan request untuk membuat tag baru dengan mengisi sebagian data
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal menambahkan tag baru karena mengosongkan data
    Given saya menetapkan Api endpoint untuk membuat tag baru
    When saya mengirimkan request untuk membuat tag baru dengan mengosongkan data role
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal menambahkan tag baru dengan mengisi data namun tidak menggunakan token
    Given saya menetapkan Api endpoint untuk membuat tag baru
    When saya mengirimkan request untuk membuat tag baru tanpa menyisipkan dan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal menambahkan tag baru karena mengisikan data nama dengan yang sudah tersedia
    Given saya menetapkan Api endpoint untuk membuat tag baru
    When saya mengirimkan request untuk membuat tag baru namun mengisikan nama dengan nama yang sudah tersedia
    Then saya menerima status kode 409
    And saya menerima pesan error email sudah terdaftar

  Scenario: Gagal menambahkan tag baru dengan menggunakan endpoint yang salah
    Given saya menetapkan Api endpoint yang salah untuk membuat tag baru
    When saya mengirimkan request untuk membuat tag baru dengan menggunakan Api endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menambahkan tag baru dengan menggunakan method GET
    Given saya menetapkan Api endpoint untuk membuat tag baru
    When saya mengirimkan request untuk menambahkan tag baru dengan method GET
    Then saya mendapatkan status kode 200
    And saya menerima data tag artikel

  Scenario: Gagal menambahkan tag baru dengan menggunakan method PUT
    Given saya menetapkan Api endpoint untuk membuat tag baru
    When saya mengirimkan request untuk membuat tag baru dengan method PUT
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal menambahkan tag artikel baru dengan menggunakan method DELETE
    When saya mengirimkan request untuk membuat tag baru dengan method DELETE
    Then saya menerima status kode 500
    And saya menerima pesan error record not found