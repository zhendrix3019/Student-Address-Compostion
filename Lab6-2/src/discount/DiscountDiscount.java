package discount;

public class DiscountDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
