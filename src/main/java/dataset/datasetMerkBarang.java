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
public class datasetMerkBarang {
    private ArrayList<Integer>kode_merk ;
    private ArrayList<String>nama_merk ; 
    
 public datasetMerkBarang(){
    kode_merk = new ArrayList<Integer>();
    nama_merk = new ArrayList<String>();
}

    public void inserkode_merk(int isi){
        this.kode_merk.add(isi);
    }

    public ArrayList<Integer> getRecordkode_merk(){
        return this.kode_merk;
    }

    public void insertnama_merk(String isi){
        this.nama_merk.add(isi);
    }

    public ArrayList<String> getRecordnama_merk(){
        return this.nama_merk;    
    }

    public void insertBarang(int kode_merk, String nama_merk)
    {
        this.kode_merk.add(kode_merk);
        this.nama_merk.add(nama_merk);
    }
}