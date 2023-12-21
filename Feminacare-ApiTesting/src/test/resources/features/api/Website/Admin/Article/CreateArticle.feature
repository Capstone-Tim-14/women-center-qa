Feature: Create Article
  sebagai user
  saya bisa membuat artikel baru
  sehingga saya bisa menambahkan artikel baru

  Scenario: berhasil membuat artikel baru dengan memasukan data valid, lengkap dan memakai token
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel dengan mengisi data lengkap dan valid
    Then saya menerima status kode 201
    And saya menerima pesan data berhasil dibuat

  Scenario: gagal membuat artikel baru karena memasukan data yang tidak lengkap
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel dengan mengisi data yang tidak lengkap
    Then saya menerima status kode 422
    And  saya menerima pesan error data yang wajib diisi

  Scenario: gagal membuat artikel baru karena mengosongkan seluruh field data
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel dengan mengosongkan seluruh field data
    Then saya menerima status kode 422
    And  saya menerima pesan error data yang wajib diisi

  Scenario: gagal membuat artikel baru dengan menyisipkan data lengkap namun tidak memakai token
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: gagal membuat artikel baru karena mengisikan data yang sudah tersimpan
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel baru dengan mengisikan data yang sudah tersimpan
    Then saya menerima status kode 409
    And saya menerima pesan error email sudah terdaftar

  Scenario: gagal membuat artikel baru karena menggunakan method Get
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel dengan menggunakan method Get
    Then saya mendapatkan status kode 200
    And saya menerima data artikel

  Scenario: gagal membuat artikel baru karena menggunakan method Put
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel dengan menggunakan method Put
    Then saya mendapatkan status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal membuat artikel baru karena menggunakan method Delete
    Given saya menetapkan Api endpoint untuk membuat artikel baru
    When saya mengirimkan request untuk membuat artikel dengan menggunakan method Delete
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found