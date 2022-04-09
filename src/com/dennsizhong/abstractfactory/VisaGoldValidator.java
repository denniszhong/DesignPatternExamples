package com.dennsizhong.abstractfactory;

public class VisaGoldValidator implements Validator{
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
