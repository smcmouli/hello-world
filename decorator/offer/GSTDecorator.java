package com.sample.dp.decorator.offer;

import com.sample.dp.decorator.core.Product;
import com.sample.dp.decorator.util.OfferConstants;

/**
 * Created by sumacha on 03/08/17.
 */
public class GSTDecorator extends OfferDecorator {
    public static final float GST_VALUE = 18;
    Offer offer;

    public GSTDecorator(Offer offer) {
        this.offer = offer;
    }

    @Override
    public float getDiscountAmount(Product product) {
        return GST_VALUE;
    }

    @Override
    public float getCurrentPrice(Product product) {
        float currentAmount = offer.getCurrentPrice(product);
        if (currentAmount <= 0) {
            currentAmount = product.getMrp();
        }
        return (currentAmount + (GST_VALUE / 100) * currentAmount);
    }

    @Override
    public String getDescription() {
        return OfferConstants.GST;
    }
}
