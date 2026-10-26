#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

string trim(const string& s) {
    size_t awal = s.find_first_not_of(" \t\n\r");
    if (awal == string::npos) return "";
    size_t akhir = s.find_last_not_of(" \t\n\r");
    return s.substr(awal, akhir - awal + 1);
}

class Klinik0031 {
private:
    string namaKlinik;
    string jamOperasional;
    string layananKlinik;
    string alamatKlinik;

public:
    Klinik0031(string namaKlinik, string jamOperasional, string layananKlinik, string alamatKlinik) {
        setNamaKlinik(namaKlinik);
        setJamOperasional(jamOperasional);
        setLayananKlinik(layananKlinik);
        setAlamatKlinik(alamatKlinik);
    }
    string getNamaKlinik() {
        return namaKlinik;
    }
    void setNamaKlinik(string namaKlinik) {
        if (!trim(namaKlinik).empty()) {
            this->namaKlinik = namaKlinik;
        } else {
            this->namaKlinik = "Silakan isi nama Kliniknya";
        }
    }
    string getJamOperasional() {
        return jamOperasional;
    }
    void setJamOperasional(string jamOperasional) {
        if (!trim(jamOperasional).empty()) {
            this->jamOperasional = jamOperasional;
        } else {
            this->jamOperasional = "Silakan isi jam operasional";
        }
    }
    string getLayananKlinik() {
        return layananKlinik;
    }
    void setLayananKlinik(string layananKlinik) {
        if (!trim(layananKlinik).empty()) {
            this->layananKlinik = layananKlinik;
        } else {
            this->layananKlinik = "Silakan isi pilihan layanan Kliniknya";
        }
    }
    string getAlamatKlinik() {
        return alamatKlinik;
    }
    void setAlamatKlinik(string alamatKlinik) {
        if (!trim(alamatKlinik).empty()) {
            this->alamatKlinik = alamatKlinik;
        } else {
            this->namaKlinik = "Nama Klinik Wajib diisi";
        }
    }
};
class Pasien0031 {
private:
    string nama;
    string kodePasien;
    string keluhanPasien;
    double biayaKonsultasi;
    double biayaAdmin;

public:
    Pasien0031(string nama, string kodePasien, string keluhanPasien, double biayaKonsultasi, double biayaAdmin) {
        setNama(nama);
        setKodePasien(kodePasien);
        setKeluhanPasien(keluhanPasien);
        setBiayaKonsultasi(biayaKonsultasi);
        setBiayaAdmin(biayaAdmin);
    }
    string getNama() {
        return nama;
    }
    void setNama(string nama) {
        if (!trim(nama).empty()) {
            this->nama = nama;
        } else {
            this->nama = "Nama Wajib diisi";
        }
    }
    string getKodePasien() {
        return kodePasien;
    }
    void setKodePasien(string kodePasien) {
        if (!trim(kodePasien).empty()) {
            this->kodePasien = kodePasien;
        } else {
            this->kodePasien = "Kode Pasien harus diisi";
        }
    }
    string getKeluhanPasien() {
        return keluhanPasien;
    }
    void setKeluhanPasien(string keluhanPasien) {
        if (!trim(keluhanPasien).empty()) {
            this->keluhanPasien = keluhanPasien;
        } else {
            this->keluhanPasien = "Keluhan wajib disampaikan";
        }
    }
    double getBiayaKonsultasi() {
        return biayaKonsultasi;
    }
    void setBiayaKonsultasi(double biayaKonsultasi) {
        if (biayaKonsultasi >= 0) {
            this->biayaKonsultasi = biayaKonsultasi;
        } else {
            this->biayaKonsultasi = 0;
        }
    }
    double getBiayaAdmin() {
        return biayaAdmin;
    }
    void setBiayaAdmin(double biayaAdmin) {
        if (biayaAdmin >= 0) {
            this->biayaAdmin = biayaAdmin;
        } else {
            this->biayaAdmin = 0;
        }
    }
    double totalBiayaKonsultasi() {
        return this->biayaKonsultasi + this->biayaAdmin;
    }
};

int main() {
    Klinik0031 k1("Klinik Harapan Bersama", "08.00 - 16.00", "Spesialist THT", "Jl. Penggolon Road No 14");
    Klinik0031 k2("Klinik Kasih Indai", "16.00 - 22.00", "", "Jl. Panglima Aim No 9");
    Pasien0031 p1("Eka Widiya Restu", "P1015", "Pembengkakan Amandel", 32000, -5000);
    Pasien0031 p2("Karso", "P1016", "Maag Lambung", 32000, 5000);

    cout << fixed << setprecision(1);

    cout << "===Klinik 1===" << endl;
    cout << "Nama Klinik             : " << k1.getNamaKlinik() << endl;
    cout << "Jam Operasional         : " << k1.getJamOperasional() << endl;
    cout << "Layanan Klinik          : " << k1.getLayananKlinik() << endl;
    cout << "Alamat Klinik           : " << k1.getAlamatKlinik() << endl;
    cout << "===Klinik 2===" << endl;
    cout << "Nama Klinik             : " << k2.getNamaKlinik() << endl;
    cout << "Jam Operasional         : " << k2.getJamOperasional() << endl;
    cout << "Layanan Klinik          : " << k2.getLayananKlinik() << endl;
    cout << "Alamat Klinik           : " << k2.getAlamatKlinik() << endl;
    cout << "===Pasien 1===" << endl;
    cout << "Nama                    : " << p1.getNama() << endl;
    cout << "Kode Pasien             : " << p1.getKodePasien() << endl;
    cout << "Keluhan Pasien          : " << p1.getKeluhanPasien() << endl;
    cout << "Biaya Konsultasi        : " << p1.getBiayaKonsultasi() << endl;
    cout << "Biaya Admin             : " << p1.getBiayaAdmin() << endl;
    cout << "Total Biaya             : " << p1.totalBiayaKonsultasi() << endl;
    cout << "===Pasien 2===" << endl;
    cout << "Nama                    : " << p2.getNama() << endl;
    cout << "Kode Pasien             : " << p2.getKodePasien() << endl;
    cout << "Keluhan Pasien          : " << p2.getKeluhanPasien() << endl;
    cout << "Biaya Konsultasi        : " << p2.getBiayaKonsultasi() << endl;
    cout << "Biaya Admin             : " << p2.getBiayaAdmin() << endl;
    cout << "Total Biaya             : " << p2.totalBiayaKonsultasi() << endl;
    return 0;
}