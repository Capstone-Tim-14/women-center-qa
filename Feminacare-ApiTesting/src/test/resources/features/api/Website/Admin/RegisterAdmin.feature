Feature: Register Admin
  sebagai user
  saya bisa melakukan registrasi
  sehingga saya bisa melakukan login

  Scenario: berhasil melakukan registrasi dengan memasukan data yang lengkap dan valid di request body
    Given saya menetapkan API endpoint
    When saya mengirimkan request dengan memasukan data yang lengkap dan valid
    Then saya menerima status kode 201
    And saya menerima data valid yang berhasil ditambahkan

  Scenario: gagal melakukan registrasi karena mengosongkan request body
    Given saya menetapkan API endpoint
    When saya mengirimkan request dengan mengosongkan data
    Then saya menerima status kode 422
    And saya menerima pesan error

  Scenario: gagal melakukan registrasi karena memasukan yang data yang tidak lengkap
    Given saya menetapkan API endpoint
    When saya mengirimkan request dengan memasukan data yang tidak lengkap
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: gagal melakukan registrasi karena memasukan yang email yang telah terdaftar
    Given saya menetapkan API endpoint
    When saya mengirimkan request dengan memasukan data yang sudah terdaftar
    Then saya menerima status kode 409
    And saya menerima pesan error email sudah terdaftar

  Scenario: gagal melakukan registrasi dengan memasukan data yang lengkap dan valid namun memakai method delete
    Given saya menetapkan API endpoint
    When saya mengirimkan request dengan memasukan data yang lengkap dan valid namun memakai method get
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: gagal melakukan registrasi dengan memasukan data yang lengkap dan valid namun memakai method put
    Given saya menetapkan API endpoint
    When saya mengirimkan request dengan memasukan data yang lengkap dan valid namun memakai method put
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: gagal melakukan registrasi dengan memasukan data yang lengkap dan valid namun memakai endpoint yang salah
    Given saya menetapkan API endpoint yang salah
    When saya mengirimkan request dengan memasukan data yang lengkap dan valid
    Then saya menerima status kode 409
    And saya menerima pesan error unauthorized