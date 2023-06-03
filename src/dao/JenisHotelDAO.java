package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.JenisHotel;

public class JenisHotelDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertJenisHotel(JenisHotel p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO jenishotel(namaJenis, deskripsi) "+ "VALUES ('" + p.getNama()+"', '"+p.getDeskripsi()+"')";
        System.out.println("Adding JenisHotel...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Jenis Hotel");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding JenisHotel...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<JenisHotel> showJenisHotel(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM jenishotel";
        System.out.println("Mengambil data Jenis Hotel...");
        
        List<JenisHotel> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    JenisHotel p = new JenisHotel(rs.getInt("id"), rs.getString("namaJenis"), rs.getString("deskripsi"));
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
    
    public void updateJenisHotel(JenisHotel p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE jenishotel SET namaJenis = '"+p.getNama()+"', deskripsi = '"+p.getDeskripsi()+"' where id = '"+p.getId()+"'";
        
        System.out.println(sql);
        System.out.println("Editing JenisHotel...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " JenisHotel "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing jenishotel...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteJenisHotel(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM jenishotel WHERE id = '" + id + "'";
        
        System.out.println("Deleting jenishotel...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " jenishotel id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting jenishotel...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
