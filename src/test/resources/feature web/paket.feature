Feature:Sebagai Admin saya berhasil menambahkan Paket

  @paket
  Scenario: Admin berhasil menambahkan Paket
    Given Admin berada di halaman dashboard
    When Admin klik button paket
    And Admin klik button buat paket
    And Admin mengisi data paket
    And Admin klik button tambah
    Then paket berhasil ditambahkan
