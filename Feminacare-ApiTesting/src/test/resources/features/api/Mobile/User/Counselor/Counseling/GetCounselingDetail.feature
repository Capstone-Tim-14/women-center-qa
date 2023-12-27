Feature: Get Counseling Detail
  sebagai konselor
  saya bisa mendapatkan detail konseling
  sehingga saya bisa melihat detail konseling

  Scenario: berhasil mendapatkan data detail konseling
    Given saya menetapkan API endpoint untuk mendapatkan detail konseling dengan memasukan ID valid
    When saya mengirimkan request untuk mendapatkan detail konseling dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data detail konseling

  Scenario: gagal mendapatkan data detail konseling karena memasukan ID invalid
    Given saya menetapkan API endpoint untuk mendapatkan detail konseling dengan memasukan ID invalid
    When saya mengirimkan request dengan invalid ID untuk mendapatkan detail konseling
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

  Scenario: Gagal mendapatkan data detail konseling tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan detail konseling dengan memasukan ID valid
    When saya mengirimkan request untuk mendapatkan detail konseling tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data detail konseling tanpa menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan detail konseling tanpa memasukan ID
    When saya mengirimkan request untuk mendapatkan detail konseling tanpa memasukan ID
    Then saya mendapatkan status kode 200
    And saya menerima data detail konseling

  Scenario: Gagal mendapatkan detail konseling karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail konseling
    When saya mengirimkan request untuk mendapatkan detail konseling dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

