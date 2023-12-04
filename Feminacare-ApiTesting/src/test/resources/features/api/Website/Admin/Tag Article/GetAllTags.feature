Feature: Get All Tags
  sebagai admin
  saya bisa mendapatkan semua tag artikel
  sehingga syaa bisa melihat semua tag artikel yang ada

  Scenario: berhasil mendapatkan data tag artikel
    Given saya menetapkan API endpoint untuk mendapatkan semua tag artikel
    When saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data tag artikel

  Scenario: Gagal mendapatkan data tag artikel tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua tag artikel
    When saya mengirimkan request untuk mendapatkan semua tag artikel tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data tag artikel dengan menyisipkan ID valid
    Given saya menetapkan API endpoint dengan sebuah ID untuk mendapatkan tag artikel
    When saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data tag artikel karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua tag artikel
    When saya mengirimkan request untuk mendapatkan semua tag artikel dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data tag artikel karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua tag artikel
    When saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method POST
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mendapatkan data tag artikel karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua tag artikel
    When saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method PUT
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mendapatkan data tag artikel karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua tag artikel
    When saya mengirimkan request untuk mendapatkan semua tag artikel dengan menggunakan method DELETE
    Then saya menerima status kode 500
    And saya menerima pesan error record not found