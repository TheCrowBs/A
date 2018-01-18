import java.util.Scanner;
public class CtoF {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double c =Double.parseDouble(scanner.nextLine());

        double f = c*1.8 + 32;
        System.out.printf("%.2f", f);
    }
}
// °F = °C × 1,8 + 32
// Закръглете резултата до 2 знака след десетичната точка.