import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Lawrence");

        Car myCar = new Car(25.5,"QEQWE@E@", Color.BLUE, true);
        Car LarryCar = new Car(32.3, "HELO233", Color.DARK_GRAY,false);
        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Larry's Car License Plate: " + LarryCar.licensePlate);
        myCar.changePaintColor(Color.RED);
        System.out.println(LarryCar.paintColor);
        System.out.println(myCar.paintColor);
    }
}