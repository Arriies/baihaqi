/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class datasetBarang {
    private ArrayList<Integer> kode_barang;
    private ArrayList<Integer> kode_jenis;
    private ArrayList<Integer> kode_merk;
    private ArrayList<String> nama_barang;
    private ArrayList<Integer> satuan;
    private ArrayList<Integer> harga_jual;
    private ArrayList<Integer> stok_barang;
    
public datasetBarang(){
    kode_barang = new ArrayList<Integer>();
    kode_jenis = new ArrayList<Integer>();
    kode_merk = new ArrayList<Integer>();
    nama_barang = new ArrayList<String>();
    satuan = new ArrayList<Integer>();   
    harga_jual  = new ArrayList<Integer>(); 
    stok_barang = new ArrayList<Integer>(); 

}
    public void insertkode_barang(int isi){
        this.kode_barang.add(isi);
    }

    public ArrayList<Integer> getRecordkode_barang(){
        return this.kode_barang;
    }

    public void insertkode_jenis(int isi){
        this.kode_jenis.add(isi);
    }

    public ArrayList<Integer> getRecordkode_jenis(){
        return this.kode_jenis;    
    }

    public void insertkode_merk(int isi){
        this.kode_merk.add(isi);
    }

    public ArrayList<Integer> getRecordkode_merk(){
        return this.kode_merk;
    }

    public void insertnama_barang(String isi){
        this.nama_barang.add(isi);
    }

    public ArrayList<String> getRecordnama_barang(){
        return this.nama_barang;
    }
    
    public void insertsatuan(int isi){
        this.satuan.add(isi);
    }

    public ArrayList<Integer> getRecordsatuan(){
        return this.satuan;
    }
    
    public void insertharga_jual(int isi){
        this.harga_jual.add(isi);

    }

    public ArrayList<Integer> getRecordharga_jual(){
        return this.harga_jual;
    }
    
    public void insertstok_barang(int isi){
        this.stok_barang.add(isi);
    }

    public ArrayList<Integer> getRecordstok_barang(){
        return this.stok_barang;
    }
    
public void insertBarang(int kode_barang, int kode_jenis, int kode_merk, String nama_barang, 
            int satuan, int harga_jual, int stok_barang){
        this.kode_barang.add(kode_barang);
        this.kode_jenis.add(kode_jenis);
        this.kode_merk.add(kode_merk);
        this.nama_barang.add(nama_barang);
        this.satuan.add(satuan);
        this.harga_jual.add(harga_jual);
        this.stok_barang.add(stok_barang);
        
}

}
