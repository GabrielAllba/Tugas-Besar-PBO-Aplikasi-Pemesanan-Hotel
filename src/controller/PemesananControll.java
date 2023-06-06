package controller;

import dao.PemesananDAO;
import java.util.List;
import model.Pemesanan;
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
    
    public TablePemesanan showPemesanan(String query){
        List<Pemesanan> dataPemesanan = pDao.showPemesanan(query);
        TablePemesanan tablePemesanan = new TablePemesanan(dataPemesanan);
        
        return tablePemesanan;
    }
    
    public List<Pemesanan> showListPemesanan(){
        List<Pemesanan> dataPemesanan = pDao.showPemesanan("");
        return dataPemesanan;
    }
}
