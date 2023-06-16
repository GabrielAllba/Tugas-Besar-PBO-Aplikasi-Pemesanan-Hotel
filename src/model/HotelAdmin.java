package model;

import java.math.BigInteger;

public class HotelAdmin {
    private int id;
    private String username;
    private String email;
    private String password;
    private BigInteger pemasukan;

    public HotelAdmin(){
        
    }
    
    public HotelAdmin(BigInteger pemasukan){
        this.pemasukan = pemasukan;
    }
    
    public HotelAdmin(int id, String username, String email, String password, BigInteger pemasukan) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.pemasukan = pemasukan;
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

    public BigInteger getPemasukan() {
        return pemasukan;
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

    public void setPemasukan(BigInteger pemasukan) {
        this.pemasukan = pemasukan;
    }
    @Override
    public String toString(){
        return username;
    }
}
