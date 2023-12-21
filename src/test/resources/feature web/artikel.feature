Feature:Sebagai Admin saya berhasil menambahkan Artikel

  @artikel
  Scenario: Admin berhasil menambahkan Artikel
    Given Admin berada di halaman dashboard
    When Admin klik button artikel
    And Admin klik button buat artikel
    And Admin mengisi data artike
    And Admin klik button publikasikan
    Then artikel berhasil ditambahkan