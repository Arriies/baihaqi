/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */


public class jenisBarang {
    private int kode_jenis;
    private String nama_jenis;
    

    public jenisBarang(int kode_jenis,  String nama_jenis) {
        this.kode_jenis = kode_jenis;
        this.nama_jenis = nama_jenis;
        
}

    // Getter dan setter untuk setiap properti

    public int kode_jenis() {
        return kode_jenis;
    }

    public void kode_jenis(int kode_jenis) {
        this.kode_jenis = kode_jenis;
    }

    public java.lang.String nama_jenis() {
        return nama_jenis;
    }

    public void setnama_jenis(String nama_jenis) {
        this.nama_jenis = nama_jenis;
    }

    

    
}
