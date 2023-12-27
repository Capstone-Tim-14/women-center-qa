Feature: Create Schedule
  sebagai admin
  saya bisa membuat jadwal baru
  sehingga saya bisa menambahkan jadwal baru

  Scenario: berhasil membuat jadwal baru dengan memasukan data valid, lengkap dan memakai token
    Given saya menetapkan Api endpoint untuk membuat jadwal baru
    When saya mengirimkan request untuk membuat jadwal dengan mengisi data lengkap dan valid
    Then saya menerima status kode 201
    And saya menerima jadwal berhasil dibuat

  Scenario: berhasil membuat jadwal baru dengan memasukan ID yang invalid
    Given saya menetapkan Api endpoint untuk membuat jadwal baru dengan ID yang invalid
    When saya mengirimkan request untuk membuat jadwal dengan menggunakan ID yang invalid
    Then saya menerima status kode 201
    And saya menerima jadwal karir berhasil dibuat

  Scenario: gagal membuat jadwal baru karena memasukan data yang tidak lengkap
    Given saya menetapkan Api endpoint untuk membuat jadwal baru
    When saya mengirimkan request untuk membuat jadwal dengan mengisi data yang tidak lengkap
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: gagal membuat jadwal baru karena mengosongkan seluruh field data
    Given saya menetapkan Api endpoint untuk membuat jadwal baru
    When saya mengirimkan request untuk membuat jadwal dengan mengosongkan seluruh field data
    Then saya menerima status kode 422
    And saya menerima pesan error data yang wajib diisi

  Scenario: gagal membuat jadwal baru dengan menyisipkan data lengkap namun tidak memakai token
    Given saya menetapkan Api endpoint untuk membuat jadwal baru
    When saya mengirimkan request untuk membuat jadwal tanpa menggunakan token
    Then saya menerima status kode 401
    And saya menerima pesan error unauthorized

  Scenario: gagal membuat jadwal baru karena mengisikan jadwal untuk hari yang sudah penuh
    Given saya menetapkan Api endpoint untuk membuat jadwal baru
    When saya mengirimkan request untuk membuat jadwal di hari yang sudah penuh
    Then saya menerima status kode 409
    And saya menerima pesan error email sudah terdaftar

