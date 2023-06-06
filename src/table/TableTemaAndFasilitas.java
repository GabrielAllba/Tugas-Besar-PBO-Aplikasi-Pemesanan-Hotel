package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.SubFasilitas;
import controller.TemaFasilitasControll;

public class TableTemaAndFasilitas extends AbstractTableModel{
    private List<SubFasilitas> list;
    
    TemaFasilitasControll t = new TemaFasilitasControll();
    
    public TableTemaAndFasilitas(List<SubFasilitas> list){
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
                return t.getNamaTema(list.get(rowIndex).getIdTema());
            case 1:
                return list.get(rowIndex).getNama();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama Tema";
            case 1:
                return "Nama Fasilitas";                
            default:
                return null;
        }
    }
    
   
}
