package discount;

public class LiquidationDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}