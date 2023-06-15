package pbo.baihaqi;


public class Pengguna {
    private int id;
    private String userid;
    private String passid;
    private String nama;
    private String status;
    
    public Pengguna(int id, String userid, String passid, String nama, String status) {
        this.id = id;
        this.userid = userid ;
        this.passid = passid;
        this.nama= nama;
        this.status= status;
        

    // getter dan setter
    }
    /**
     *
     * @return
     */
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getuserid() {
        return userid;
    }

    public void setuserid(String userid) {
        this.userid = userid;
    }

    public String getpassid() {
        return passid;
    }

    public void setpassid(String passid) {
        this.passid = passid;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String status) {
        this.status = status;
    }

}
