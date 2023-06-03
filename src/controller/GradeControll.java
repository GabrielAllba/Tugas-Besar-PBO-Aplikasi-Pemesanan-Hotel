package controller;

import dao.GradeDAO;
import java.util.List;
import model.Grade;
import table.TableGrade;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class GradeControll {
    private GradeDAO pDao = new GradeDAO();
    
    public void insertDataGrade(Grade p){
        pDao.insertGrade(p);
    }
    
    public TableGrade showGrade(String query){
        List<Grade> dataGrade = pDao.showGrade(query);
        TableGrade tableGrade = new TableGrade(dataGrade);
        
        return tableGrade;
    }
    
    public void updateDataGrade(Grade p){
        pDao.updateGrade(p);
    }
    
    public void deleteDataGrade(int id){
        pDao.deleteGrade(id);
    }
}
