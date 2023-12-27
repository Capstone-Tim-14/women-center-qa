Feature: Add Category Article
  sebagai user
  saya bisa membuat kategori artikel baru
  sehingga saya bisa menambahkan kategori pada sebuah artikel

  Scenario: berhasil membuat kategori artikel baru dengan memasukan data valid dan memakai token
    Given saya menetapkan Api endpoint untuk membuat kategori artikel baru
    When saya mengirimkan request untuk membuat kategori artikel dengan mengisi data valid
    Then saya menerima status kode 201
    And saya menerima pesan kategori artikel berhasil ditambahkan

  Scenario: gagal membuat kategori artikel baru dengan memasukan data Id invalid
    Given saya menetapkan Api endpoint untuk membuat kategori artikel baru dengan ID yang invalid
    When saya mengirimkan request untuk membuat kategori artikel dengan ID yang invalid
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal membuat kategori artikel baru karena mengosongkan field data
    Given saya menetapkan Api endpoint untuk membuat kategori artikel baru
    When saya mengirimkan request untuk membuat kategori artikel dengan mengosongkan field data
    Then saya menerima status kode 422
    And  saya menerima pesan error data yang wajib diisi

  Scenario: gagal membuat kategori artikel baru dengan menyisipkan data valid namun tidak memakai token
    Given saya menetapkan Api endpoint untuk membuat kategori artikel baru
    When saya mengirimkan request untuk membuat kategori artikel tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: gagal membuat kategori artikel baru karena mengisikan data yang sudah tersimpan
    Given saya menetapkan Api endpoint untuk membuat kategori artikel baru
    When saya mengirimkan request untuk membuat kategori artikel baru dengan mengisikan data yang sudah tersimpan
    Then saya menerima status kode 409
    And saya menerima pesan error email sudah terdaftar
