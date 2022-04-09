package com.dennsizhong.abstractfactory;

public abstract class CreditCardFactory {

    // This is a static method
    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }

    // There are interfaces we pass through to concrete CreditCardFactory class
    // that need to be implemented.
    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
