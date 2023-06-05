package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.SubFasilitas;

public class SubFasilitasDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    public List<SubFasilitas> showSubFasilitasByHotel(int idhotel){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM fasilitashotel where id_hotel = '"+idhotel+"'";
        System.out.println("Mengambil data SubFasilitas...");
        
        List<SubFasilitas> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    SubFasilitas p = new SubFasilitas(rs.getInt("id"), rs.getInt("id_tema"), rs.getInt("id_hotel") ,rs.getString("namaFasilitas"));
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
    public void insertSubFasilitas(SubFasilitas p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO fasilitashotel(id_tema, id_hotel, namaFasilitas) "+ "VALUES ('"+p.getIdTema()+"', '" +p.getIdHotel()+"', '"+p.getNama()+"')";
        System.out.println("Adding SubFasilitas...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " SubFasilitas");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding SubFasilitas...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<SubFasilitas> showSubFasilitas(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM fasilitashotel";
        System.out.println("Mengambil data SubFasilitas...");
        
        List<SubFasilitas> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    SubFasilitas p = new SubFasilitas(rs.getInt("id_tema"), rs.getString("namaFasilitas"));
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
    
    public void updateSubFasilitas(SubFasilitas p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE fasilitashotel SET namaFasilitas = '"+p.getNama()+"', id_tema = '"+p.getIdTema()+"' where id = '"+p.getId()+"'";
        
        System.out.println(sql);
        System.out.println("Editing SubFasilitas...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " SubFasilitas "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing grade...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteSubFasilitas(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM fasilitashotel WHERE id = '" + id + "'";
        
        System.out.println("Deleting fasilitashotel...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " fasilitashotel id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting fasilitashotel...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
