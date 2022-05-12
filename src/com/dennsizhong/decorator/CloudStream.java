package com.dennsizhong.decorator;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("Storing to cloud: " + data);
    }
}
