Feature: Login user
  Sebagai user
  saya bisa melakukan login
  sehingga saya bisa mendapatkan token

  Scenario: Berhasil login dengan memasukan data yang valid
    Given saya menetapkan API endpoint untuk login user
    When saya mengirimkan request untuk melakukan login dengan memasukan email dan password valid
    Then saya mendapatkan status kode 200
    And saya mendapatkan token login

  Scenario: Gagal login dengan memasukan data yang invalid
    Given saya menetapkan API endpoint untuk login user
    When saya mengirimkan request untuk melakukan login dengan memasukan email dan password invalid
    Then saya menerima status kode 401
    And saya mendapatkan pesan error data tidak valid

  Scenario: Gagal login dengan memasukan email valid namun password invalid
    Given saya menetapkan API endpoint untuk login user
    When saya mengirimkan request untuk melakukan login dengan memasukan email valid namun password invalid
    Then saya menerima status kode 401
    And saya mendapatkan pesan error data tidak valid

  Scenario: Gagal login dengan mengosongkan sebagian field
    Given saya menetapkan API endpoint untuk melakukan login user
    When saya mengirimkan request untuk melakukan login dengan memasukan email namun mengosongkan password
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal login dengan mengosongkan email dan password
    Given saya menetapkan API endpoint untuk login user
    When saya mengirimkan request untuk melakukan login dengan mengosongkan email dan password
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: Gagal login dengan memasukan data yang valid namun memakai method Get
    Given saya menetapkan API endpoint untuk login user
    When saya mengirimkan request untuk melakukan login dengan method GET dan memasukan data valid
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal login dengan memasukan data yang valid namun memakai method Put
    Given saya menetapkan API endpoint untuk login user
    When saya mengirimkan request untuk melakukan login dengan method PUT dan memasukan data valid
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal login dengan memasukan data yang valid namun memakai method Delete
    Given saya menetapkan API endpoint untuk login user
    When saya mengirimkan request untuk melakukan login dengan method DELETE dan memasukan data valid
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: Gagal login dengan memasukan data yang valid namun endpoint yang salah
    Given saya menetapkan API endpoint yang salah untuk login user
    When saya mengirimkan request untuk melakukan login ke endpoint yang salah dengan memasukan email dan password valid
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized


