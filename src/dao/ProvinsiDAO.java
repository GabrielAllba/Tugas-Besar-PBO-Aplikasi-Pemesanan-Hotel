package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Provinsi;

public class ProvinsiDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
     public String getLokasi(int idLokasi){
        con = dbCon.makeConnection();
        
        String sql = "SELECT nama FROM provinsi where id = '"+idLokasi+"'";
        System.out.println(sql);
        Provinsi g = new Provinsi();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    g = new Provinsi(rs.getString("nama"));        
                }
            }
            
                    

            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
        
        return g.getNama();
    }
    
    public void insertProvinsi(Provinsi p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO provinsi(nama) "+ "VALUES ('" + p.getNama()+"')";
        System.out.println("Adding Provinsi...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Provinsi");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Provinsi...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Provinsi> showProvinsi(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM provinsi";
        System.out.println("Mengambil data Provinsi...");
        
        List<Provinsi> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Provinsi p = new Provinsi(rs.getInt("id"), rs.getString("nama"));
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
    
    public void updateProvinsi(Provinsi p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE provinsi SET nama = '"+p.getNama()+"' where id = '"+p.getId()+"'";
        
        System.out.println(sql);
        System.out.println("Editing Provinsi...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Provinsi "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing grade...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteProvinsi(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM provinsi WHERE id = '" + id + "'";
        
        System.out.println("Deleting provinsi...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " provinsi id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting provinsi...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
