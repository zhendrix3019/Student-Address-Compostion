package discount;

public class SaleDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}