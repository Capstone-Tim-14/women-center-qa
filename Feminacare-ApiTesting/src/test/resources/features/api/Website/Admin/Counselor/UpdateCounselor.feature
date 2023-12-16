Feature: Update Counselor
  sebagai user
  saya bisa mengupdate data konselor
  sehingga data konselor berhasil diubah

  Scenario: Berhasil mengupdate data konselor
    Given saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid
    When saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Put
    Then saya mendapatkan status kode 200
    And saya menerima pesan data konselor berhasil diperbaharui

  Scenario: Gagal mengupdate data konselor karena hanya melakukan update pada beberapa field
    Given saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid
    When saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data beberapa field menggunakan method Put
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data konselor karena hanya tidak menyisipkan data sama sekali
    Given saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid
    When saya mengirimkan request untuk mengupdate data konselor dengan mengosongkan data
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal mengupdate data konselor dengan memasukan data lengkap seluruh field namun menggunakan ID invalid
    Given saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID invalid
    When saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field namun dengan ID invalid
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal mengupdate data konselor karena mengedit dengan data yang sudah tersedia
    Given saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid
    When saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan menggunakan data yang sudah tersedia
    Then saya mendapatkan status kode 200
    And saya menerima pesan data konselor berhasil diperbaharui


  Scenario: gagal mengupdate data konselor menggunakan method Get
    Given saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid
    When saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Get
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal mengupdate data konselor menggunakan method Post
    Given saya menetapkan Api endpoint untuk mengupdate data konselor dengan ID valid
    When saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan method Post
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal mengupdate data konselor menggunakan Api endpoint yang salah
    Given saya menetapkan Api endpoint yang salah untuk mengupdate data konselor
    When saya mengirimkan request untuk mengupdate data konselor dengan mengirimkan data lengkap seluruh field menggunakan endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

