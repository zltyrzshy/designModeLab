package org.shan.lab2.mode4.connection;

import org.shan.lab2.mode4.framework.Factory;
import org.shan.lab2.mode4.framework.Product;

public class ConnectionFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new Connection(owner);
    }

    @Override
    protected void registerProduct(Product product) {

    }
}
