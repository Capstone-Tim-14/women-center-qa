Feature: Get All Roles
  sebagai admin
  saya bisa mendapatkan semua roles
  sehingga syaa bisa melihat semua roles yang ada

  Scenario: berhasil mendapatkan data roles
    Given saya menetapkan API endpoint untuk mendapatkan semua roles
    When saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data roles

  Scenario: Gagal mendapatkan data roles tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua roles
    When saya mengirimkan request untuk mendapatkan semua roles tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data roles dengan menyisipkan ID valid
    Given saya menetapkan API endpoint dengan sebuah ID
    When saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data roles karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua roles
    When saya mengirimkan request untuk mendapatkan semua roles dengan API endpoint yang salah
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data roles karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua roles
    When saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method POST
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mendapatkan data roles karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua roles
    When saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method PUT
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data roles karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua roles
    When saya mengirimkan request untuk mendapatkan semua roles dengan menggunakan method DELETE
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

