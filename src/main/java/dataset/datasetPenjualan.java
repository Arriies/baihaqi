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
public class datasetPenjualan {
    private ArrayList<Integer>no_nota ;
    private ArrayList<Integer>tgl_nota ;
    private ArrayList<Integer>total_bayar ;
    private ArrayList<Integer>userid ;
 
public datasetPenjualan(){
    no_nota = new ArrayList<Integer>();
    tgl_nota = new ArrayList<Integer>();
    total_bayar = new ArrayList<Integer>();
    userid = new ArrayList<Integer>();     
}

    public void insertno_nota(int isi){
        this.no_nota.add(isi);
    }

    public ArrayList<Integer> getRecordno_nota(){
        return this.no_nota;
    }

    public void inserttgl_nota(Integer isi){
        this.tgl_nota.add(isi);
    }

    public ArrayList<Integer> getRecordtgl_nota(){
        return this.tgl_nota;    
    }

    public void inserttotal_bayar(Integer isi){
        this.total_bayar.add(isi);
    }

    public ArrayList<Integer> getRecordtotal_bayar(){
        return this.total_bayar;
    }

    public void insertuserid(Integer isi){
        this.userid.add(isi);
    }

    public ArrayList<Integer> getRecorduserid(){
        return this.userid;
    }
    
 public void insertBarang(int no_nota, Integer tgl_nota, Integer total_bayar, Integer userid)
     {
        this.no_nota.add(no_nota);
        this.tgl_nota.add(tgl_nota);
        this.total_bayar.add(total_bayar);
        this.userid.add(userid);
        
     }
}