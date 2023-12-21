Feature: Get Detail Career
  sebagai admin
  saya bisa mendapatkan detail karir
  sehingga saya bisa melihat detail karir yang ada

  Scenario: berhasil mendapatkan data detail karir
    Given saya menetapkan API endpoint untuk mendapatkan detail karir dengan memasukan ID valid
    When saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data detail karir

  Scenario: gagal mendapatkan data detail karir karena memasukan ID invalid
    Given saya menetapkan API endpoint untuk mendapatkan detail karir dengan memasukan ID invalid
    When saya mengirimkan request dengan invalid ID untuk mendapatkan detail karir
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

  Scenario: Gagal mendapatkan data detail karir tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan detail karir dengan memasukan ID valid
    When saya mengirimkan request untuk mendapatkan detail karir tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data detail karir tanpa menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan detail karir tanpa memasukan ID
    When saya mengirimkan request untuk mendapatkan detail karir tanpa memasukan ID
    Then saya mendapatkan status kode 200
    And saya menerima data karir

  Scenario: Gagal mendapatkan detail karir karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail karir
    When saya mengirimkan request untuk mendapatkan detail karir dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan detail karir karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail karir
    When saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method POST
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan detail karir karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail karir
    When saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method PUT
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mendapatkan detail karir karena menggunakan method DELETE
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail karir
    When saya mengirimkan request untuk mendapatkan detail karir dengan menggunakan method DELETE
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

