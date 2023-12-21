Feature: Create Event
  sebagai admin
  saya bisa membuat event baru
  sehingga saya bisa menambahkan event baru

  Scenario: berhasil membuat event baru dengan memasukan data valid, lengkap dan memakai token
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event dengan mengisi data lengkap dan valid
    Then saya menerima status kode 201
    And saya menerima pesan karir berhasil dibuat

  Scenario: gagal membuat event baru karena memasukan data yang tidak lengkap
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event dengan mengisi data yang tidak lengkap
    Then saya menerima status kode 400


  Scenario: gagal membuat event baru karena mengosongkan seluruh field data
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event dengan mengosongkan seluruh field data
    Then saya menerima status kode 400

  Scenario: gagal membuat event baru dengan menyisipkan data lengkap namun tidak memakai token
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: gagal membuat event baru karena mengisikan data yang sudah tersimpan
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event baru dengan mengisikan data yang sudah tersimpan
    Then saya menerima status kode 409

  Scenario: gagal membuat event baru karena menggunakan method Get
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event dengan menggunakan method Get
    Then saya mendapatkan status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal membuat event baru karena menggunakan method Put
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event dengan menggunakan method Put
    Then saya mendapatkan status kode 404
    And saya menerima pesan error Not Found

  Scenario: gagal membuat event baru karena menggunakan method Delete
    Given saya menetapkan Api endpoint untuk membuat event baru
    When saya mengirimkan request untuk membuat event dengan menggunakan method Delete
    Then saya menerima status kode 404
    And saya menerima pesan error Not Found