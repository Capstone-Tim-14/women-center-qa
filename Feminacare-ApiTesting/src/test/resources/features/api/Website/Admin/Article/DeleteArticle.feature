Feature: Delete Article
  sebagai admin
  saya bisa menghapus artikel berdasarkan ID
  sehingga artikel tsb berhasil dihapus


  Scenario: Berhasil menghapus artikel berdasarkan ID valid dan memasukan token
    Given saya menetapkan Api Endpoint untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel berdasarkan ID dengan menggunakan token
    Then saya menerima status code 200
    And ...

  Scenario: Gagal menghapus artikel berdasarkan ID tidak valid
    Given saya menetapkan Api Endpoint untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel berdasarkan ID invalid dengan menggunakan token
    Then saya menerima status code ...
    And saya menerima ...

  Scenario: Gagal menghapus artikel berdasarkan ID yang valid namun tidak menggunakan token
    Given saya menetapkan Api Endpoint untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel berdasarkan ID yang valid namun tanpa menggunakan token
    Then saya menerima status code 200
    And ...

  Scenario: Gagal menghapus artikel karena menggunakan method Create
    Given saya menetapkan Api Endpoint untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel menggunakan method GET
    Then saya menerima status code ...
    And ...

  Scenario: Gagal menghapus artikel karena menggunakan method Create
    Given saya menetapkan Api Endpoint untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel menggunakan method PUT
    Then saya menerima status code ...
    And ...

  Scenario: Gagal menghapus artikel karena menggunakan method Create
    Given saya menetapkan Api Endpoint untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel menggunakan method POST
    Then saya menerima status code ...
    And ...

  Scenario: Gagal menghapus artikel berdasarkan ID karena menggunakan endpoint yang salah
    Given saya menetapkan Api Endpoint yang salah untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel berdasarkan ID dengan menggunakan token
    Then saya menerima status code ...
    And ...

  Scenario: Gagal menghapus artikel berdasarkan ID karena tidak menetapkan ID yang ingin dihapus
    Given saya menetapkan Api Endpoint untuk menghapus artikel berdasarkan ID valid
    When saya mengirimkan request untuk menghapus artikel tanpa ID
    Then saya menerima status code ...
    And ...