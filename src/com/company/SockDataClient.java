package com.company;

import com.company.modellayer.ISock;
import com.company.modellayer.SockData;
import com.company.modellayer.SockType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brainacad4 on 31.05.2018.
 */
public class SockDataClient extends SockData implements ISock {

    public SockDataClient(SockData sock)
    {
        this.color = sock.getColor();
        this.type = sock.getType();
        this.owner = sock.getOwner();
        this.size = sock.getSize();
    }

    public SockDataClient()
    {
        this.color = "";
        this.type = new SockType();
        this.owner = null;
        this.size = -1;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.type);
        sb.append("|" + this.color);
        sb.append("|" + this.size);
        if (null != owner) {
            sb.append("|" + this.owner.getName());
        }
        else
        {
            sb.append("|");
        }
        return  sb.toString();
    }

    public static List<ISock> convertToClientList(List<SockData> inlist)
    {
        List<ISock> result = new ArrayList<>();
        for (SockData sock:inlist) {
           result.add(new SockDataClient(sock));
        }
        return result;
    }
    @Override
    public String getFieldByIndex(int index)
    {
        String[] elements = this.toString().split("\\|");
        try {
            return elements[index];
        }
        catch (IndexOutOfBoundsException ex)
        {
            return "";
        }
    }



    @Override
    public int getFieldsCount()
    {
        String[] elements = this.toString().split("|");
        return elements.length;
    }
}
