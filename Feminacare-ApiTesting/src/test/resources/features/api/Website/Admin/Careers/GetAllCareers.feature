Feature: Get All Careers
  sebagai admin
  saya bisa mendapatkan semua karir
  sehingga syaa bisa melihat semua karir yang ada

  Scenario: berhasil mendapatkan data karir
    Given saya menetapkan API endpoint untuk mendapatkan semua karir
    When saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data karir

  Scenario: Gagal mendapatkan data karir tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua karir
    When saya mengirimkan request untuk mendapatkan semua karir tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data karir dengan menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan semua karir dengan sebuah ID
    When saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan sebuah ID
    Then saya mendapatkan status kode 200
    And saya menerima data detail karir

  Scenario: Gagal mendapatkan data karir karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua karir
    When saya mengirimkan request untuk mendapatkan semua karir dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data karir karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua karir
    When saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method POST
    Then saya menerima status kode 400
    And saya menerima pesan error bad request

  Scenario: Gagal mendapatkan data karir karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua karir
    When saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method PUT
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data karir karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua karir
    When saya mengirimkan request untuk mendapatkan semua karir dengan menggunakan method DELETE
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

