import java.util.Scanner;
public class HurricaneSpeed {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the wind speed of the storm: ");
        int speed = scn.nextInt();

        if (speed < 74){
            System.out.println("Not a Hurricane.");
        }
        if ((speed > 73)&&(speed < 96)){
            System.out.println("It is a Category 1 Hurricane.");
        }
        if ((speed > 95)&&(speed < 111)){
            System.out.println("It is a Category 2 Hurricane.");
        }
        if ((speed > 110)&&(speed < 130)){
            System.out.println("It is a Category 3 Hurricane.");
        }
        if ((speed > 129)&&(speed < 157)){
            System.out.println("It is a Category 4 Hurricane.");
        }
        if (speed >= 157){
            System.out.println("It is a Category 5 Hurricane.");
        }
    }
}
