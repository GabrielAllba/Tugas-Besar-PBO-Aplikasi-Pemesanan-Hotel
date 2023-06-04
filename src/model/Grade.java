package model;

public class Grade {
    private int id;
    private String nama;
    private String keterangan;

    public Grade(int id, String nama, String keterangan) {
        this.id = id;
        this.nama = nama;
        this.keterangan = keterangan;
    }
    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public String getKeterangan(){
        return keterangan;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKeterangan(String k){
        this.keterangan = k;
    }
    @Override
    public String toString(){
        return nama;
    }
}
