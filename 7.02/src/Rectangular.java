import java.util.Scanner;

public class Rectangular {
    Scanner sc = new Scanner(System.in);

    public double length;
    public double height;
    public Rectangular() {

    }

    public double getData() {
        System.out.println("Program:Please input data.");
        System.out.print("User:");

        return sc.nextDouble();
    }

    public void getParameter() {
        System.out.println("Program:Please input the length and height of the Rectangular.");
        this.length = getData();
        this.height = getData();
    }

    public double getSquare() {
        return height * length;
    }

    public static void main(String[] args) {
        Rectangular Rec = new Rectangular();
        Rec.getParameter();
        double square = Rec.getSquare();
        System.out.println(square);
    }

}
