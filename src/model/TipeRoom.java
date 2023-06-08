package model;

import java.math.BigInteger;

public class TipeRoom {
    private int id;
    private int id_hotel;
    private String namaTipe;
    private int kapasitas;
    private BigInteger harga;

    public TipeRoom(){
        
    }
    public TipeRoom(int kapasitas){
        this.kapasitas = kapasitas;
    }
    public TipeRoom(String namaTipe){
        this.namaTipe = namaTipe;
    }
    public TipeRoom(int id, int id_hotel, String namaTipe, int kapasitas, BigInteger harga) {
        this.id = id;
        this.id_hotel = id_hotel;
        this.namaTipe = namaTipe;
        this.kapasitas = kapasitas;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public String getNamaTipe() {
        return namaTipe;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public BigInteger getHarga() {
        return harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public void setNamaTipe(String namaTipe) {
        this.namaTipe = namaTipe;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void setHarga(BigInteger harga) {
        this.harga = harga;
    }

    
    
    
    @Override
    public String toString(){
        return namaTipe;
    }
}
