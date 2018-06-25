package com.company.SwingUILayer;

import com.company.modellayer.SockType;
import com.company.modellayer.socktypemodel.ISockTypeModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * Created by Brainacad4 on 25.06.2018.
 */
public class SockTypeView {
    private JTable sockTypeTable;
    private JButton saveButton;
    private JButton refreshButton;
    public JPanel sockTypePane;
    private ISockTypeModel model;
    private SockTypeTableModel tableModel;

    private void refreshModel()
    {
        tableModel = new SockTypeTableModel(model.getAllSockTypes(false));
        sockTypeTable.setModel(tableModel);
    }

    private void saveTypes()
    {
       java.util.List<SockType> items =  tableModel.getChangedItems();
        for (SockType sockType: items) {
            model.updateSockType(sockType);
        }

    }

    public SockTypeView(ISockTypeModel model) {
        this.model = model;
        tableModel = new SockTypeTableModel(model.getAllSockTypes(false));
        sockTypeTable.setModel(tableModel);
        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshModel();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveTypes();
            }
        });
    }


}
