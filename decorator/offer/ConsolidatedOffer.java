package com.sample.dp.decorator.offer;

import com.sample.dp.decorator.core.Product;
import com.sample.dp.decorator.util.OfferConstants;

/**
 * Created by sumacha on 02/08/17.
 */
public class ConsolidatedOffer extends Offer {


    @Override
    public float getDiscountAmount(Product product) {
        return 0;
    }

    @Override
    public float getCurrentPrice(Product product) {
        return 0;
    }

    @Override
    public String getDescription() {

        return OfferConstants.CONSOLIDATED_PRICE;
    }
}
