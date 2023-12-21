Feature: Get All Counselors
  sebagai admin
  saya bisa mendapatkan semua konselor
  sehingga syaa bisa melihat semua konselor yang ada

  Scenario: berhasil mendapatkan data konselor
    Given saya menetapkan API endpoint untuk mendapatkan semua konselor
    When saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data konselor

  Scenario: Gagal mendapatkan data konselor tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua konselor
    When saya mengirimkan request untuk mendapatkan semua konselor tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data konselor dengan menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan semua konselor dengan sebuah ID
    When saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data konselor karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua konselor
    When saya mengirimkan request untuk mendapatkan semua konselor dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data konselor karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua konselor
    When saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method POST
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data konselor karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua konselor
    When saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method PUT
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data konselor karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua konselor
    When saya mengirimkan request untuk mendapatkan semua konselor dengan menggunakan method DELETE
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

