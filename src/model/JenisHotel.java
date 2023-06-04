package model;

public class JenisHotel {
    private int id;
    private String namaJenis;
    private String deskripsi;

    public JenisHotel(int id, String namaJenis, String deskripsi) {
        this.id = id;
        this.namaJenis = namaJenis;
        this.deskripsi = deskripsi;
    }
    public int getId() {
        return id;
    }
    public String getNama() {
        return namaJenis;
    }
    public String getDeskripsi(){
        return deskripsi;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNama(String namaJenis) {
        this.namaJenis = namaJenis;
    }
    public void setDeskripsi(String k){
        this.deskripsi = k;
    }
    @Override
    public String toString(){
        return namaJenis;
    }
}
