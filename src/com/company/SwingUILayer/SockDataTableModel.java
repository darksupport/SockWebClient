package com.company.SwingUILayer;

import com.company.modellayer.ISock;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Brainacad4 on 04.06.2018.
 */
public class SockDataTableModel implements TableModel {

    List<ISock> sockList;
String [] columnNames = {"Type","Color","Size","Owner"};



    public SockDataTableModel(List<ISock> sockList)
    {
        this.sockList = sockList;
    }

    @Override
    public int getRowCount() {
        return sockList.size();
    }

    @Override
    public int getColumnCount() {
        return sockList.get(0).getFieldsCount();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return sockList.get(0).getFieldByIndex(columnIndex).getClass();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return sockList.get(rowIndex).getFieldByIndex(columnIndex);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
