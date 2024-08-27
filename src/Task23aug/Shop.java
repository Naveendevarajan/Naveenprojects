package Task23aug;

public class Shop extends dealer {
    int boostMRP = 100;
    int boostSellingPrice = 98;

    public Shop(int boostMRP) {
        super(boostMRP);
        System.out.println("The MRP of shop " + this.boostMRP);
        System.out.println("The MRP of Dealer " + super.boostMRP);
    }

}