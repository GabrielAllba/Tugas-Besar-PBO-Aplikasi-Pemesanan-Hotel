package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.TipeRoom;

public class TableTipeRoom extends AbstractTableModel{
    private List<TipeRoom> list;
    
    public TableTipeRoom(List<TipeRoom> list){
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
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNamaTipe();
            case 2:
                return list.get(rowIndex).getKapasitas();
            case 3:
                return list.get(rowIndex).getHarga();
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
                return "Nama Tipe";
            case 2:
                return "Kapasitas";
            case 3:
                return "Harga";                
            default:
                return null;
        }
    }
    
   
}
