package model;

public class Provinsi {
    private int id;
    private String nama;

    public Provinsi(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
