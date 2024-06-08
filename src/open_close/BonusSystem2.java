package open_close;

public class BonusSystem2 {
    private double price;

    public BonusSystem2(double price) {
        this.price = price;
    }

    public double getPrice(String bonus_status) {
        return this.price * (1 - BonusStatuses.getDiscount(bonus_status));
    }
}