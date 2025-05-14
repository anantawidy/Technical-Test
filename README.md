# Technical Test Indodana (Cermati)

Repository ini berisi sebuah **Technical Test Automation**. Framework ini dibangun menggunakan berbagai tools dan library, termasuk **Git**, **GitHub**, **Java**, **Gradle**, **Selenium**, dan **GitHub Actions**.

---

## **Fitur Utama**
1. **Pengujian Web UI**:
    - Pengujian Web UI dilakukan menggunakan Selenium.
2. **Format Gherkin**:
    - Semua test case ditulis dalam format Gherkin dan diimplementasikan menggunakan Cucumber.
3. **Struktur Folder yang Rapi**:
    - Kode Java, Step Definitions, dan Feature Files dipisahkan dengan jelas.
4. **Laporan**:
    - Cucumber menghasilkan laporan dalam format **HTML** dan **JSON**.
5. **GitHub Actions**:
    - Workflow untuk menjalankan tes secara otomatis:
        - Trigger manual.
        - Setiap kali ada Pull Request.

---

## **Tools dan Library yang Digunakan**
- **Java**: Bahasa pemrograman utama untuk framework ini.
- **Gradle**: Build tool untuk menjalankan task.
- **Selenium**: Library untuk pengujian Web UI.
- **Cucumber**: Framework untuk behavior-driven development (BDD).
- **GitHub Actions**: Untuk Continuous Integration (CI).

---

## **Catatan**
- Pada test case pertama (**Input valid data**), bagian ini tidak dijalankan karena alur tidak dapat dilanjutkan. Penyebabnya adalah munculnya **CAPTCHA** saat mencoba melakukan registrasi.
