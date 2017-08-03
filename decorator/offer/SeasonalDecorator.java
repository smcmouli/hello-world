package com.sample.dp.decorator.offer;

import com.sample.dp.decorator.core.Product;
import com.sample.dp.decorator.util.OfferConstants;

import java.util.Date;

/**
 * Created by sumacha on 02/08/17.
 */
public class SeasonalDecorator extends OfferDecorator {


    float discountPercentage = 25;


    Date startDate, endDate;
    Offer offer;

    public SeasonalDecorator(Offer offer) {
        this.offer = offer;
    }

    /**
     * Returns the newly computed price , after reducing the discount amount
     *
     * @param product
     * @return
     */
    @Override
    public float getDiscountAmount(Product product) {
        float mrp = product.getMrp();
        int prodID = product.getProductId();
        //logic to compute discountPercentage based on productID
        float discountAmount = (discountPercentage * mrp) / 100;
        return discountAmount;
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

        return OfferConstants.SEASONAL_OFFER;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
