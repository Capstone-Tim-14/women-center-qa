Feature: Get All Events
  sebagai admin
  saya bisa mendapatkan semua event
  sehingga syaa bisa melihat semua event yang ada

  Scenario: berhasil mendapatkan data event
    Given saya menetapkan API endpoint untuk mendapatkan semua event
    When saya mengirimkan request untuk mendapatkan semua event dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data event

  Scenario: Gagal mendapatkan data event tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua event
    When saya mengirimkan request untuk mendapatkan semua event tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data event dengan menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan semua event dengan sebuah ID
    When saya mengirimkan request untuk mendapatkan semua event dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data event karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua event
    When saya mengirimkan request untuk mendapatkan semua event dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data event karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua event
    When saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method POST
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data event karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua event
    When saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method PUT
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data event karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua event
    When saya mengirimkan request untuk mendapatkan semua event dengan menggunakan method DELETE
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

