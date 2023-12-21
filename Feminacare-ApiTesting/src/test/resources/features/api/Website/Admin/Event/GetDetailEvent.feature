Feature: Get Detail Event
  sebagai admin
  saya bisa mendapatkan detail event
  sehingga saya bisa melihat detail event yang ada

  Scenario: berhasil mendapatkan data detail event
    Given saya menetapkan API endpoint untuk mendapatkan detail event dengan memasukan ID valid
    When saya mengirimkan request untuk mendapatkan detail event dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data detail event

  Scenario: gagal mendapatkan data detail event karena memasukan ID invalid
    Given saya menetapkan API endpoint untuk mendapatkan detail event dengan memasukan ID invalid
    When saya mengirimkan request dengan invalid ID untuk mendapatkan detail event
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

  Scenario: Gagal mendapatkan data detail event tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan detail event dengan memasukan ID valid
    When saya mengirimkan request untuk mendapatkan detail event tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data detail event tanpa menyisipkan ID valid
    Given saya menetapkan API endpoint untuk mendapatkan detail event tanpa memasukan ID
    When saya mengirimkan request untuk mendapatkan detail event tanpa memasukan ID
    Then saya mendapatkan status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan detail event karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail event
    When saya mengirimkan request untuk mendapatkan detail event dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan detail event karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail event
    When saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method POST
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan detail event karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan detail event
    When saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method PUT
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  #Scenario: Gagal mendapatkan detail event karena menggunakan method DELETE
  #  Given saya menetapkan API endpoint yang salah untuk mendapatkan detail event
  #  When saya mengirimkan request untuk mendapatkan detail event dengan menggunakan method DELETE
  #  Then saya menerima status kode 404
  #  And saya menerima pesan error Not Found

