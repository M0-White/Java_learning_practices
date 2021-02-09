import java.util.Scanner;

public class operate
{
    public static Scanner sc = new Scanner(System.in);
    static int[] arr1;

    public static void main(String[] args)
    {
        input();
        output();
    }

    public static void input()
    {
        System.out.println("Program:Input array1.");
        System.out.print("User:");
        arr1 = array_input();
    }

    public static int[] array_input()//这是一个不需要先给定数组长度就能直接输入数组的方法
    {
        String Str = sc.nextLine();//输入字符串Str
        Str = Str.trim();//去掉字符串Str首尾的空格
        //System.out.println(Str);
        String[] split_array = Str.split("\\s+");//根据空白字符分割字符串Str
        /*//测试字符串分割效果
        System.out.println("Test output started");
        for(String s:split_array)
        {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println(split_array.length);//输出字符串分割后子字符串的数量
        System.out.println("Test output end");
        //*/
        int[] array = new int[split_array.length];//定义数组
        for(int i = 0; i < split_array.length; i++)
        {
            array[i] = Integer.parseInt(split_array[i]);//将分割得到的子字符串中的字符类文本转化为数字类文本赋值到数组中
        }
        /*//测试输出数组
        System.out.println("Test output started");
        for(int x:array)
        {
            System.out.print(x+" ");
        }
        System.out.println("\nTest output end");
        //*/
        return array;//返回数组
    }

    public static int handle(int[] arr)
    {
        int min_num=2100000000;
        for (int i : arr) {
            if (i < min_num) {
                min_num = i;
            }
        }
        return min_num;
    }

    public static void output()
    {
        System.out.println("Program:The minimum number of array is " + handle(arr1));
    }
}
