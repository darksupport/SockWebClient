package com.company;

import com.company.UILayer.ConsoleSock;
import com.company.UILayer.IUISock;
import com.company.modellayer.ISockModel;
import com.company.modellayer.SockData;
import com.company.modellayer.SockModelService;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        SockModelService connect = new SockModelService();
        ISockModel service = connect.getSockModelPort();

        IUISock ui = new ConsoleSock(service);
        ui.mainMenu();
    }
}
