Feature: Delete Tag Article
  sebagai admin
  saya bisa menghapus tag artikel berdasarkan ID
  sehingga tag artikel tsb berhasil dihapus


  Scenario: Berhasil menghapus tag artikel berdasarkan ID valid dan memasukan token
    Given saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus tag artikel berdasarkan ID dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima pesan data berhasil dihapus

  Scenario: Gagal menghapus tag artikel berdasarkan ID tidak valid
    Given saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus tag artikel berdasarkan ID invalid dengan menggunakan token
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

  Scenario: Gagal menghapus tag artikel karena tidak menggunakan ID
    Given saya menetapkan Api Endpoint untuk menghapus tag artikel tanpa menggunakan ID
    When saya mengirimkan request untuk menghapus tag artikel tanpa menggunakan ID
    Then saya menerima status kode 500
    And saya menerima pesan error record not found

  Scenario: Gagal menghapus tag artikel berdasarkan ID yang valid namun tidak menggunakan token
    Given saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus tag artikel berdasarkan ID yang valid namun tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal menghapus tag artikel karena menggunakan method GET
    Given saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus tag artikel menggunakan method GET
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menghapus tag artikel karena menggunakan method POST
    Given saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus tag artikel menggunakan method POST
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menghapus tag artikel karena menggunakan method PUT
    Given saya menetapkan Api Endpoint untuk menghapus tag artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus tag artikel menggunakan method PUT
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal menghapus tag artikel berdasarkan ID karena menggunakan endpoint yang salah
    Given saya menetapkan Api Endpoint yang salah untuk menghapus tag artikel berdasarkan ID invalid
    When saya mengirimkan request untuk menghapus tag artikel berdasarkan ID dengan menggunakan token
    Then saya menerima status kode 500
    And saya menerima pesan error record not found