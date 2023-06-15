package pbo.baihaqi;
import java.util.Date;

public class penjualan {
    private int no_nota;
    private int tgl_nota;
    private int total_bayar;
    private int userid;
    

    public penjualan(int id_no_note, int tgl_nota, int total_bayar, int userid) {
        this.no_nota = no_nota;
        this.tgl_nota = tgl_nota;
        this.total_bayar = total_bayar ;
        this.userid = userid;
        
    }

    // Getter dan setter untuk setiap atribut

    public int getno_nota() {
        return no_nota;
    }

    public void setno_nota(int no_nota) {
        this.no_nota = no_nota;
    }
    public int gettgl_nota() {
        return tgl_nota;
    }


     public void settgl_nota(int tgl_nota) {
        this.tgl_nota = tgl_nota;
    }

    public int total_bayar() {
        return total_bayar;
    }

    public void settotal_bayar(int total_bayar) {
        this.total_bayar = total_bayar;
    }

    public int getuserid() {
        return userid;
    }

    public void setuserid(int userid) {
        this.userid = userid;
    }

    
}
