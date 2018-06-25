package com.company.SwingUILayer;

import com.company.modellayer.SockType;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brainacad4 on 25.06.2018.
 */
public class SockTypeTableModel extends AbstractTableModel {

    List<SockType> sockTypeList;
    List<SockType> changedItems;

    public SockTypeTableModel(List<SockType> data)
    {
       this.sockTypeList = data;
       changedItems = new ArrayList<>();
    }

    @Override
    public Class<?> getColumnClass(int col) {
        if (col == 1) {
            return Boolean.class;
        }
        return super.getColumnClass(col);
    }

    @Override
    public int getRowCount() {
        return sockTypeList.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0)
        {
            return sockTypeList.get(rowIndex).getSockTypeName();
        }
        if (columnIndex==1)
        {
            return sockTypeList.get(rowIndex).isActive();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex ==0)
        {
            sockTypeList.get(rowIndex).setSockTypeName((String) aValue);
        }
        if (columnIndex ==1)
        {
            sockTypeList.get(rowIndex).setActive((Boolean) aValue);
        }
        changedItems.add(sockTypeList.get(rowIndex));
    }

    public List<SockType> getChangedItems()
    {
        return changedItems;
    }

}
