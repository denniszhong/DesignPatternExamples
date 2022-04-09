package com.dennsizhong.abstractfactory;

public class AmexPlatinumValidator implements Validator {
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
