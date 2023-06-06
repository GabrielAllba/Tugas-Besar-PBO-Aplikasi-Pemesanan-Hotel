package model;

public class Pemesanan {
    private int id;
    private int id_user;
    private int id_hotel;
    private int id_tipe_room;
    private String tanggalCheckin;
    private String tanggalCheckout;
    private String namaLengkap;
    private String noHandphone;
    private String email;

    public Pemesanan(){
        
    }
    public Pemesanan(int id, int id_user, int id_hotel, int id_tipe_room, String tanggalCheckin, String tanggalCheckout, String namaLengkap, String noHandphone, String email) {
        this.id = id;
        this.id_user = id_user;
        this.id_hotel = id_hotel;
        this.id_tipe_room = id_tipe_room;
        this.tanggalCheckin = tanggalCheckin;
        this.tanggalCheckout = tanggalCheckout;
        this.namaLengkap = namaLengkap;
        this.noHandphone = noHandphone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int getId_user() {
        return id_user;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public int getId_tipe_room() {
        return id_tipe_room;
    }
    public String getTanggalCheckin(){
        return tanggalCheckin;
    }
    public String getTanggalCheckout(){
        return tanggalCheckout;
    }
    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNoHandphone() {
        return noHandphone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public void setId_tipe_room(int id_tipe_room) {
        this.id_tipe_room = id_tipe_room;
    }
    public void setTanggalCheckin(String s){
        this.tanggalCheckin = s;
    }
    public void setTanggalCheckout(String s){
        this.tanggalCheckout = s;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public void setNoHandphone(String noHandphone) {
        this.noHandphone = noHandphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    @Override
    public String toString(){
        return namaLengkap;
    }
}
