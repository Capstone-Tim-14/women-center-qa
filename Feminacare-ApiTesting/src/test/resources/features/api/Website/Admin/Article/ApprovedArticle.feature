Feature: Approved Article
  sebagai admin
  saya bisa mengedit status artikel
  sehingga status artikel berhasil diubah

  Scenario: Berhasil mengedit status artikel dengan memasukan data status valid
    Given saya menetapkan Api endpoint untuk mengedit status artikel
    When saya mengirimkan request untuk mengedit status artikel dengan memasukan data valid
    Then saya menerima status kode 201
    And saya mendapatkan pesan status artikel berhasil diubah

  Scenario: Gagal mengedit status artikel dengan memasukan data status invalid
    Given saya menetapkan Api endpoint untuk mengedit status artikel
    When saya mengirimkan request untuk mengedit status artikel dengan memasukan data invalid
    Then saya menerima status kode 400
    And saya menerima pesan error bad request

  Scenario: Gagal mengedit status artikel dengan mengosongkan data status
    Given saya menetapkan Api endpoint untuk mengedit status artikel
    When saya mengirimkan request untuk mengedit status artikel dengan mengosongkan data status
    Then saya menerima status kode 422
    And  saya menerima pesan error data yang wajib diisi




