import java.util.Scanner;

public class Operate {
    Scanner sc = new Scanner(System.in);

    private int variate;

    private void inputVariate() {
        System.out.println("Program:Please input the variate with integer number.");
        System.out.print("User:");
        variate = sc.nextInt();
    }

    private int getVariate() {
        return this.variate;
    }

    public static void main(String[] args) {
        Operate op = new Operate();

        op.inputVariate();
        System.out.print("Program:The integer number you input is:" );
        System.out.print(op.getVariate());
    }
}
