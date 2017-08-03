package com.sample.dp.decorator.offer;

import com.sample.dp.decorator.core.Product;

/**
 * Created by sumacha on 02/08/17.
 */
public abstract class Offer {

    public abstract float getDiscountAmount(Product product);

    public abstract float getCurrentPrice(Product product);

    public abstract String getDescription();

}

