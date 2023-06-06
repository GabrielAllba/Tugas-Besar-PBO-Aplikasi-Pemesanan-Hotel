package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pemesanan;

public class TablePemesanan extends AbstractTableModel{
    private List<Pemesanan> list;
    
    public TablePemesanan(List<Pemesanan> list){
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
                return list.get(rowIndex).getNamaLengkap();
            case 2:
                return list.get(rowIndex).getNoHandphone();
            case 3:
                return list.get(rowIndex).getId_hotel();
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
                return "Nama Lengkap";
            case 2:
                return "No Handphone";
            case 3:
                return "ID Hotel";                
            default:
                return null;
        }
    }
    
   
}
