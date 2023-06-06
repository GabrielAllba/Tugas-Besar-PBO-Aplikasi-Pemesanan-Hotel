package dao;

import connection.DbConnection;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.TipeRoom;

public class TipeRoomDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public String getTipeRoom(int idTipeRoom){
        con = dbCon.makeConnection();
        
        String sql = "SELECT namaTipe FROM tipeRoom where id = '"+idTipeRoom+"'";
        System.out.println(sql);
        TipeRoom g = new TipeRoom();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    g = new TipeRoom(rs.getString("namaTipe"));        
                }
            }
            
                    

            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return g.getNamaTipe();
    }
    public void insertTipeRoom(TipeRoom p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO tiperoom(id_hotel, namaTipe, kapasitas, harga) "+ "VALUES ('" + p.getId_hotel()+"', '"+p.getNamaTipe()+"', '"+p.getKapasitas()+"', '"+p.getHarga()+"')";
        System.out.println("Adding TipeRoom...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " TipeRoom");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding TipeRoom...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<TipeRoom> showTipeRoom(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM tipeRoom";
        System.out.println("Mengambil data TipeRoom...");
        
        List<TipeRoom> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    TipeRoom p = new TipeRoom(rs.getInt("id"), rs.getInt("id_hotel"), rs.getString("namaTipe"), rs.getInt("kapasitas"), BigInteger.valueOf(rs.getLong("harga")));
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
    
    public List<TipeRoom> showTipeRoomByHotel(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM tiperoom where id_hotel = '"+id+"'";
        System.out.println("Mengambil data TipeRoom...");
        
        List<TipeRoom> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    TipeRoom p = new TipeRoom(rs.getInt("id"), rs.getInt("id_hotel"), rs.getString("namaTipe"), rs.getInt("kapasitas"), BigInteger.valueOf(rs.getLong("harga")));
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
    
    public void updateTipeRoom(TipeRoom p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE tiperoom SET id_hotel = '"+p.getId_hotel()+"', namaTipe = '"+p.getNamaTipe()+"', kapasitas = '"+p.getKapasitas()+"', harga = '"+p.getHarga()+"' where id = '"+p.getId()+"'";
        
        System.out.println(sql);
        System.out.println("Editing TipeRoom...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " TipeRoom "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing tipeRoom...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteTipeRoom(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM tiperoom WHERE id = '" + id + "'";
        
        System.out.println("Deleting tipeRoom...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " tipeRoom id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting tipeRoom...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
