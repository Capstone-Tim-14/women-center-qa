Feature: Get All Articles
  sebagai user
  saya bisa mendapatkan semua artikel
  sehingga saya bisa melihat semua artikel yang ada

  Scenario: berhasil mendapatkan data artikel
    Given saya menetapkan API endpoint sebagai user untuk mendapatkan semua artikel
    When saya mengirimkan request sebagai user untuk mendapatkan semua artikel dengan menggunakan token
    Then saya mendapatkan status kode 200
    And saya menerima data artikel

  Scenario: berhasil mendapatkan data artikel sesuai dengan no halaman
    Given saya menetapkan API endpoint sebagai user untuk mendapatkan semua artikel berdasarkan halaman
    When saya mengirimkan request sebagai user untuk mendapatkan semua artikel berdasarkan halaman
    Then saya mendapatkan status kode 200
    And saya menerima data artikel sesuai no halaman


  Scenario: Gagal mendapatkan data artikel tanpa menyisipkan token
    Given saya menetapkan API endpoint sebagai user untuk mendapatkan semua artikel
    When saya mengirimkan request sebagai user untuk mendapatkan semua artikel tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal mendapatkan data artikel dengan menyisipkan ID valid
    Given saya menetapkan API endpoint sebagai user dengan sebuah ID untuk mendapatkan semua artikel
    When saya mengirimkan request sebagai user untuk mendapatkan semua artikel dengan menggunakan sebuah ID
    Then saya menerima status kode 404
    And saya menerima pesan error article Not Found

