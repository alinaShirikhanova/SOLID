package open_close;

public class BonusSystemPlatinum extends BonusSystem3 {
    public BonusSystemPlatinum(double price) {
        super(price);
    }

    public double getPrice(){
        return super.getPrice() * 0.7;
    }
}