package controller;

import dao.HotelDAO;
import java.util.List;
import model.Hotel;
import table.TableHotel;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class HotelControll {
    private HotelDAO pDao = new HotelDAO();
    
    public void updateStatusHotel(int id, String status){
        pDao.updateStatusHotel(id, status);
    }
    public void insertDataHotel(Hotel p){
        pDao.insertHotel(p);
    }
    
    public int checkIdHotelAdmin(int idHotel){
        return pDao.checkIdHotelAdmin(idHotel);
    }
    
    public TableHotel showHotel(String query){
        List<Hotel> dataHotel = pDao.showHotel(query);
        TableHotel tableHotel = new TableHotel(dataHotel);
        
        return tableHotel;
    }
    
    public TableHotel showHotelByHotelAdmin(int id){
        List<Hotel> dataHotel = pDao.showHotelByAdmin(id);
        TableHotel tableHotel = new TableHotel(dataHotel);
        
        return tableHotel;
    }
    public List<Hotel> detailHotel(int id){
        List<Hotel> dataHotel = pDao.detailHotel(id);
        
        return dataHotel;
    }
    public void updateDataHotel(Hotel p){
        pDao.updateHotel(p);
    }
    
    public void deleteDataHotel(int id){
        pDao.deleteHotel(id);
    }
    public List<Hotel> showListHotel(){
        List<Hotel> dataHotel = pDao.showHotel("");
        return dataHotel;
    }
}
