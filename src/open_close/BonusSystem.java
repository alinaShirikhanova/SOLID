package open_close;

public class BonusSystem {
    private double price;

    public BonusSystem(double price) {
        this.price = price;
    }

    public double getPrice(String bonus_status) {
        return switch (bonus_status) {
            case "PLATINUM" -> this.price * 0.7;
            case "GOLDEN" -> this.price * 0.8;
            case "SILVER" -> this.price * 0.9;
            default -> this.price;
        };
    }
}