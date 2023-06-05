package controller;

import dao.UserDAO;
import java.util.List;
import model.User;
import table.TableUser;

/*

NPM  : 210711150
Nama : Gabriel Allba Shemi Yuma

*/

public class UserControll {
    private UserDAO pDao = new UserDAO();
    
    public void insertDataUser(User p){
        pDao.insertUser(p);
    }
    
    public TableUser showUser(String query){
        List<User> dataUser = pDao.showUser(query);
        TableUser tableUser = new TableUser(dataUser);
        
        return tableUser;
    }
    
    public void updateDataUser(User p){
        pDao.updateUser(p);
    }
    
    public void deleteDataUser(int id){
        pDao.deleteUser(id);
    }
    public List<User> showListUser(){
        List<User> dataUser = pDao.showUser("");
        return dataUser;
    }
}