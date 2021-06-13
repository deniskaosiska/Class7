public class FactoryCar {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Drivable myBMW = CarFactory.getCar("BMW");
        myBMW.drive();
        Drivable myFiat = CarFactory.getCar("Fiat");
        myFiat.drive();
        Drivable myPorshce = CarFactory.getCar("Porsche");
        myPorshce.drive();
    }
}
