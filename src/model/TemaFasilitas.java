package model;

public class TemaFasilitas {
    private int id;
    private String namaTema;

    public TemaFasilitas(int id, String namaTema) {
        this.id = id;
        this.namaTema = namaTema;
    }
    public int getId() {
        return id;
    }
    public String getNamaTema() {
        return namaTema;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNamaTema(String namaTema) {
        this.namaTema = namaTema;
    }
    @Override
    public String toString(){
        return namaTema;
    }
}
