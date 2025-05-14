# Soucedemo_Selenium_Automation


Berisi automation test dari berbagai skenario mulai dari login hingga checkout.

Tujuan :
Melakukan automation test web https://www.saucedemo.com/ menggunakan selenium dan cucumber library.

Cara Running :
1. Melalui gradlew :
   - All skenario : ./gradlew cucumber
   - Per tags : ./gradlew cucumber -Ptags=“@nama-tags”
2. Melalui Runner Test :
   - All skenario : buka file RunnerTest lalu Run filenya
   - Per page : buka file runner sesuai page lalu Run filenya

Konfigurasi yang diperlukan :
1. konfigurasi Selenium di Build.gradle
2. konfigurasi webdriver manager di Build.gradle
3. konfigurasi cucumber di Build.gradle
4. konfigurasi runner cucumber di build.gradle
5. konfigurasi github action
