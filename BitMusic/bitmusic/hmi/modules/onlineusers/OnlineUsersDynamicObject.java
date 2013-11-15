/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bitmusic.hmi.modules.onlineusers;

import bitmusic.profile.classes.User;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hebergui <hebergui.utc@gmail.com>
 */
public class OnlineUsersDynamicObject extends AbstractTableModel {
    private ArrayList<User> listUsers = new ArrayList<>();
    private final String[] header = {"Login", "MdP"};

    public OnlineUsersDynamicObject() {
        super();
    }

    @Override
    public int getRowCount() {
        return listUsers.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return header[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return listUsers.get(rowIndex).getLogin();
            case 1:
                return listUsers.get(rowIndex).getPassword();
            default:
                return null; //Ne devrait jamais arriver
        }
    }

    public void addUser(User user) {
        listUsers.add(user);

        fireTableRowsInserted(listUsers.size() -1, listUsers.size() -1);
    }

    public void removeUser(int rowIndex) {
        listUsers.remove(rowIndex);

        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public void removeAllUsers() {
        for (int i=0; i<this.listUsers.size(); i++)
            this.removeUser(i);
    }

    public ArrayList<User> getListUsers() {
        return this.listUsers;
    }

    public void setListUsers(ArrayList<User> users) {
        this.removeAllUsers();
        this.listUsers = users;
    }
}
