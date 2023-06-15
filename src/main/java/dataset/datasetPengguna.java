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
public class datasetPengguna {
    private ArrayList<Integer>id ;
    private ArrayList<String>userid ;
    private ArrayList<String>passid ;
    private ArrayList<String>nama ;
    private ArrayList<String>status ; 
    
 public datasetPengguna (){
    id = new ArrayList<Integer>();
    userid = new ArrayList<String>();
    passid = new ArrayList<String>();
    nama = new ArrayList<String>();   
    status  = new ArrayList<String>(); 
    
}

 public void insertid(int isi){
        this.id.add(isi);
    }

    public ArrayList<Integer> getRecordid(){
        return this.id;
    }

    public void insertuserid(String isi){
        this.userid.add(isi);
    }

    public ArrayList<String> getRecorduserid(){
        return this.userid;    
    }

    public void insertpassid(String isi){
        this.passid.add(isi);
    }

    public ArrayList<String> getRecordpassid(){
        return this.passid;
    }

    public void insertnama(String isi){
        this.nama.add(isi);
    }

    public ArrayList<String> getRecordnama(){
        return this.nama;
    }
    
    public void insertstatus(String isi){
        this.status.add(isi);
    }

    public ArrayList<String> getRecordstatus(){
        return this.status;
    }
    
   public void insertBarang(int id, String userid, String passid, String nama, 
            String status){
        this.id.add(id);
        this.userid.add(userid);
        this.passid.add(passid);
        this.nama.add(nama);
        this.status.add(status);
       
        
}

}