package com.sample.dp.decorator.offer;

import com.sample.dp.decorator.core.Product;
import com.sample.dp.decorator.util.OfferConstants;

/**
 * Created by sumacha on 02/08/17.
 */
public class MerchantBankDecorator extends OfferDecorator {

    Offer offer;

    public MerchantBankDecorator(Offer offer) {
        this.offer = offer;
    }

    @Override
    public float getDiscountAmount(Product product) {
        return 40;
    }

    @Override
    public float getCurrentPrice(Product product) {


        float currentAmount = offer.getCurrentPrice(product);
        if (currentAmount <= 0) {
            currentAmount = product.getMrp();
        }
        return currentAmount - getDiscountAmount(product);
    }

    @Override
    public String getDescription() {
        return OfferConstants.MERCHANT_BANK_OFFER;
    }
}
