package model;

import java.math.BigInteger;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private String namaLengkap;
    private String jenisKelamin;
    private String tanggalLahir;
    private String tempatTinggal;
    private BigInteger saldo;

    public User(BigInteger saldo){
        this.saldo = saldo;
    }
    public User(int id, String username, String email, String password, String namaLengkap, String jenisKelamin, String tanggalLahir, String tempatTinggal, BigInteger saldo) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.tempatTinggal = tempatTinggal;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTempatTinggal() {
        return tempatTinggal;
    }

    public BigInteger getSaldo() {
        return saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setTempatTinggal(String tempatTinggal) {
        this.tempatTinggal = tempatTinggal;
    }

    public void setSaldo(BigInteger saldo) {
        this.saldo = saldo;
    }
    
    
    
    @Override
    public String toString(){
        return username;
    }
}
