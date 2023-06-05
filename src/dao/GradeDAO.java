package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Grade;

public class GradeDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    public String getGrade(int idGrade){
        con = dbCon.makeConnection();
        
        String sql = "SELECT nama FROM grade where id = '"+idGrade+"'";
        System.out.println(sql);
        Grade g = new Grade();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    g = new Grade(rs.getString("nama"));        
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
    public void insertGrade(Grade p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO grade(nama, keterangan) "+ "VALUES ('" + p.getNama()+"', '"+p.getKeterangan()+"')";
        System.out.println("Adding Grade...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Grade");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Grade...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Grade> showGrade(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM grade";
        System.out.println("Mengambil data Grade...");
        
        List<Grade> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Grade p = new Grade(rs.getInt("id"), rs.getString("nama"), rs.getString("keterangan"));
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
    
    public void updateGrade(Grade p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE grade SET nama = '"+p.getNama()+"', keterangan = '"+p.getKeterangan()+"' where id = '"+p.getId()+"'";
        
        System.out.println(sql);
        System.out.println("Editing Grade...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Grade "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing grade...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteGrade(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM grade WHERE id = '" + id + "'";
        
        System.out.println("Deleting grade...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " grade id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting grade...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
