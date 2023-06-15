
public class barang {
    private int kode_barang;
    private int kode_jenis;
    private int kode_merk;
    private String nama_barang;
    private int satuan;
    private int harga_jual;
    private int stok_barang;
    
    

    public barang(int kode_barang, int kode_jenis, int kode_merk, String nama_barang, int satuan, int harga_jual, int stok_barang) 
    {
        this.kode_barang = kode_barang;
        this.kode_jenis = kode_jenis;
        this.kode_merk = kode_merk;
        this.nama_barang = nama_barang;
        this.satuan = satuan;
        this.harga_jual = harga_jual;
        this.stok_barang = stok_barang;
             
    }

    // Getter dan setter untuk setiap properti

    public int getkode_barang() {
        return kode_barang;
    }

    public void setkode_barang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public int getkode_jenis() {
        return kode_jenis;
    }

    public void setkode_jenis(int kode_jenis) {
        this.kode_jenis = kode_jenis;
    }

    public int getkode_merk() {
        return kode_merk;
    }

    public void setkode_merk(int kode_merk) {
        this.kode_merk = kode_merk;
    }

    public String getnama_barang() {
        return nama_barang;
    }

    public void setnama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }
    
    public int getsatuan() {
        return satuan;
    }

    public void setsatuan(int satuan) {
        this.satuan = satuan;
    }
    
    public int getharga_jual() {
        return harga_jual;
    }

    public void setharga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }
    
    public int getstok_barang() {
        return stok_barang;
    }

    public void setstok_barang(int stok_barang) {
        this.stok_barang = stok_barang;
    }
}
