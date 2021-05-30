import java.util.Scanner;

public class operate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        input();
        handle();
        output();
    }

    public static void input()
    {

    }

    public static void handle()
    {

    }

    public static void output()
    {
        if(sc.nextInt() < 0) System.out.println(sc.nextInt()/(-10));
    }
}

