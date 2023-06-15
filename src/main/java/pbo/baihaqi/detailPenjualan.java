
package pbo.baihaqi;


public class detailPenjualan{
    
    private int no_nota;
    private String kode_barang;
    private String harga_satuan;
    private String jumlah_jual;
    private String subtotal;
   
    public detailPenjualan(int no_nota, String kode_barang,  String harga_satuan, String jumlah_jual, String subtotal) {
        this.no_nota = no_nota;
        this.kode_barang = kode_barang;
        this.harga_satuan = harga_satuan;
        this.jumlah_jual = jumlah_jual;
        this.subtotal = subtotal;
    }

    // Getter dan setter untuk setiap atribut

    
    public int getno_nota() {
        return no_nota;
    }

    public void setno_nota(int id_pelanggan) {
        this.no_nota = no_nota;
    }

    public String getkode_barang() {
        return kode_barang;
    }

    public void setkode_barang(String kd_pelanggan) {
        this.kode_barang = kode_barang;
    }

    public String getharga_satuan() {
        return harga_satuan;
    }

    public void setharga_satuan(String nama_pelanggan) {
        this.harga_satuan = harga_satuan;
    }

    public String getsubtotal() {
        return subtotal;
    }

    public void subtotal() {
        this.subtotal = subtotal;
    }

    

}
