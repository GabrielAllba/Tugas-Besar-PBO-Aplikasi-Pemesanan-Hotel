package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.JenisHotel;

public class TableJenisHotel extends AbstractTableModel{
    private List<JenisHotel> list;
    
    public TableJenisHotel(List<JenisHotel> list){
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
                return list.get(rowIndex).getDeskripsi();
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
                return "Nama Jenis Hotel";
            case 2:
                return "Deskripsi";                
            default:
                return null;
        }
    }
    
   
}
