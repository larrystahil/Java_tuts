import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5]; //integer array having index limitation

        numbers[0] = 31;
        numbers[1] = 46;
        numbers[2] = 33;
        numbers[3] = 78;
        numbers[4] = 10;

        System.out.println( "These are: " + numbers[0] + " " + numbers[1] + " " +  numbers[2] + " " + numbers[3] + " " + numbers[4]);

        int[] numbers2 = {31,46,33,78,10};
        Arrays.sort(numbers2);
        System.out.println(numbers2);//displays sorted array values without square bracket
        System.out.println(Arrays.toString(numbers2));//displaying sorted arrays in original format in square bracket

        System.out.println("Those are: "  + numbers2[0] + " " + numbers2[1] + " " +  numbers2[2] + " " + numbers2[3] + " " + numbers2[4]); //Straight integer array

        String[] myFavCars = {"Masarati","Ferrari", "Mclaren","Bugatti","Lambogini"};
        System.out.println("Those are: "  + myFavCars[0] + " " + myFavCars[1] + " " +  myFavCars[2] + " " + myFavCars[3] + " " + myFavCars[4] + ". The length of the Array is: " + myFavCars.length);
        myFavCars[3]= "Lotus";
        System.out.println("Look at this car: "+ myFavCars[3]);

        System.out.println(Array.get(myFavCars, 4));
        Arrays.sort(numbers2);

    }
}