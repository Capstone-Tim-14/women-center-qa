Feature: Update Event
  sebagai user
  saya bisa mengupdate data Event
  sehingga data Event berhasil diubah

  Scenario: Berhasil mengupdate data Event
    Given saya menetapkan Api endpoint untuk mengupdate data event dengan ID valid
    When saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field menggunakan method Put
    Then saya mendapatkan status kode 200
    And saya menerima pesan data event berhasil diperbaharui

  Scenario: Gagal mengupdate data Event karena hanya melakukan update pada beberapa field
    Given saya menetapkan Api endpoint untuk mengupdate data event dengan ID valid
    When saya mengirimkan request untuk mengupdate data event dengan mengirimkan data beberapa field menggunakan method Put
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data Event karena hanya tidak menyisipkan data sama sekali
    Given saya menetapkan Api endpoint untuk mengupdate data event dengan ID valid
    When saya mengirimkan request untuk mengupdate data event dengan mengosongkan data
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data Event dengan memasukan data lengkap seluruh field namun menggunakan ID invalid
    Given saya menetapkan Api endpoint untuk mengupdate data event dengan ID invalid
    When saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field namun dengan ID invalid
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Berhasil mengupdate data Event karena mengedit dengan data yang sudah tersedia
    Given saya menetapkan Api endpoint untuk mengupdate data event dengan ID valid
    When saya mengirimkan request untuk mengupdate data event dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia
    Then saya mendapatkan status kode 200
    And saya menerima pesan data event berhasil diperbaharui




