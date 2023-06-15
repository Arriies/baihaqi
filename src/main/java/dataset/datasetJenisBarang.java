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
public class datasetJenisBarang {
    private ArrayList<Integer>kode_jenis ;
    private ArrayList<String>nama_jenis ;
     
 public datasetJenisBarang(){
    kode_jenis = new ArrayList<Integer>();
    nama_jenis = new ArrayList<String>();
}

    public void inserkode_jenis(int isi){
        this.kode_jenis.add(isi);
    }

    public ArrayList<Integer> getRecordkode_jenis(){
        return this.kode_jenis;
    }

    public void insertnama_jenis(String isi){
        this.nama_jenis.add(isi);
    }

    public ArrayList<String> getRecordnama_jenis(){
        return this.nama_jenis;    
    }

    public void insertBarang(int kode_jenis, String nama_jenis)
    {
        this.kode_jenis.add(kode_jenis);
        this.nama_jenis.add(nama_jenis);
    }
}   