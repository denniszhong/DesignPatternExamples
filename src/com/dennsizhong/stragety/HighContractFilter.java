package com.dennsizhong.stragety;

public class HighContractFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying High Contract Filter");
    }
}
