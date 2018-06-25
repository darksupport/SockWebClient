package com.company;

import com.company.SwingUILayer.SockDataView;
import com.company.SwingUILayer.SockTypeTableModel;
import com.company.UILayer.ConsoleSock;
import com.company.UILayer.IUISock;
import com.company.modellayer.ISockModel;
import com.company.modellayer.SockData;
import com.company.modellayer.SockModelService;
import com.company.modellayer.socktypemodel.SockTypeModelService;


import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SockModelService connect = new SockModelService();
        ISockModel service = connect.getSockModelPort();


        JFrame frame = new JFrame("test");
        frame.setContentPane(new SockDataView(service).getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //IUISock ui = new ConsoleSock(service);
        //ui.mainMenu();
    }
}
