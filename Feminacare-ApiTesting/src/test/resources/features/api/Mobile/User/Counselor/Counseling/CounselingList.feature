Feature: Get List Counseling Session
  sebagai admin
  saya bisa mendapatkan semua sesi konseling yang terdaftar
  sehingga saya bisa melihat semua sesi konseling yang terdaftar

  Scenario: berhasil mendapatkan data sesi konseling
    Given saya menetapkan API endpoint untuk mendapatkan semua sesi konseling
    When saya mengirimkan request untuk mendapatkan semua sesi konseling dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data sesi konseling

  Scenario: Gagal mendapatkan data sesi konseling tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua sesi konseling
    When saya mengirimkan request untuk mendapatkan semua sesi konseling tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data sesi konseling dengan menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan semua sesi konseling dengan sebuah ID
    When saya mengirimkan request untuk mendapatkan semua sesi konseling dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data konselor karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua konselor
    When saya mengirimkan request untuk mendapatkan semua konselor dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

