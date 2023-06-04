package dao;

import connection.DbConnection;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Hotel;

public class HotelDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertHotel(Hotel p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO hotel(id_hotel_admin, id_jenis, id_provinsi, id_grade, namaHotel, detailLokasi, deskripsi, fasilitas, checkinTime, checkoutTime, status, pemasukan) "+ 
                "VALUES ('" + p.getId_hotel_admin()+"', '"+p.getId_jenis()+"', '"+p.getId_provinsi()+"', '"+p.getId_grade()+"', "
                + "'"+p.getNamaHotel()+"', '"+p.getDetailLokasi()+"', '"+p.getDeskripsi()+"', '"+p.getFasilitas()+"', "
                + "'"+p.getCheckinTime()+"', '"+p.getCheckoutTime()+"', '"+p.getStatus()+"', '"+p.getPemasukan()+"')";
        System.out.println("Adding Hotel...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Hotel");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Hotel...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Hotel> showHotel(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM hotel";
        System.out.println("Mengambil data Hotel...");
        
        List<Hotel> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Hotel p = new Hotel(rs.getInt("id"), rs.getInt("id_hotel_admin"), rs.getInt("id_jenis"), rs.getInt("id_provinsi"), rs.getInt("id_grade"), 
                            rs.getString("namaHotel"), rs.getString("detailLokasi"), rs.getString("deskripsi"), rs.getString("fasilitas"), rs.getString("checkinTime"), rs.getString("checkoutTime"),
                    rs.getString("status"), BigInteger.valueOf(rs.getLong("pemasukan")));
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
    
    public List<Hotel> showHotelByAdmin(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM hotel where id_hotel_admin = '"+id+"'";
        System.out.println("in show hotel by admin : "+sql);
        System.out.println("Mengambil data Hotel...");
        
        List<Hotel> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Hotel p = new Hotel(rs.getInt("id"), rs.getInt("id_hotel_admin"), rs.getInt("id_jenis"), rs.getInt("id_provinsi"), rs.getInt("id_grade"), 
                            rs.getString("namaHotel"), rs.getString("detailLokasi"), rs.getString("deskripsi"), rs.getString("fasilitas"), rs.getString("checkinTime"), rs.getString("checkoutTime"),
                    rs.getString("status"), BigInteger.valueOf(rs.getLong("pemasukan")));
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
    
    public void updateHotel(Hotel p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE hotel SET id_hotel_admin = '"+p.getId_hotel_admin()+"', id_jenis = '"+p.getId_jenis()+"', "
                + "id_provinsi = '"+p.getId_provinsi()+"', id_grade = '"+p.getId_grade()+"', namaHotel = '"+p.getNamaHotel()+"', detailLokasi = '"+p.getDetailLokasi()+"',"
                + "deskripsi = '"+p.getDeskripsi()+"', fasilitas = '"+p.getFasilitas()+"', checkinTime = '"+p.getCheckinTime()+"', checkoutTime = '"+p.getCheckoutTime()+"',"
                + "status = '"+p.getStatus()+"', pemasukan = '"+p.getPemasukan()+"' where id = '"+p.getId()+"'";
        
        System.out.println(sql);
        System.out.println("Editing Hotel...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Hotel "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing hotel...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteHotel(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM hotel WHERE id = '" + id + "'";
        
        System.out.println("Deleting hotel...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " hotel id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting hotel...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
