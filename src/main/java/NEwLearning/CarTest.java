package NEwLearning;

import org.checkerframework.checker.units.qual.C;

public class CarTest {
    public static void main(String[] args) {

        CarFactory carFactory=new CarFactory();

        Car suv=carFactory.getCar("suV");
        suv.assemble();
    }
}
