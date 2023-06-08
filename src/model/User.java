package model;

import java.math.BigInteger;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    private BigInteger saldo;

    public User(BigInteger saldo){
        this.saldo = saldo;
    }

//    User u = new User(Integer.valueOf(idUserProfile.getText()), namaLengkap, jenisKelamin, tanggalLahir.toString(), email, tempatTinggal, username);
//    public User(int id, String username, String email, String namaLengkap, String jenisKelamin, String tanggalLahir, String tempatTinggal) {
//        this.id = id;
//        this.username = username;
//        this.email = email;
//
//        
//    }
    public User(int id, String username, String email, String password, BigInteger saldo) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
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


    public void setSaldo(BigInteger saldo) {
        this.saldo = saldo;
    }
    
    
    
    @Override
    public String toString(){
        return username;
    }
}
