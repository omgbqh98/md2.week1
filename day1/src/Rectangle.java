import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float S;
        Scanner scanner =new Scanner(System.in);
        System.out.println("input width:");
        float a = scanner.nextFloat();
        System.out.println("input height:");
        float b = scanner.nextFloat();
S=a*b;
        System.out.println("diện tích hình chữ nhật là: " +S);
    }
}
