Feature: Delete career
  sebagai admin
  saya bisa menghapus karir berdasarkan ID
  sehingga karir tsb berhasil dihapus


  Scenario: Berhasil menghapus karir berdasarkan ID valid dan memasukan token
    Given saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID valid
    When saya mengirimkan request untuk menghapus karir berdasarkan ID dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima pesan data karir berhasil dihapus

  Scenario: Gagal menghapus karir berdasarkan ID tidak valid
    Given saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID invalid
    When saya mengirimkan request untuk menghapus karir berdasarkan ID invalid dengan menggunakan token
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menghapus karir karena tidak menggunakan ID
    Given saya menetapkan Api Endpoint untuk menghapus karir tanpa menggunakan ID
    When saya mengirimkan request untuk menghapus karir tanpa menggunakan ID
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menghapus karir berdasarkan ID yang valid namun tidak menggunakan token
    Given saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID valid
    When saya mengirimkan request untuk menghapus karir berdasarkan ID yang valid namun tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal menghapus karir karena menggunakan method GET
    Given saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID valid
    When saya mengirimkan request untuk menghapus karir menggunakan method GET
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

  Scenario: Gagal menghapus karir karena menggunakan method POST
    Given saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID valid
    When saya mengirimkan request untuk menghapus karir menggunakan method POST
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menghapus karir karena menggunakan method PUT
    Given saya menetapkan Api Endpoint untuk menghapus karir berdasarkan ID valid
    When saya mengirimkan request untuk menghapus karir menggunakan method PUT
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal menghapus karir berdasarkan ID karena menggunakan endpoint yang salah
    Given saya menetapkan Api Endpoint yang salah untuk menghapus karir berdasarkan ID valid
    When saya mengirimkan request untuk menghapus karir dengan endpoint yang salah
    Then saya mendapatkan status kode 404
    And saya menerima pesan error Not Found