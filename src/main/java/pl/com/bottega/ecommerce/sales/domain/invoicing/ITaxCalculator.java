package pl.com.bottega.ecommerce.sales.domain.invoicing;

public interface ITaxCalculator {
    public Tax calculateTax(RequestItem requestItem);
}
