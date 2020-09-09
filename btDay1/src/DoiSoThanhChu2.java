import java.util.Scanner;


public class DoiSoThanhChu2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        int number = scanner.nextInt();
        String donVi="",chuc="",tram="";
        switch (number){
            case 1:
               tram = "one hundred";break;
            case 2:
                tram = "two hundred";break;
            case 3:
                tram = "three hundred";break;
            case 4:
                tram = "four hundred";break;
            case 5:
                tram = "five hundred";break;
            case 6:
                tram = "six hundred";break;
            case 7:
                tram = "seven hundred";break;
            case 8:
                tram = "eight hundred";break;
            case 9:
                tram = "nine hundred";break;
        }
        System.out.printf("%s",tram);
        switch (number){
            case 1:
                chuc= "ten";break;
            case 2:
                chuc= "twenty";break;
            case 3:
                chuc= "thirty";break;
            case 4:
                chuc= "fourty";break;
            case 5:
                chuc= "fivety";break;
            case 6:
                chuc= "sixty";break;
            case 7:
                chuc= "seventy";break;
            case 8:
                chuc= "eightty";break;
            case 9:
                chuc= "ninety";break;
        }
        System.out.printf("%s" +"%s",chuc,donVi);
if(number>=0 && number <=9) {
    switch (number) {
        case 1:
            donVi = "one";
            break;
        case 2:
            donVi = "two";
            break;
        case 3:
            donVi = "three";
            break;
        case 4:
            donVi = "four";
            break;
        case 5:
            donVi = "five";
            break;
        case 6:
            donVi = "six";
            break;
        case 7:
            donVi = "seven";
            break;
        case 8:
            donVi = "eight";
            break;
        case 9:
            donVi = "nine";
            break;
    }
    System.out.printf("%s", donVi);
}
    }
    }

