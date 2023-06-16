package controller;

import dao.AdminHotelDAO;
import java.math.BigInteger;
import java.util.List;
import model.HotelAdmin;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class AdminHotelControl {
    private AdminHotelDAO pDao = new AdminHotelDAO();
    
    public HotelAdmin detailHotelAdmin(int id){
        return pDao.detailHotelAdmin(id);
    }
    public void updateSaldo(int id, BigInteger saldoAwal, BigInteger pengurangan, String tambahKurang){
        pDao.updateSaldo(id, saldoAwal,pengurangan, tambahKurang);
    }
    public String getUsername(int id){
        return pDao.getUsername(id);
    }
    public BigInteger getPemasukan(int id){
        return pDao.getPemasukan(id);
    }
    public void insertDataHotelAdmin(HotelAdmin p){
        pDao.insertHotelAdmin(p);
    }
    
//    public TableHotelAdmin showHotelAdmin(String query){
//        List<HotelAdmin> dataHotelAdmin = pDao.showHotelAdmin(query);
//        TableHotelAdmin tableHotelAdmin = new TableHotelAdmin(dataHotelAdmin);
//        
//        return tableHotelAdmin;
//    }
    
    public void updateDataHotelAdmin(HotelAdmin p){
        pDao.updateHotelAdmin(p);
    }
    
    public void deleteDataHotelAdmin(int id){
        pDao.deleteHotelAdmin(id);
    }
    public List<HotelAdmin> showListHotelAdmin(){
        List<HotelAdmin> dataHotelAdmin = pDao.showHotelAdmin("");
        return dataHotelAdmin;
    }
}
