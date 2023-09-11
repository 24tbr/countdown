import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("программа обратного отсчета");
        countdown();
    }

    public static void countdown() {
        int a;
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int b=a;
        while (flag) {
            a++;
            if (a>=b+5) { flag=false;
            }
            System.out.println("Текущий отсчет: "+ a);
        }
    }



}