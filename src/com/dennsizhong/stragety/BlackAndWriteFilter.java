package com.dennsizhong.stragety;

public class BlackAndWriteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Black and Write Filter");
    }
}
