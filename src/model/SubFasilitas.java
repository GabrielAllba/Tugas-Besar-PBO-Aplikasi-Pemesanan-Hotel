package model;

public class SubFasilitas {
    private int id;
    private int idTema;
    private String nama;
    

    public SubFasilitas(int id, int idTema, String nama) {
        this.id = id;
        this.idTema = idTema;
        this.nama = nama;
    }
    public int getId() {
        return id;
    }
    public int getIdTema() {
        return idTema;
    }
    public String getNama() {
        return nama;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString(){
        return nama;
    }
}
