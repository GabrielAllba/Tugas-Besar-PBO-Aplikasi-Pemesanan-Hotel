package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Hotel;

public class TableHotel extends AbstractTableModel{
    private List<Hotel> list;
    
    public TableHotel(List<Hotel> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    public int getColumnCount(){
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId_hotel_admin();
            case 1:
                return list.get(rowIndex).getId();
            case 2:
                return list.get(rowIndex).getNamaHotel();
            case 3:
                return list.get(rowIndex).getStatus();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID Hotel Admin";
            case 1:
                return "ID";
            case 2:
                return "Nama Hotel";
            case 3:
                return "Status";                
            default:
                return null;
        }
    }
    
   
}
