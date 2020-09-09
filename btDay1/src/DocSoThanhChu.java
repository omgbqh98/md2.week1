import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input number: ");
        String teen = "teen";
        String one="";
        String tens="";
        int number = scanner.nextInt();
        if(number<0 && number>=1000){
            System.out.println("số không hợp lệ");
        }
        if(number<=12 && number >=1){
            switch (number){
                case 1:
                   one = "one";
                   break;
                case 2:
                   one= "two";
                   break;
                case 3:
                    one= "three";
                    break;
                case 4:
                    one="four";
                    break;
                case 5:
                    one="five";
                    break;
                case 6:
                    one="six";
                    break;
                case 7:
                    one="seven";
                    break;
                case 8:
                    one="eight";
                    break;
                case 9:
                    one="nine";
                    break;
                case 10:
                    one="ten";
                    break;
                case 11:
                    one="eleven";
                    break;
                case 12:
                    one="twelve";
                    break;
                default:
                    one="";
            }
            if(one!="") System.out.printf("%s",one);
        }
        if(number>=13 && number<=19){
            switch (number){
                case 13,14,15,16,17,18,19:
                    tens = one +"teen";
            }
        }
    }
}
