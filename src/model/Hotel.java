package model;

import java.math.BigInteger;

public class Hotel {
    private int id;
    private int id_hotel_admin;
    private int id_jenis;
    private int id_provinsi;
    private int id_grade;
    private String namaHotel;
    private String detailLokasi;
    private String deskripsi;
    private String fasilitas;
    private String checkinTime;
    private String checkoutTime;
    private String status;
    private BigInteger pemasukan;

    public Hotel(int id, int id_hotel_admin, int id_jenis, int id_provinsi, int id_grade, String namaHotel, String detailLokasi, String deskripsi, String fasilitas, String checkinTime, String checkoutTime, String status, BigInteger pemasukan) {
        this.id = id;
        this.id_hotel_admin = id_hotel_admin;
        this.id_jenis = id_jenis;
        this.id_provinsi = id_provinsi;
        this.id_grade = id_grade;
        this.namaHotel = namaHotel;
        this.detailLokasi = detailLokasi;
        this.deskripsi = deskripsi;
        this.fasilitas = fasilitas;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this.status = status;
        this.pemasukan = pemasukan;
    }

    public int getId() {
        return id;
    }

    public int getId_hotel_admin() {
        return id_hotel_admin;
    }

    public int getId_jenis() {
        return id_jenis;
    }

    public int getId_provinsi() {
        return id_provinsi;
    }

    public int getId_grade() {
        return id_grade;
    }

    public String getNamaHotel() {
        return namaHotel;
    }

    public String getDetailLokasi() {
        return detailLokasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public String getCheckinTime() {
        return checkinTime;
    }

    public String getCheckoutTime() {
        return checkoutTime;
    }

    public String getStatus() {
        return status;
    }

    public BigInteger getPemasukan() {
        return pemasukan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_hotel_admin(int id_hotel_admin) {
        this.id_hotel_admin = id_hotel_admin;
    }

    public void setId_jenis(int id_jenis) {
        this.id_jenis = id_jenis;
    }

    public void setId_provinsi(int id_provinsi) {
        this.id_provinsi = id_provinsi;
    }

    public void setId_grade(int id_grade) {
        this.id_grade = id_grade;
    }

    public void setNamaHotel(String namaHotel) {
        this.namaHotel = namaHotel;
    }

    public void setDetailLokasi(String detailLokasi) {
        this.detailLokasi = detailLokasi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public void setCheckinTime(String checkinTime) {
        this.checkinTime = checkinTime;
    }

    public void setCheckoutTime(String checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPemasukan(BigInteger pemasukan) {
        this.pemasukan = pemasukan;
    }

    
    
    
    @Override
    public String toString(){
        return namaHotel;
    }
}
