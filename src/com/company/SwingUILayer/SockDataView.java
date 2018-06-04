package com.company.SwingUILayer;

import com.company.SockDataClient;
import com.company.modellayer.ISock;
import com.company.modellayer.ISockModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by Brainacad4 on 04.06.2018.
 */
public class SockDataView {
    private JButton btLoad;
    private JTable SockDataTable;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private JPanel mainPanel;
    private JTextField tfType;
    private JTextField tfColor;
    private JSpinner spSize;
    private JTextField tfOwner;
    private ISockModel model;


    public SockDataView(ISockModel model)
    {
       this.model = model;
       java.util.List<ISock> allData = SockDataClient.convertToClientList( model.getAllSocks());

        btLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SockDataTable.setModel(new SockDataTableModel(allData));
           }
        });
       TableFocusAdapter adapter = new TableFocusAdapter(SockDataTable,allData);

        SockDataTable.addComponentListener(new ComponentAdapter() {
        });
        SockDataTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                ISock selected = allData.get(SockDataTable.getSelectedRow());
                tfType.setText( selected.getType());
            }
        });
    }

}
