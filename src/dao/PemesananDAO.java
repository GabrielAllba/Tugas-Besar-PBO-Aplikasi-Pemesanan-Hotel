package dao;

import connection.DbConnection;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pemesanan;

public class PemesananDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    

    public void insertPemesanan(Pemesanan p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT into pemesanan(id_user,id_hotel, id_tipe_room,tanggalCheckin, tanggalCheckout, namaLengkap, noHandphone, email) VALUES('"+p.getId_user()+"', '"+p.getId_hotel()+"', '"+p.getId_tipe_room()+"', '"+p.getTanggalCheckin()+"', '"+p.getTanggalCheckout()+"', '"+p.getNamaLengkap()+"', '"+p.getNoHandphone()+"', '"+p.getEmail()+"')" ;        
        System.out.println("Adding Pemesanan...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Pemesanan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Pemesanan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Pemesanan> showPemesanan(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan";
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"),rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"));
                    list.add(p);
                }
                
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    public List<Pemesanan> detailPemesanan(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id = '"+id+"'";
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"),rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"), rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"));
                    list.add(p);
                }
                
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    public List<Pemesanan> showPemesananByAdmin(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id_pemesanan_admin = '"+id+"'";
        System.out.println("in show pemesanan by admin : "+sql);
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"), rs.getString("tanggalCheckout"), rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"));
                    list.add(p);
                }
                
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return list;
    }
    
    
    
    
    
}
