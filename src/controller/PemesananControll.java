package controller;

import dao.PemesananDAO;
import java.math.BigInteger;
import java.util.List;
import model.Pemesanan;
import table.TableListPemesanan;
import table.TableListPemesananUserInAdmin;
import table.TablePemesanan;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class PemesananControll {
    private PemesananDAO pDao = new PemesananDAO();
    
    public void insertDataPemesanan(Pemesanan p){
        pDao.insertPemesanan(p);
    }
    
    public BigInteger countPendapatanByIdHotel(int idHotel){
        return pDao.countPendapatanByIdHotel(idHotel);
    }
    
    public int countPemesananBetween(String currentDate, List<Pemesanan> list){
        return pDao.countPemesananBetween(currentDate, list);
    }
    
    public TablePemesanan showPemesanan(String query){
        List<Pemesanan> dataPemesanan = pDao.showPemesanan(query);
        TablePemesanan tablePemesanan = new TablePemesanan(dataPemesanan);
        
        return tablePemesanan;
    }
    public List<Pemesanan> showPemesananByIdHotelAndTipeRoom(int idHotel, int idTipeRoom){
        List<Pemesanan> dataPemesanan = pDao.showPemesananByIdHotelAndTipeRoom(idHotel, idTipeRoom);
        return dataPemesanan;
    }
    public List<Pemesanan> detailPemesanan(int id){
        List<Pemesanan> dataPemesanan = pDao.showPemesananByIdPemesanan(id);
        return dataPemesanan;
    }
    
    public TableListPemesanan showPemesananByIdHotel(int idHotel){
        List<Pemesanan> dataPemesanan = pDao.showPemesananByIdHotel(idHotel);
        TableListPemesanan tablePemesanan = new TableListPemesanan(dataPemesanan);
        
        return tablePemesanan;
    }
    
    public TableListPemesananUserInAdmin showPemesananByIdUser(int idUser){
        List<Pemesanan> dataPemesanan = pDao.showPemesananByIdUser(idUser);
        TableListPemesananUserInAdmin tablePemesanan = new TableListPemesananUserInAdmin(dataPemesanan);
        
        return tablePemesanan;
    }
    
    public List<Pemesanan> showListPemesanan(){
        List<Pemesanan> dataPemesanan = pDao.showPemesanan("");
        return dataPemesanan;
    }
}
