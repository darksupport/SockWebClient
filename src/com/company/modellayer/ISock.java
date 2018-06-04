package com.company.modellayer;

/**
 * Created by Brainacad4 on 31.05.2018.
 */
public interface ISock {
    String getColor();

    void setColor(String value);

    OwnerData getOwner();

    void setOwner(OwnerData value);

    int getSize();

    void setSize(int value);

    String getType();

    void setType(String value);

    int getFieldsCount();
    String getFieldByIndex(int index);
}
