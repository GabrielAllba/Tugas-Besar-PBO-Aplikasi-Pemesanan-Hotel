package controller;

import dao.TemaFasilitasDAO;
import java.util.List;
import model.TemaFasilitas;
import table.TableTemaFasilitas;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class TemaFasilitasControll {
    private TemaFasilitasDAO pDao = new TemaFasilitasDAO();
    
    
    public String getNamaTema(int idTema){
        return pDao.getNamaTema(idTema);
    }
    
    public void insertDataTemaFasilitas(TemaFasilitas p){
        pDao.insertTemaFasilitas(p);
    }
    
    public TableTemaFasilitas showTemaFasilitas(String query){
        List<TemaFasilitas> dataTemaFasilitas = pDao.showTemaFasilitas(query);
        TableTemaFasilitas tableTemaFasilitas = new TableTemaFasilitas(dataTemaFasilitas);
        
        return tableTemaFasilitas;
    }
    
    public void updateDataTemaFasilitas(TemaFasilitas p){
        pDao.updateTemaFasilitas(p);
    }
    
    public void deleteDataTemaFasilitas(int id){
        pDao.deleteTemaFasilitas(id);
    }
    public List<TemaFasilitas> showListTemaFasilitas(){
        List<TemaFasilitas> dataTemaFasilitas = pDao.showTemaFasilitas("");
        return dataTemaFasilitas;
    }
}
