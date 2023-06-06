package controller;

import dao.TipeRoomDAO;
import java.util.List;
import model.TipeRoom;
import table.TableTipeRoom;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class TipeRoomControll {
    private TipeRoomDAO pDao = new TipeRoomDAO();
    
    public void insertDataTipeRoom(TipeRoom p){
        pDao.insertTipeRoom(p);
    }
    public TableTipeRoom showTipeRoomByHotel(int id){
        List<TipeRoom> dataTipeRoom = pDao.showTipeRoomByHotel(id);
        TableTipeRoom tableTipeRoom = new TableTipeRoom(dataTipeRoom);
        
        return tableTipeRoom;
    }
    public TableTipeRoom showTipeRoom(String query){
        List<TipeRoom> dataTipeRoom = pDao.showTipeRoom(query);
        TableTipeRoom tableTipeRoom = new TableTipeRoom(dataTipeRoom);
        
        return tableTipeRoom;
    }
    
    public String getTipeRoom(int idTipeRoom){
        return pDao.getTipeRoom(idTipeRoom);
    }
    
    public void updateDataTipeRoom(TipeRoom p){
        pDao.updateTipeRoom(p);
    }
    
    public void deleteDataTipeRoom(int id){
        pDao.deleteTipeRoom(id);
    }
    public List<TipeRoom> showListTipeRoom(){
        List<TipeRoom> dataTipeRoom = pDao.showTipeRoom("");
        return dataTipeRoom;
    }
}
