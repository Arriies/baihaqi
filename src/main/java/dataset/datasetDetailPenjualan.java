package dataset;

import java.util.ArrayList;

public class datasetDetailPenjualan {

    private ArrayList<Integer> no_nota;
    private ArrayList<String> kode_barang;
    private ArrayList<String> harga_satuan;
    private ArrayList<String> jumlah_jual;
    private ArrayList<String> subtotal;

    public datasetDetailPenjualan() {
        no_nota = new ArrayList<Integer>();
        kode_barang = new ArrayList<String>();
        harga_satuan = new ArrayList<String>();
        jumlah_jual = new ArrayList<String>();
        subtotal = new ArrayList<String>();
    }

    public void insertno_nota(int isi) {
        this.no_nota.add(isi);
    }

    public ArrayList<Integer> getRecordno_nota() {
        return this.no_nota;
    }

    public void insertkode_barang(String isi) {
        this.kode_barang.add(isi);
    }

    public ArrayList<String> getRecordkode_barang() {
        return this.kode_barang;
    }

    public void insertharga_satuan(String isi) {
        this.harga_satuan.add(isi);
    }

    public ArrayList<String> getRecordharga_satuan() {
        return this.harga_satuan;
    }

    public void insertjumlah_jual(String isi) {
        this.jumlah_jual.add(isi);
    }

    public ArrayList<String> getRecordjumlah_jual() {
        return this.jumlah_jual;
    }

    public void insertsubtotal(String isi) {
        this.subtotal.add(isi);
    }

    public ArrayList<String> getRecordsubtotal() {
        return this.subtotal;
    }

    public void insertBarang(int no_nota, String kode_barang, String harga_satuan, String jumlah_jual,
            String subtotal) {
        this.no_nota.add(no_nota);
        this.kode_barang.add(kode_barang);
        this.harga_satuan.add(harga_satuan);
        this.jumlah_jual.add(jumlah_jual);
        this.subtotal.add(subtotal);

    }
}
