package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.SubFasilitas;

public class TableSubFasilitas extends AbstractTableModel{
    private List<SubFasilitas> list;
    
    public TableSubFasilitas(List<SubFasilitas> list){
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
                return list.get(rowIndex).getIdTema();
            case 2:
                return list.get(rowIndex).getNama();
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
                return "ID Tema";
            case 2:
                return "Nama Fasilitas";
            default:
                return null;
        }
    }
    
   
}
