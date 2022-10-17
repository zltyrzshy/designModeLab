package org.shan.lab2.mode3;

public class DataProcessDecisionTree extends DataProcess {
    @Override
    String[] classifyData(String data) {
        return data.split(":");
    }
}
