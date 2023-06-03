package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Grade;

public class TableGrade extends AbstractTableModel{
    private List<Grade> list;
    
    public TableGrade(List<Grade> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    public int getColumnCount(){
        return 3;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getKeterangan();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Grade";
            case 2:
                return "Keterangan";                
            default:
                return null;
        }
    }
    
   
}
