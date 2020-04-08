import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao nam can check:");
        int year = scanner.nextInt();


        if ((year%4==0 && year%100!=0) || year%400==0){
            System.out.println("Nam "+year+" la nam nhuan!");
        }else {
            System.out.println("Nam "+year+" khong phai la nam nhuan!");
        }
    }
}
