package dao;

import connection.DbConnection;
import java.math.BigDecimal;
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
    
    public User detailUser(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM user where id = '"+id+"'";
        System.out.println("in get saldo");
        System.out.println(sql);
        System.out.println("Mengambil data User...");
        
        List<User> list = new ArrayList<>();
        
//        public User(int id, String username, String email, String password, String namaLengkap, String jenisKelamin, String tanggalLahir, String tempatTinggal, BigInteger saldo) {
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            BigInteger sum = BigInteger.valueOf(0);
            if(rs!=null){
                while(rs.next()){
                    BigDecimal saldo = rs.getBigDecimal("saldo");
                    User p = new User(rs.getInt("id"), rs.getString("username"),rs.getString("email"), rs.getString("password"), saldo.toBigInteger());
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
    
    public void updateSaldo(int id, BigInteger saldoAwal, BigInteger pengurangan, String tambahKurang){
        con = dbCon.makeConnection();
        String sql = null;
        if(tambahKurang.equalsIgnoreCase("kurang")){
            sql = "UPDATE user set saldo = '"+saldoAwal.subtract(pengurangan)+"' where id = '"+id+"'";            
        }else{
            sql = "UPDATE user set saldo = '"+saldoAwal.add(pengurangan)+"' where id = '"+id+"'";            
        }
        
        System.out.println(sql);
        System.out.println(sql);
        System.out.println("Editing User...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            statement.close();
        }catch(Exception e){
            System.out.println("Error editing user...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
    public BigInteger getSaldo(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT saldo FROM user where id = '"+id+"'";
        System.out.println("in get saldo");
        System.out.println(sql);
        System.out.println("Mengambil data User...");
        
        List<User> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    User p = new User(BigInteger.valueOf(rs.getLong("saldo")));
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
        
        return list.get(0).getSaldo();
    }
    public String getNamaUser(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM user where id = '"+id+"'";
        System.out.println("Mengambil data User...");
        
        List<User> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    User p = new User(rs.getInt("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"),BigInteger.valueOf(rs.getLong("saldo")));
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
    public void insertUser(User p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO user(username, email, password, saldo) "
                + "VALUES('"+p.getUsername()+"', '"+p.getEmail()+"', '"+p.getPassword()+"', '"+"', '"+p.getSaldo()+"')";
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
                    User p = new User(rs.getInt("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"), BigInteger.valueOf(rs.getLong("saldo")));
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
        
        String sql = "UPDATE user set username = '"+p.getUsername()+"', email = '"+p.getEmail()+"', password = '"+p.getPassword()+"', saldo = '"+p.getSaldo()+"'";        
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
