package praktic.geometry;
import java.util.Scanner;

public class CircleMain {
    static String BLUE = "\u001B[34m";
    static String GREEN = "\u001B[32m";
    
    static void printGaris() {
        System.out.println("===================================");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        
        printGaris();
        System.out.print(BLUE + "Nama : " + GREEN);
        String nama = sc.nextLine();
        System.out.print(BLUE + "NIM  : " + GREEN);
        String nim = sc.nextLine();
        printGaris();
        System.out.println(BLUE + "Circle" + GREEN);
        printGaris();
        System.out.print(BLUE + "Isikan ID     : " + GREEN);
        circle.setId(sc.nextInt());
        System.out.print(BLUE + "Isikan Radius : " + GREEN);
        circle.setRadius(sc.nextDouble());
        printGaris();
        circle.printInfoCircle();
        printGaris();
    }
}
