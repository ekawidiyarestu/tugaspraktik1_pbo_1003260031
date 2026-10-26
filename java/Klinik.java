class Klinik0031{
    private String namaKlinik;
    private String jamOperasional;
    private String layananKlinik;
    private String alamatKlinik;
// Methode constract --> akan otomatis nilainya dibuat ketika membuat objek
    public Klinik0031(String namaKlinik, String jamOperasional, String layananKlinik, String alamatKlinik){
    this.namaKlinik = namaKlinik;
    this.jamOperasional = jamOperasional;
    this.layananKlinik = layananKlinik;
    this.alamatKlinik = alamatKlinik;
}
    // Method geter untuk mengambil atau membaca nilai dari atribut namaKlinik yang bersifat private
    // Method seter untuk mengubah atau memperbarui nilai dari atribut Class Klinik
    public String getNamaKlinik() {
        return namaKlinik;
    }
    public void setNamaKlinik(){
        this.namaKlinik = namaKlinik;
    }
    public String getJamOperasional(){
        return jamOperasional;
    }
    public void setJamOperasional(){
        this.jamOperasional = jamOperasional;
    }
    public String getAlamatKlinik(){
        return alamatKlinik;
    }

    public void setAlamatKlinik(){
        this.alamatKlinik = alamatKlinik;
    }
}
class Pasien0031{
    private String nama;
    private String kodePasien;
    private String keluhanPasien;
    private double biayaKonsultasi;
    private double biayaAdmin;
    public Pasien0031(String nama, String kodePasien, String keluhanPasien, double biayaKonsultasi, double biayaAdmin){
        this.nama = nama;
        this.kodePasien = kodePasien;
        this.keluhanPasien = keluhanPasien;
        this.biayaKonsultasi = biayaKonsultasi;
        this.biayaAdmin = biayaAdmin;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(){
        this.nama = nama;
    }
    public String getKodePasien(){
        return kodePasien;
    }
    public void setKodePasien(){
        this.kodePasien= kodePasien;
    }
    public String getKeluhanPasien(){
        return keluhanPasien;
    }
    public void setKeluhanPasien(){
        this.keluhanPasien = keluhanPasien;
    }
    public double getBiayaKonsultasi(){
        return biayaKonsultasi;
    }
    public void setBiayaKonsultasi(){
        this.biayaKonsultasi = biayaKonsultasi;
    }
    public double getBiayaAdmin(){
        return biayaAdmin;
    }
    public void setBiayaAdmin(){
        this.biayaAdmin = biayaAdmin;
    }
    public double totalBiayaKonsultasi(double biayaAdmin){
        return biayaKonsultasi + biayaAdmin;
    }
}
Klinik0031 k1 = new Klinik0031("Eka Sehat Berkah", "08.00 - 22.00","Spesialist THT", "Jl. Lengkong No 25");
Klinik0031 k2 = new Klinik0031("Sehat Mandiri Berkah", "08.00-21.00", "Spesialist Dalam", "Jl. Purnama nomor 24");
Pasien0031 p1 = new Pasien0031("Eka Widiya Restu", "P0001","Sakit Kepala", 32000, 5000);
Pasien0031 p2 = new Pasien0031("Karso", "P0002","Lambung Kronis", 32000, 5000);
void main(){
    System.out.println("===KLINIK 1===");
    System.out.println("Nama Klinik         : " +k1.namaKlinik);
    System.out.println("Jam Operasional     : " +k1.jamOperasional);
    System.out.println("Layanan Klinik      : " +k1.layananKlinik);
    System.out.println("Alamat Klinik       : " +k1.alamatKlinik);
    System.out.println("===PASIEN 1===");
    System.out.println("Nama Pasien         : " +p1.nama);
    System.out.println("Kode Pasien         : " +p1.kodePasien);
    System.out.println("Keluhan Pasien      : " +p1.keluhanPasien);
    System.out.println("Biaya Konsultasi    : " +p1.biayaKonsultasi);
    System.out.println("Biaya Admin         : " +p1.biayaAdmin);
    System.out.println("Total Biaya         : " +p1.totalBiayaKonsultasi(5000));
    System.out.println("===KLINIK 2===");
    System.out.println("Nama Klinik         : " +k2.namaKlinik);
    System.out.println("Jam Operasional     : " +k2.jamOperasional);
    System.out.println("Layanan Klinik      : " +k2.layananKlinik);
    System.out.println("Alamat Klinik       : " +k2.alamatKlinik);
    System.out.println("===PASIEN 2===");
    System.out.println("Nama Pasien         : " +p2.nama);
    System.out.println("Kode Pasien         : " +p2.kodePasien);
    System.out.println("Keluhan Pasien      : " +p2.keluhanPasien);
    System.out.println("Biaya Konsultasi    : " +p2.biayaKonsultasi);
    System.out.println("Biaya Admin         : " +p1.biayaAdmin);
    System.out.println("Total Biaya         : " +p2.totalBiayaKonsultasi(5000));
    
}