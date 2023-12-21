Feature: Get All Recomendation Careers
  sebagai admin
  saya bisa mendapatkan semua rekomendasi karir
  sehingga saya bisa melihat semua rekomendasi karir yang ada

  Scenario: berhasil mendapatkan data rekomendasi karir
    Given saya menetapkan API endpoint untuk mendapatkan semua rekomendasi karir
    When saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data rekomendasi karir

  Scenario: Gagal mendapatkan data rekomendasi karir tanpa menyisipkan token
    Given saya menetapkan API endpoint untuk mendapatkan semua rekomendasi karir
    When saya mengirimkan request untuk mendapatkan semua rekomendasi karir tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data rekomendasi karir karena menetapkan endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua rekomendasi karir
    When saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan API endpoint yang salah
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data rekomendasi karir karena menggunakan method POST
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua rekomendasi karir
    When saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan method POST
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found

  Scenario: Gagal mendapatkan data rekomendasi karir karena menggunakan method PUT
    Given saya menetapkan API endpoint yang salah untuk mendapatkan semua rekomendasi karir
    When saya mengirimkan request untuk mendapatkan semua rekomendasi karir dengan menggunakan method PUT
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi



