package org.shan.lab2.mode2.way1;

public class EncryptAdapter extends EncryptAlgorithm implements Encrypt {

    @Override
    public String encryptStrong(String s) {
        return super.encryptAlgorithm2(super.encryptAlgorithm1(s));

    }

    @Override
    public String encryptWeak(String s) {
        return super.encryptAlgorithm1(s);
    }
}
