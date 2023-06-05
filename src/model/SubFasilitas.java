package model;

public class SubFasilitas {
    private int id;
    private int idTema;
    private String nama;
    private int id_hotel;

    public SubFasilitas(int idTema,  String nama){
        this.idTema = idTema;
        this.nama = nama;
    }
    
    public SubFasilitas(int idTema, int idHotel, String nama){
        this.idTema = idTema;
        this.idTema = idTema;
        this.nama = nama;
    }
    public SubFasilitas(int id, int idTema,int id_hotel, String nama) {
        this.id = id;
        this.id_hotel = id_hotel;
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
    public int getIdHotel(){
        return id_hotel;
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
    public void setIdHotel(int id){
        this.id_hotel = id;
    }
    @Override
    public String toString(){
        return nama;
    }
}
