package org.shan.lab2.mode3;

public class DataProcessKNN extends DataProcess {

    @Override
    String[] classifyData(String data) {
        return data.split(",");
    }
}
