Feature: Update Recomendation Career
  sebagai admin
  saya bisa mengedit status rekomendasi karir
  sehingga status rekomendasi karir berhasil diubah

  Background:
    Given saya menetapkan Api endpoint untuk mengedit status rekomendasi karir

  Scenario: Berhasil mengedit status artikel dengan memasukan data rekomendasi karir valid
    When saya mengirimkan request untuk mengedit status rekomendasi karir dengan memasukan data valid
    Then saya mendapatkan status kode 200
    And saya mendapatkan pesan status rekomendasi karir berhasil diubah

  Scenario: Gagal mengedit status rekomendasi karir dengan memasukan data status invalid
    When saya mengirimkan request untuk mengedit status rekomendasi karir dengan memasukan data invalid
    Then saya menerima status kode 400
    And saya menerima pesan error bad request

  Scenario: Gagal mengedit status rekomendasi karir dengan mengosongkan data status
    When saya mengirimkan request untuk mengedit status rekomendasi karir dengan mengosongkan data status
    Then saya menerima status kode 422
    And  saya menerima pesan error data yang wajib diisi




