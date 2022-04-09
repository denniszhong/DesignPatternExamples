package com.dennsizhong.abstractfactory;

public abstract class CreditCard {
    private int cardNumberLength;
    private int cscNumber;

    public int GetCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
