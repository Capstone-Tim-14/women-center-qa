Feature: Create Role
  sebagai admin
  saya bisa membuat role baru
  sehingga saya bisa menambahkan role baru

  Scenario: berhasil menambahkan role baru dengan mengisi data dan menggunakan token
    Given saya menetapkan Api endpoint untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru dengan menyisipkan data dan token
    Then saya menerima status kode 201
    And saya menerima data role yang berhasil ditambahkan

  Scenario: gagal menambahkan role baru dengan mengisi data yang sudah tersimpan dan menggunakan token
    Given saya menetapkan Api endpoint untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru dengan menyisipkan data yang sudah tersimpan
    Then saya menerima status kode 201
    And saya menerima data role yang berhasil ditambahkan

  Scenario: Gagal menambahkan role baru karena mengosongkan data
    Given saya menetapkan Api endpoint untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru dengan mengosongkan data role
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal menambahkan role baru dengan mengisi data namun tidak menggunakan token
    Given saya menetapkan Api endpoint untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru tanpa menyisipkan dan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal menambahkan role baru dengan menggunakan endpoint yang salah
    Given saya menetapkan Api endpoint yang salah untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru dengan menggunakan Api endpoint yang salah
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal menambahkan role baru dengan menggunakan method GET
    Given saya menetapkan Api endpoint untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru dengan method GET
    Then saya mendapatkan status kode 200
    And saya menerima data roles

  Scenario: Gagal menambahkan role baru dengan menggunakan method PUT
    Given saya menetapkan Api endpoint untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru dengan method PUT
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal menambahkan role baru dengan menggunakan method DELETE
    Given saya menetapkan Api endpoint untuk membuat role baru
    When saya mengirimkan request untuk membuat role baru dengan method DELETE
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized