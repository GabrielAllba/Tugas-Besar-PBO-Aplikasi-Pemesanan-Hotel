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
    
    public void insertDataHotel(Hotel p){
        pDao.insertHotel(p);
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
