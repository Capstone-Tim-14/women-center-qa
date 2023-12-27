Feature: Update Career
  sebagai user
  saya bisa mengupdate data karir
  sehingga data karir berhasil diubah

  Scenario: Berhasil mengupdate data karir
    Given saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid
    When saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Put
    Then saya mendapatkan status kode 200
    And saya menerima pesan data karir berhasil diperbaharui

  Scenario: Gagal mengupdate data karir karena hanya melakukan update pada beberapa field
    Given saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid
    When saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data beberapa field menggunakan method Put
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data karir karena hanya tidak menyisipkan data sama sekali
    Given saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid
    When saya mengirimkan request untuk mengupdate data karir dengan mengosongkan data
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data karir dengan memasukan data lengkap seluruh field namun menggunakan ID invalid
    Given saya menetapkan Api endpoint untuk mengupdate data karir dengan ID invalid
    When saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field namun dengan ID invalid
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

  Scenario: Berhasil mengupdate data karir karena mengedit dengan data yang sudah tersedia
    Given saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid
    When saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia
    Then saya mendapatkan status kode 200
    And saya menerima pesan data karir berhasil diperbaharui


  Scenario: gagal mengupdate data karir menggunakan method Get
    Given saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid
    When saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Get
    Then saya mendapatkan status kode 200
    And saya menerima data detail karir

  Scenario: gagal mengupdate data karir menggunakan method Post
    Given saya menetapkan Api endpoint untuk mengupdate data karir dengan ID valid
    When saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan method Post
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal mengupdate data karir menggunakan Api endpoint yang salah
    Given saya menetapkan Api endpoint yang salah untuk mengupdate data karir
    When saya mengirimkan request untuk mengupdate data karir dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

