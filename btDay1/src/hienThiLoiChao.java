import java.util.Scanner;

public class hienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input your firstname: ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println("Hello: "+ firstName+" "+lastName);
    }
}
