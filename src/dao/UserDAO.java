package dao;

import connection.DbConnection;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.User;

public class UserDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertUser(User p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO user(username, email, password, namaLengkap, jenisKelamin, tanggalLahir, tempatTinggal, saldo) "
                + "VALUES('"+p.getUsername()+"', '"+p.getEmail()+"', '"+p.getPassword()+"', '"+p.getNamaLengkap()+"', "
                + "'"+p.getJenisKelamin()+"', '"+p.getTanggalLahir()+"', '"+p.getTempatTinggal()+"', '"+p.getSaldo()+"')";
        System.out.println("Adding User...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " User");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding User...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<User> showUser(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM user";
        System.out.println("Mengambil data User...");
        
        List<User> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    User p = new User(rs.getInt("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"), 
                    rs.getString("namaLengkap"), rs.getString("jenisKelamin"), rs.getString("tanggalLahir"), rs.getString("tempatTinggal"), BigInteger.valueOf(rs.getLong("saldo")));
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
    
    
    
    public void updateUser(User p){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE user set username = '"+p.getUsername()+"', email = '"+p.getEmail()+"', password = '"+p.getPassword()+"', namaLengkap = '"+p.getNamaLengkap()+"', jenisKelamin = '"+p.getJenisKelamin()+"', tanggalLahir = '"+p.getTanggalLahir()+"', tempatTinggal = '"+p.getTempatTinggal()+"', saldo = '"+p.getSaldo()+"'";        
        System.out.println(sql);
        System.out.println("Editing User...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+ " User "+p.getId());
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing user...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    
    public void deleteUser(int id){
        con = dbCon.makeConnection();
        String sql = "DELETE FROM user WHERE id = '" + id + "'";
        
        System.out.println("Deleting user...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+ " user id "+ id);
            statement.close();
        }catch(Exception e){
            System.out.println("Error deleting user...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
}
