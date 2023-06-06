package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.TemaFasilitas;

public class TemaFasilitasDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public String getNamaTema(int idTema){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM temafasilitas where id = '"+idTema+"' ";
        System.out.println("Mengambil data TemaFasilitas...");
        
        List<TemaFasilitas> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    TemaFasilitas p = new TemaFasilitas(rs.getInt("id"), rs.getString("namaTema"));
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
        
        return list.get(0).getNamaTema();
    }
    
    public void insertTemaFasilitas(TemaFasilitas p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO temafasilitas(namaTema) "+ "VALUES ('" + p.getNamaTema()+"')";
        System.out.println("Adding TemaFasilitas...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " TemaFasilitas");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding TemaFasilitas...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<TemaFasilitas> showTemaFasilitas(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM temafasilitas";
        System.out.println("Mengambil data TemaFasilitas...");
        
        List<TemaFasilitas> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    TemaFasilitas p = new TemaFasilitas(rs.getInt("id"), rs.getString("namaTema"));
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
    
    public void updateTemaFasilitas(TemaFasilitas p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE temafasilitas SET namaTema = '"+p.getNamaTema()+"' where id = '"+p.getId()+"'";
        
        System.out.println(sql);
        System.out.println("Editing TemaFasilitas...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " TemaFasilitas "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing grade...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteTemaFasilitas(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM temafasilitas WHERE id = '" + id + "'";
        
        System.out.println("Deleting temafasilitas...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " temafasilitas id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting temafasilitas...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
