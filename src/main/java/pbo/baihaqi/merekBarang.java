package pbo.baihaqi;


public class merekBarang {
    private int kode_merk;
    private String nama_merk;
    

    public merekBarang(int kode_merk, String nama_merk ) {
        this.kode_merk = kode_merk;
        this.nama_merk = nama_merk;
        
        
    }

    // Getter dan setter untuk setiap properti

    public int getkode_merk() {
        return kode_merk;
    }

    public void setIdUser(int kode_merk) {
        this.kode_merk = kode_merk;
    }

    public String getnama_merk() {
        return nama_merk;
    }

    public void setnama_merk(String nama_merk) {
        this.nama_merk = nama_merk;
    }

    
    
}
