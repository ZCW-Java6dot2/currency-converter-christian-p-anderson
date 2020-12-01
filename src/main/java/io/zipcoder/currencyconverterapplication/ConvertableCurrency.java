package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.USDollar;
import static io.zipcoder.currencyconverterapplication.CurrencyType.US_DOLLAR;
public interface ConvertableCurrency {

    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / getType().getRate();
    }

    CurrencyType getType();
}
