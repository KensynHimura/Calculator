import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        System.out.println("Пожалуйста ставьте пробел после символов.\nВозможны арабские либо римские цифры от 1 до 10");
        Scanner scan = new Scanner(System.in);
        RomanToInt romanToInt = new RomanToInt();
        romanToInt.swither(scan.next(), scan.next().charAt(0), scan.next());

        }


    }
