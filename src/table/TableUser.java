package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.User;

public class TableUser extends AbstractTableModel{
    private List<User> list;
    
    public TableUser(List<User> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    public int getColumnCount(){
        return 2;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getUsername();
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
                return "Username";
            default:
                return null;
        }
    }
    
   
}
