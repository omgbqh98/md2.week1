import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        System.out.println("input month: ");
//        int month = scanner.nextInt();
//        switch (month){
//            case 1,3,5,7,8,10,12:
//                System.out.println("has 31 day");
//                break;
//            case 2:
//                System.out.println("has 28 or 29");
//                break;
//            case 4,6,9,11:
//                System.out.println("has 30 day");
//            default:
//                System.out.println("month illegal");
//        }


        Scanner scanner = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = scanner.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (daysInMonth != "") System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");

    }


}
