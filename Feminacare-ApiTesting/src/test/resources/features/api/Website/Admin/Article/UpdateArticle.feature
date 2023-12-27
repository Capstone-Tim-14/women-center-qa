Feature: Update Article
  sebagai user
  saya bisa mengupdate data artikel
  sehingga data artikel berhasil diubah

  Scenario: Berhasil mengupdate data artikel
    Given saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid
    When saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Put
    Then saya mendapatkan status kode 200
    And saya menerima pesan data artikel berhasil diperbaharui

  Scenario: Gagal mengupdate data artikel karena hanya melakukan update pada beberapa field
    Given saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid
    When saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data beberapa field menggunakan method Put
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data artikel karena hanya tidak menyisipkan data sama sekali
    Given saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid
    When saya mengirimkan request untuk mengupdate data artikel dengan mengosongkan data
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data artikel dengan memasukan data lengkap seluruh field namun menggunakan ID invalid
    Given saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID invalid
    When saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field namun dengan ID invalid
    Then saya menerima status kode 404
    And saya menerima pesan error artikel tidak ditemukan

  Scenario: Berhasil mengupdate data artikel karena mengedit dengan data yang sudah tersedia
    Given saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid
    When saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia
    Then saya mendapatkan status kode 200
    And saya menerima pesan data artikel berhasil diperbaharui


  Scenario: gagal mengupdate data artikel menggunakan method Get
    Given saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid
    When saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Get
    Then saya menerima status kode 404
    And saya menerima pesan error artikel tidak ditemukan

  Scenario: gagal mengupdate data artikel menggunakan method Post
    Given saya menetapkan Api endpoint untuk mengupdate data artikel dengan ID valid
    When saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan method Post
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal mengupdate data artikel menggunakan Api endpoint yang salah
    Given saya menetapkan Api endpoint yang salah untuk mengupdate data artikel
    When saya mengirimkan request untuk mengupdate data artikel dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error artikel tidak ditemukan

