package controller;

import dao.JenisHotelDAO;
import java.util.List;
import model.JenisHotel;
import table.TableJenisHotel;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class JenisHotelControll {
    private JenisHotelDAO pDao = new JenisHotelDAO();
    
    public void insertDataJenisHotel(JenisHotel p){
        pDao.insertJenisHotel(p);
    }
    
    public TableJenisHotel showJenisHotel(String query){
        List<JenisHotel> dataJenisHotel = pDao.showJenisHotel(query);
        TableJenisHotel tableJenisHotel = new TableJenisHotel(dataJenisHotel);
        
        return tableJenisHotel;
    }
    
    public void updateDataJenisHotel(JenisHotel p){
        pDao.updateJenisHotel(p);
    }
    
    public void deleteDataJenisHotel(int id){
        pDao.deleteJenisHotel(id);
    }
}
