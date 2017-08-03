package com.sample.dp.decorator.payment;

import java.util.Date;

/**
 * Created by sumacha on 03/08/17.
 */
public interface IPayment {

    String getPaymentMethod();

    Float getPaymentAmount();

    Date getDate();
}
