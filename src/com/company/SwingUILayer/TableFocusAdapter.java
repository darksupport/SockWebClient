package com.company.SwingUILayer;

import com.company.modellayer.ISock;
import com.company.modellayer.SockData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Created by Brainacad4 on 04.06.2018.
 */
public class TableFocusAdapter extends FocusAdapter {

    JTable SockDataTable;
    java.util.List<ISock> allData;

    public ISock getSelecteItem() {
        return selecteItem;
    }

    ISock selecteItem;
    public TableFocusAdapter(JTable SockDataTable,java.util.List<ISock> allData)
    {
        super();
        this.allData =allData;
        this.SockDataTable = SockDataTable;
    }
    int focus = -1;
    @Override
    public void focusGained(FocusEvent e) {
        super.focusGained(e);
        if (focus!= SockDataTable.getSelectedRow() && SockDataTable.getSelectedRow()>-1)
        {
            selecteItem = allData.get(focus);
            focus = SockDataTable.getSelectedRow();
        }

    }
    @Override
    public void focusLost(FocusEvent e) {
        super.focusLost(e);
    }


}
