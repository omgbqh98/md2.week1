import java.util.Scanner;

public class KtNamNhuan {
    public static void main(String[] args) {
//        cach1:
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year: ");
        int year = scanner.nextInt();
        if(year<=0){
            System.out.println("năm không hợp lệ");
            return;
        }
        if(year%4==0&&year%100!=0){
            System.out.println("year "+ year+" là năm nhuận");
        }else if(year%100==0 && year % 400!=0){
            System.out.println("year "+year+ " không phải năm nhuận");
        }else if(year%100==0 && year%400==0){
            System.out.println("year "+year+" is year nhuận");
        }else {
            System.out.println("năm không phải năm nhuận");
        }





//cach2:
        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }




//cach3:
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}






