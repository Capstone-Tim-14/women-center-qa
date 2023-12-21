Feature:Sebagai Admin saya berhasil login sehingga dapat melihat halaman Admin

  @login
Scenario: Admin berhasil Login
Given Admin berada di halaman login
When Admin memasukkan email
And Admin memasukkan password
And Admin klik button login
Then Admin diarahkan ke halaman "Dashboard"

Scenario: Admin gagal Login karna memasukkan email yang salah
Given Admin berada di halaman login
When Admin memasukkan email yang salah
And Admin memasukkan password
And Admin klik button login
Then Muncul pesan error email salah

Scenario: Admin gagal Login karna memasukkan password yang salah
Given Admin berada di halaman login
When Admin memasukkan email
And Admin memasukkan password yang salah
And Admin klik button login
Then Muncul pesan error password salah

Scenario: Admin gagal Login karna mengosongkan email dan password
Given Admin berada di halaman login
When Admin mengosongkan email
And Admin mengosongkan password
And Admin klik button login
Then Muncul pesan error email dan password harus diisi

Scenario: Admin gagal Login karna mengosongkan email
Given Admin berada di halaman login
When Admin mengosongkan email
And Admin memasukkan password
And Admin klik button login
Then Muncul pesan error email harus diisi

Scenario: Admin gagal Login karna mengosongkan password
Given Admin berada di halaman login
When Admin memasukkan email
And Admin mengosongkan password
And Admin klik button login
Then Muncul pesan error password harus diisi
