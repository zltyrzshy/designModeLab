package org.shan.lab2.mode2.way2;


public class EncryptAdapter extends Encrypt {
    EncryptAlgorithm encryptAlgorithm;

    EncryptAdapter() {
        encryptAlgorithm = new EncryptAlgorithm();
    }

    @Override
    public String encryptStrong(String s) {
        return encryptAlgorithm.encryptAlgorithm2(encryptAlgorithm.encryptAlgorithm1(s));

    }

    @Override
    public String encryptWeak(String s) {
        return encryptAlgorithm.encryptAlgorithm1(s);
    }
}
