Feature: Get All Articles
  sebagai admin
  saya bisa mendapatkan semua artikel
  sehingga syaa bisa melihat semua artikel yang ada

  Scenario: berhasil mendapatkan data artikel
    Given saya menetapkan API endpoint untuk mendapatkan semua artikel
    When saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data artikel

  Scenario: Gagal mendapatkan data artikel tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua artikel
    When saya mengirimkan request untuk mendapatkan semua artikel tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data artikel dengan menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan semua artikel dengan sebuah ID
    When saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data artikel karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel
    When saya mengirimkan request untuk mendapatkan semua artikel dengan API endpoint yang salah
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data artikel karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel
    When saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method POST
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mendapatkan data artikel karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel
    When saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method PUT
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data artikel karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua artikel
    When saya mengirimkan request untuk mendapatkan semua artikel dengan menggunakan method DELETE
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

