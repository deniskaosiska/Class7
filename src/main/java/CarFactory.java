public class CarFactory {
    static Drivable getCar(String car){
        if(car == null){
            return null;
        }
        if (car.equalsIgnoreCase("BMW")){
            return new BMW();
        } else if(car.equalsIgnoreCase("Fiat")){
            return new Fiat();
        } else if(car.equalsIgnoreCase("Porsche")){
            return new Porsche();
        }
        return null;
    }
}
