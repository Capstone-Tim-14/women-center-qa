Feature: Create Career
  sebagai user
  saya bisa membuat karir baru
  sehingga saya bisa menambahkan karir baru

  Scenario: berhasil membuat karir baru dengan memasukan data valid, lengkap dan memakai token
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir dengan mengisi data lengkap dan valid
    Then saya menerima status kode 201

  Scenario: gagal membuat karir baru karena memasukan data yang tidak lengkap
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir dengan mengisi data yang tidak lengkap
    Then saya menerima status kode 400

  Scenario: gagal membuat karir baru karena mengosongkan seluruh field data
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir dengan mengosongkan seluruh field data
    Then saya menerima status kode 400

  Scenario: gagal membuat karir baru dengan menyisipkan data lengkap namun tidak memakai token
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: gagal membuat karir baru karena mengisikan data yang sudah tersimpan
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir baru dengan mengisikan data yang sudah tersimpan
    Then saya menerima status kode 409

  Scenario: gagal membuat karir baru karena menggunakan method Get
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir dengan menggunakan method Get
    Then saya mendapatkan status kode 200

  Scenario: gagal membuat karir baru karena menggunakan method Put
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir dengan menggunakan method Put
    Then saya mendapatkan status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal membuat karir baru karena menggunakan method Delete
    Given saya menetapkan Api endpoint untuk membuat karir baru
    When saya mengirimkan request untuk membuat karir dengan menggunakan method Delete
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found