Feature:Sebagai Admin saya berhasil menambahkan Karier

  @karier
  Scenario: Admin berhasil menambahkan Karier
    Given Admin berada di halaman dashboard
    When Admin klik button karier
    And Admin klik button tambah karier
    And Admin mengisi data karier
    And Admin klik button simpan
    Then karier berhasil ditambahkan
