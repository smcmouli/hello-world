package com.sample.dp.decorator.util;

import java.time.Month;
import java.util.EnumSet;

/**
 * Created by sumacha on 03/08/17.
 */
public class OfferConstants {

    public enum Season {WINTER, SPRING, SUMMER, FALL}

    ;
    public EnumSet<Month> spring = EnumSet.of(Month.MARCH, Month.APRIL);
    public EnumSet<Month> summer = EnumSet.of(Month.MAY, Month.JUNE, Month.JULY, Month.AUGUST);
    public EnumSet<Month> fall = EnumSet.of(Month.SEPTEMBER, Month.OCTOBER);
    public EnumSet<Month> winter = EnumSet.of(Month.NOVEMBER, Month.DECEMBER, Month.JANUARY, Month.FEBRUARY);

    public static final String CONSOLIDATED_PRICE = "Consolidated Price";
    public static final String SEASONAL_OFFER = "Seasonal Offer";
    public static final String LOYALTY_OFFER = "Loyalty Offer";
    public static final String MERCHANT_BANK_OFFER = "Merchant Bank Offer";
    public static final String GST = "GST";
    public static final String GST_VALUE = "18";
}
