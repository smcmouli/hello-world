package com.sample.dp.decorator.payment;

import java.util.Date;

/**
 * Created by sumacha on 03/08/17.
 */
public class CreditCard implements IPayment {
    @Override
    public String getPaymentMethod() {
        return null;
    }

    @Override
    public Float getPaymentAmount() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }
}
