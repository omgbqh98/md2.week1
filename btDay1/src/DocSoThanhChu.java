import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input number: ");
        String only="";
        int tram,chuc,donVi;
        int number = scanner.nextInt();

        tram=number/100;
        chuc=(number%100)/10;
        donVi=(number%100)%10;
        if(number<0 && number>=1000){
            System.out.println("số không hợp lệ");
        }
            switch (tram){
                case 1:
                    System.out.print("one hundred");break;
                case 2:
                    System.out.print("two hundred");break;
                case 3:
                    System.out.print("three hundred");break;
                case 4:
                    System.out.print("four hundred");break;
                case 5:
                    System.out.print("five hundred");break;
                case 6:
                    System.out.print("six hundred");break;
                case 7:
                    System.out.print("seven hundred");break;
                case 8:
                    System.out.print("eight hundred");break;
                case 9:
                    System.out.print("nine hundred");break;
        }
        switch (chuc)
        {
            case 1:
                System.out.print("ten");break;
            case 2:
                System.out.print("twenty");break;
            case 3:
                System.out.print("thirty");break;
            case 4:
                System.out.print("fourty");break;
            case 5:
                System.out.print("fivety");break;
            case 6:
                System.out.print("sixty");break;
            case 7:
                System.out.print("seventy");break;
            case 8:
                System.out.print("eightty");break;
            case 9:
                System.out.print("ninety");break;
        }
        switch (donVi)
        {
            case 1:
                System.out.print("one");break;
            case 2:
                System.out.print("two");break;
            case 3:
                System.out.print("three");break;
            case 4:
                System.out.print("four");break;
            case 5:
                System.out.print("five");break;
            case 6:
                System.out.print("six");break;
            case 7:
                System.out.print("seven");break;
            case 8:
                System.out.print("eight");break;
            case 9:
                System.out.print("nine");break;
        }

        }
    }

