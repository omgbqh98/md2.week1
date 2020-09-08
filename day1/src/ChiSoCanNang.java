import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input weight");
        double weight = scanner.nextDouble();
        System.out.println("input height");
        double height = scanner.nextDouble();
        if(height <0 || weight <0){
            System.out.println("không hợp lệ");
            return;
        }
        double BIM = weight/Math.pow(height,2);
//        if(BIM<18.5){
//            System.out.println("gầy quá");
//        }else if (BIM>=18.5&&BIM<=25.0){
//            System.out.println("bình thường");
//        }else if (BIM>=25.0 && BIM<30.0){
//            System.out.println("béo");
//        }else if (BIM>=30.0){
//            System.out.println("béo phì");
//        }



        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (BIM < 18)
            System.out.printf("%-20.2f%s", BIM, "Underweight");
        else if (BIM < 25.0)
            System.out.printf("%-20.2f%s", BIM, "Normal");
        else if (BIM < 30.0)
            System.out.printf("%-20.2f%s", BIM, "Overweight");
        else
            System.out.printf("%-20.2f%s", BIM, "Obese");
    }
}
