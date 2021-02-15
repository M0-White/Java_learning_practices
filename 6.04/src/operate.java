import java.util.Scanner;

public class operate {
    static Scanner sc = new Scanner(System.in);
    static int[][] arr;

    public static void getArr() {

        int height,length;
        System.out.println("Program:Please input the height number array.");
        System.out.print("User:");
        height = sc.nextInt();

        System.out.println("Program:Please input the height number array.");
        System.out.print("User:");
        length = sc.nextInt();
        arr = new int[height][length];

        System.out.println("Program:Now please input the array.");
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public static void handle() {
        System.out.println("Program:the array you input was:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Program:the array changed from the the array you just input is:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getArr();
        handle();
    }
}
