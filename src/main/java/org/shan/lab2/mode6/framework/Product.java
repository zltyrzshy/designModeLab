package org.shan.lab2.mode6.framework;

public interface Product extends Cloneable{
    void use(String s);
    Product createClone();
    Product createDeepClone();
}
