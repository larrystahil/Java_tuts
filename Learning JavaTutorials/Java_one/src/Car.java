import java.awt.*;

public class Car {
    //Data Types:
    //int
    //double
    //String
    //boolean

    Double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(double inputAverageMPG, String inputLicensePlate, Color inputPaintColor, boolean inputareTaillightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputareTaillightsWorking;

    }
    public void changePaintColor(Color newPaintColor){
        this.paintColor =newPaintColor;

    }
}
