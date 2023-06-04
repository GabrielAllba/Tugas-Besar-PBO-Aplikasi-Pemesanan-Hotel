package controller;

import dao.ProvinsiDAO;
import java.util.List;
import model.Provinsi;
import table.TableProvinsi;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class ProvinsiControll {
    private ProvinsiDAO pDao = new ProvinsiDAO();
    
    public void insertDataProvinsi(Provinsi p){
        pDao.insertProvinsi(p);
    }
    
    public TableProvinsi showProvinsi(String query){
        List<Provinsi> dataProvinsi = pDao.showProvinsi(query);
        TableProvinsi tableProvinsi = new TableProvinsi(dataProvinsi);
        
        return tableProvinsi;
    }
    
    public void updateDataProvinsi(Provinsi p){
        pDao.updateProvinsi(p);
    }
    
    public void deleteDataProvinsi(int id){
        pDao.deleteProvinsi(id);
    }
    public List<Provinsi> showListProvinsi(){
        List<Provinsi> dataProvinsi = pDao.showProvinsi("");
        return dataProvinsi;
    }
}
