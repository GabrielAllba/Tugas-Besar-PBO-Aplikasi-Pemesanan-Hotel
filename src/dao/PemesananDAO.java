package dao;

import connection.DbConnection;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Pemesanan;
import java.math.BigDecimal;

public class PemesananDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public BigInteger countPendapatanByIdHotel(int idHotel){
             con = dbCon.makeConnection();

           String sql = "SELECT sum(pembayaran) as total FROM pemesanan where id_hotel = '"+idHotel+"'";
           System.out.println("Mengambil data Pemesanan...");
           System.out.println(sql);

           
           BigInteger sum = BigInteger.valueOf(0);
           System.out.println("demus kontol");
           try{
               Statement statement = con.createStatement();
               ResultSet rs = statement.executeQuery(sql);
               if (rs.next()) {
                   BigDecimal total = rs.getBigDecimal("total");
                   System.out.println("total : "+total);
                   if (total != null) {
                       sum = total.toBigInteger();
                    }
               }
               rs.close();
               statement.close();
           }catch(Exception e){
               System.out.println("Error reading database...");
               System.out.println(e);
           }

           dbCon.closeConnection();

           return sum;
    }
    
    public int countPemesananBetween(String currentDate, List<Pemesanan> list){
        LocalDate current = LocalDate.parse(currentDate);
        
        int counter=0;
        for (int i = 0; i < list.size(); i++) {
            Pemesanan p = list.get(i);
            LocalDate curIn = LocalDate.parse(p.getTanggalCheckin());
            LocalDate curOut = LocalDate.parse(p.getTanggalCheckout());
            
            
            if((current.isEqual(curIn) || current.isAfter(curIn)) && (current.isEqual(curOut) || current.isBefore(curOut)) && !current.isEqual(curIn) && !current.isEqual(curOut)){
                counter++;
            }
            System.out.println("-------");
            System.out.println(p.getId());
        }
        System.out.println("counter : "+counter);
        
        return counter;
    }
    public List<Pemesanan> showPemesananByIdHotelAndTipeRoom(int idHotel, int idTipeRoom){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id_hotel = '"+idHotel+"' and id_tipe_room = '"+idTipeRoom+"'";
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"),rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"), BigInteger.valueOf(rs.getLong("pembayaran")));
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

    public List<Pemesanan> showPemesananByIdUser(int idUser){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id_user = '"+idUser+"'";
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"),rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"), BigInteger.valueOf(rs.getLong("pembayaran")));
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
    
    public List<Pemesanan> showPemesananByIdPemesanan(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id = '"+id+"'";
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"),rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"), BigInteger.valueOf(rs.getLong("pembayaran")));
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
    public void insertPemesanan(Pemesanan p){
        con = dbCon.makeConnection();
        
        String sql = "INSERT into pemesanan(id_user, id_hotel, id_tipe_room,tanggalCheckin, tanggalCheckout, namaLengkap, noHandphone, email, pembayaran) VALUES('"+p.getId_user()+"', '"+p.getId_hotel()+"', '"+p.getId_tipe_room()+"', '"+p.getTanggalCheckin()+"', '"+p.getTanggalCheckout()+"', '"+p.getNamaLengkap()+"', '"+p.getNoHandphone()+"', '"+p.getEmail()+"', '"+p.getPembayaran()+"')" ;        
        System.out.println("Adding Pemesanan...");
        System.out.println(sql);
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+ " Pemesanan");
            statement.close();
        }catch(Exception e){
            System.out.println("Error adding Pemesanan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Pemesanan> showPemesanan(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan";
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"),rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"), BigInteger.valueOf(rs.getLong("pembayaran")));
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
    
    public List<Pemesanan> showPemesananByIdHotel(int idHotel){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id_hotel = '"+idHotel+"'";
        System.out.println(sql);
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"),rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"), BigInteger.valueOf(rs.getLong("pembayaran")));
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
    public List<Pemesanan> detailPemesanan(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id = '"+id+"'";
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"),rs.getString("tanggalCheckin"),rs.getString("tanggalCheckout"), rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"), BigInteger.valueOf(rs.getLong("pembayaran")));
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
    public List<Pemesanan> showPemesananByAdmin(int id){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM pemesanan where id_pemesanan_admin = '"+id+"'";
        System.out.println("in show pemesanan by admin : "+sql);
        System.out.println("Mengambil data Pemesanan...");
        
        List<Pemesanan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Pemesanan p = new Pemesanan(rs.getInt("id"), rs.getInt("id_user"),rs.getInt("id_hotel"), rs.getInt("id_tipe_room"), rs.getString("tanggalCheckin"), rs.getString("tanggalCheckout"), rs.getString("namaLengkap"), rs.getString("noHandphone"), rs.getString("email"), BigInteger.valueOf(rs.getLong("pembayaran")));
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
    
    
    
    
    
}
