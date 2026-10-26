public class Klinik0031{
    private String namaKlinik;
    private String jamOperasional;
    private String layananKlinik;
    private String alamatKlinik;

    public Klinik0031(String namaKlinik, String jamOperasional, String layananKlinik, String alamatKlinik){
        setNamaKlinik(namaKlinik);
        setJamOperasional(jamOperasional);
        setLayananKlinik(layananKlinik);
        setAlamatKlinik(alamatKlinik);
    }
    public String getNamaKlinik(){
        return namaKlinik;
    }
    public void setNamaKlinik(String namaKlinik){
        if(namaKlinik != null){
            this.namaKlinik = namaKlinik;
        }
        else{
            this.namaKlinik = "Silakan isi nama Kliniknya";
        }
    }
    public String getJamOperasional(){
        return jamOperasional;
    }
    public void setJamOperasional(String jamOperasional){
        if(jamOperasional != null) {
            this.jamOperasional = jamOperasional;
        }else{
            this.jamOperasional = "Silakan isi jam operasional";
        }
    }
    public String getLayananKlinik(){
        return layananKlinik;
    }
    public void setLayananKlinik(String layananKlinik){
        if(layananKlinik != null && !layananKlinik.trim().isEmpty()) {
            this.layananKlinik = layananKlinik;
        } else{
            this.layananKlinik = "Silakan isi pilihan layanan Kliniknya";
        }
    }
    public String getAlamatKlinik(){
        return alamatKlinik;
    }
    public void setAlamatKlinik(String alamatKlinik){
        if(alamatKlinik != null) {
            this.alamatKlinik = alamatKlinik;
        }else{
            this.namaKlinik = "Nama Klinik Wajib diisi";
        }
    }
}
class Pasien0031{
    private String nama;
    private String kodePasien;
    private String keluhanPasien;
    private double biayaKonsultasi;
    private double biayaAdmin;

    public Pasien0031(String nama, String kodePasien, String keluhanPasien, double biayaKonsultasi, double biayaAdmin){
        setNama(nama);
        setKodePasien(kodePasien);
        setKeluhanPasien(keluhanPasien);
        setBiayaKonsultasi(biayaKonsultasi);
        setBiayaAdmin(biayaAdmin);
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        if(nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }else {
            this.nama = "Nama Wajib diisi";
        } 
    }
    public String getKodePasien(){
        return kodePasien;
    }
    public void setKodePasien(String kodePasien){
        if(kodePasien != null && !kodePasien.trim().isEmpty()){
            this.kodePasien = kodePasien;
        }else{
            this.kodePasien = "Kode Pasien harus diisi";
        }
    }
    public String getKeluhanPasien(){
        return keluhanPasien;
    }
    public void setKeluhanPasien(String keluhanPasien){
        if(keluhanPasien != null && !keluhanPasien.trim().isEmpty()){
            this.keluhanPasien = keluhanPasien;
        }else{
            this.keluhanPasien = "Keluhan wajib disampaikan";
        }
    }
    public double getBiayaKonsultasi(){
        return biayaKonsultasi;
    }
    public void setBiayaKonsultasi(double biayaKonsultasi){
        if(biayaKonsultasi >= 0 ){
            this.biayaKonsultasi = biayaKonsultasi;
        }else {
            this.biayaKonsultasi = 0;
        }
        
    }
    public double getBiayaAdmin(){
        return biayaAdmin;
    }
    public void setBiayaAdmin(double biayaAdmin){
        if(biayaAdmin >=0) {
        this.biayaAdmin = biayaAdmin;
        }else {
            this.biayaAdmin = 0;
        }
    }
    public double totalBiayaKonsultasi(){
        return this.biayaKonsultasi + this.biayaAdmin;
    }
}
Klinik0031 k1 = new Klinik0031("Klinik Harapan Bersama", "08.00 - 16.00", "Spesialist THT", "Jl. Penggolon Road No 14");
Klinik0031 k2 = new Klinik0031("Klinik Kasih Indai", "16.00 - 22.00", "", "Jl. Panglima Aim No 9");
Pasien0031 p1 = new Pasien0031("Eka Widiya Restu", "P1015", "Pembengkakan Amandel", 32000,-5000);
Pasien0031 p2 = new Pasien0031("Karso", "P1016", "Maag Lambung", 32000, 5000);
void main(){
    System.out.println("===Klinik 1===");
    System.out.println("Nama Klinik             : " + k1.namaKlinik);
    System.out.println("Jam Operasional         : " + k1.jamOperasional);
    System.out.println("Layanan Klinik          : " + k1.layananKlinik);
    System.out.println("Alamat Klinik           : " + k1.alamatKlinik);
    System.out.println("===Klinik 2===");
    System.out.println("Nama Klinik             : " + k2.namaKlinik);
    System.out.println("Jam Operasional         : " + k2.jamOperasional);
    System.out.println("Layanan Klinik          : " + k2.layananKlinik);
    System.out.println("Alamat Klinik           : " + k2.alamatKlinik);
    System.out.println("===Pasien 1===");
    System.out.println("Nama                    : " + p1.nama);
    System.out.println("Kode Pasien             : " + p1.kodePasien);
    System.out.println("Keluhan Pasien          : " + p1.keluhanPasien);
    System.out.println("Biaya Konsultasi        : " + p1.biayaKonsultasi);
    System.out.println("Biaya Admin             : " + p1.biayaAdmin);
    System.out.println("Total Biaya             : " + p1.totalBiayaKonsultasi());
    System.out.println("===Pasien 2===");
    System.out.println("Nama                    : " + p2.nama);
    System.out.println("Kode Pasien             : " + p2.kodePasien);
    System.out.println("Keluhan Pasien          : " + p2.keluhanPasien);
    System.out.println("Biaya Konsultasi        : " + p2.biayaKonsultasi);
    System.out.println("Biaya Admin             : " + p2.biayaAdmin);
    System.out.println("Total Biaya             : " + p2.totalBiayaKonsultasi());
}
