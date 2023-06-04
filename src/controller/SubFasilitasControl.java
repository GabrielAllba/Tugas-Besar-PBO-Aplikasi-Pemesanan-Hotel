package controller;

import dao.SubFasilitasDAO;
import java.util.List;
import model.SubFasilitas;
import table.TableSubFasilitas;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class SubFasilitasControl {
    private SubFasilitasDAO pDao = new SubFasilitasDAO();
    
    public void insertDataSubFasilitas(SubFasilitas p){
        pDao.insertSubFasilitas(p);
    }
    
    public TableSubFasilitas showSubFasilitas(String query){
        List<SubFasilitas> dataSubFasilitas = pDao.showSubFasilitas(query);
        TableSubFasilitas tableSubFasilitas = new TableSubFasilitas(dataSubFasilitas);
        
        return tableSubFasilitas;
    }
    
    public void updateDataSubFasilitas(SubFasilitas p){
        pDao.updateSubFasilitas(p);
    }
    
    public void deleteDataSubFasilitas(int id){
        pDao.deleteSubFasilitas(id);
    }
    public List<SubFasilitas> showListSubFasilitas(){
        List<SubFasilitas> dataSubFasilitas = pDao.showSubFasilitas("");
        return dataSubFasilitas;
    }
}
