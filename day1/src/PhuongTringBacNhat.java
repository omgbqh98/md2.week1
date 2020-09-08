import java.util.Scanner;

public class PhuongTringBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a");
        float a = scanner.nextFloat();
        System.out.println("input b");
        float b = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình có vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            System.out.printf("Equation pass with x = %f!\n" , (-b / a));
        }
    }

}
