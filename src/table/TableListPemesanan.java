package table;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pemesanan;
import controller.TipeRoomControll;

public class TableListPemesanan extends AbstractTableModel{
    TipeRoomControll t = new TipeRoomControll();
    private List<Pemesanan> list;
    public TableListPemesanan(List<Pemesanan> list){
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getTanggalCheckin();
            case 2:
                return list.get(rowIndex).getTanggalCheckout();
            case 3:
                return t.getTipeRoom(list.get(rowIndex).getId_tipe_room());
            case 4:
                return list.get(rowIndex).getPembayaran();
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
                return "Checkin";
            case 2:
                return "Checkout";                
            case 3:
                return "Tipe Room";
            case 4:
                return "Jumlah Bayar";
            default:
                return null;
        }
    }
    
   
}
