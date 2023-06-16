package dao;

import connection.DbConnection;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.HotelAdmin;
import model.HotelAdmin;

public class AdminHotelDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public HotelAdmin detailHotelAdmin(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM hoteladmin where id = '"+id+"'";
        System.out.println("in get pemasukan");
        System.out.println(sql);
        System.out.println("Mengambil data HotelAdmin...");
        
        List<HotelAdmin> list = new ArrayList<>();
        
//        public HotelAdmin(int id, String username, String email, String password, String namaLengkap, String jenisKelamin, String tanggalLahir, String tempatTinggal, BigInteger pemasukan) {
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            BigInteger sum = BigInteger.valueOf(0);
            if(rs!=null){
                while(rs.next()){
                    BigDecimal pemasukan = rs.getBigDecimal("pemasukan");
                    HotelAdmin p = new HotelAdmin(rs.getInt("id"), rs.getString("username"),rs.getString("email"), rs.getString("password"), pemasukan.toBigInteger());
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
        
        return list.get(0);
    }
    
    public void updateSaldo(int id, BigInteger pemasukanAwal, BigInteger pengurangan, String tambahKurang){
        con = dbCon.makeConnection();
        String sql = null;
        if(tambahKurang.equalsIgnoreCase("kurang")){
            sql = "UPDATE hoteladmin set pemasukan = '"+pemasukanAwal.subtract(pengurangan)+"' where id = '"+id+"'";            
        }else{
            sql = "UPDATE hoteladmin set pemasukan = '"+pemasukanAwal.add(pengurangan)+"' where id = '"+id+"'";            
        }
        
        System.out.println(sql);
        System.out.println(sql);
        System.out.println("Editing HotelAdmin...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing hoteladmin...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    public BigInteger getPemasukan(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT pemasukan FROM hoteladmin where id = '"+id+"'";
        System.out.println("in get pemasukan");
        System.out.println(sql);
        System.out.println("Mengambil data HotelAdmin...");
        
        List<HotelAdmin> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    HotelAdmin p = new HotelAdmin(BigInteger.valueOf(rs.getLong("pemasukan")));
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
        
        return list.get(0).getPemasukan();
    }
    public String getUsername(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM hoteladmin where id = '"+id+"'";
        System.out.println("Mengambil data HotelAdmin...");
        
        List<HotelAdmin> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    HotelAdmin p = new HotelAdmin(rs.getInt("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"),BigInteger.valueOf(rs.getLong("pemasukan")));
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
        
        return list.get(0).getUsername();
    }
    public void insertHotelAdmin(HotelAdmin p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO hoteladmin(username, email, password, pemasukan) "
                + "VALUES('"+p.getUsername()+"', '"+p.getEmail()+"', '"+p.getPassword()+"', '"+"', '"+p.getPemasukan()+"')";
        System.out.println("Adding HotelAdmin...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " HotelAdmin");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding HotelAdmin...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<HotelAdmin> showHotelAdmin(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM hoteladmin";
        System.out.println("Mengambil data HotelAdmin...");
        
        List<HotelAdmin> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    HotelAdmin p = new HotelAdmin(rs.getInt("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"), BigInteger.valueOf(rs.getLong("pemasukan")));
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
    
    
    
    public void updateHotelAdmin(HotelAdmin p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE hoteladmin set username = '"+p.getUsername()+"', email = '"+p.getEmail()+"', password = '"+p.getPassword()+"', pemasukan = '"+p.getPemasukan()+"'";        
        System.out.println(sql);
        System.out.println("Editing HotelAdmin...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " Hote lAdmin "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing hoteladmin...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }

    
    public void deleteHotelAdmin(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM hoteladmin WHERE id = '" + id + "'";
        
        System.out.println("Deleting hoteladmin...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " hoteladmin id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting hoteladmin...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
