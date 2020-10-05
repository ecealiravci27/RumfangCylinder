package RumfangCylinder;
import java.util.Scanner;

public class RumfangCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("THE PERFECT CYLINDER VOLUME CALCULATOR (using only radius and height! wow!)");

        // radius:
        System.out.println("Please enter radius of the cylinder (cm):");
        int r = scan.nextInt();

        // height:
        System.out.println("Please enter height of the cylinder (cm):");
        int h = scan.nextInt();

        // volume calculation:
        double volume = (r*r)*Math.PI*h;

        // translates cm3 to m3 if volume is greater than 1000
        if (volume > 1000) {
            System.out.println("The volume of the cylinder is " + (int)volume/1000000 + " m3");
        }

        else {
            System.out.println("The volume of the cylinder is " + (int)volume + " cm3");
        }
    }

//I kan umuligt finde fejl i vores perfekte program 10hi B-)

}
