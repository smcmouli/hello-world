package com.sample.dp.decorator.test;

import com.sample.dp.decorator.core.Product;
import com.sample.dp.decorator.offer.*;

/**
 * Created by sumacha on 02/08/17.
 */
public class TestOffer {

    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.setProductId(1);
        prod1.setMrp(1200);

        System.out.println("Initial Price : " + prod1.getMrp());
        Offer offer = new ConsolidatedOffer();

        offer = new SeasonalDecorator(offer);
        System.out.println(offer.getDescription() + " Discount " + offer.getDiscountAmount(prod1));
        System.out.println(offer.getDescription() + " Price " + offer.getCurrentPrice(prod1));

        offer = new LoyaltyDecorator(offer);
        System.out.println(offer.getDescription() + " Discount " + offer.getDiscountAmount(prod1));
        System.out.println(offer.getDescription() + " Price " + offer.getCurrentPrice(prod1));

        offer = new MerchantBankDecorator(offer);
        System.out.println(offer.getDescription() + " Discount " + offer.getDiscountAmount(prod1));
        System.out.println(offer.getDescription() + " Price " + offer.getCurrentPrice(prod1));

        offer = new GSTDecorator(offer);
        System.out.println(offer.getDescription() + " Tax% " + offer.getDiscountAmount(prod1));
        System.out.println(offer.getDescription() + " Price " + offer.getCurrentPrice(prod1));

    }
}
