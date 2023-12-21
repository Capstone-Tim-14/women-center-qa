Feature: Get All Specialist
  sebagai admin
  saya bisa mendapatkan semua spesialis
  sehingga saya bisa melihat semua spesialis yang ada

  Scenario: berhasil mendapatkan data spesialis
    Given saya menetapkan API endpoint untuk mendapatkan semua spesialis
    When saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data spesialis

  Scenario: Gagal mendapatkan data spesialis tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua spesialis
    When saya mengirimkan request untuk mendapatkan semua spesialis tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data spesialis dengan menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan semua spesialis dengan sebuah ID
    When saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data spesialis karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua spesialis
    When saya mengirimkan request untuk mendapatkan semua spesialis dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data spesialis karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua spesialis
    When saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method POST
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mendapatkan data spesialis karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua spesialis
    When saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method PUT
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data spesialis karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua spesialis
    When saya mengirimkan request untuk mendapatkan semua spesialis dengan menggunakan method DELETE
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

