import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkNum;
        int num1 = 0;
        int num2 = 1;
        int sum;
        boolean exists=false;
        do {
            System.out.println("Enter a number to check");
            checkNum = scanner.nextInt();
        } while (checkNum < 0);
        if (checkNum == num1 || checkNum == num2) {
            exists=true;
            System.out.println(exists);
        } else {
            for (int i = 1; i <= checkNum; i++) {
                sum = num1 + num2;
                if (checkNum==sum) {
                    exists=true;
                    System.out.println(exists);
                    break;
                }
                num1 = num2;
                num2 = sum;
                if (sum>checkNum){
                    exists=false;
                    System.out.println(exists);
                    break;
                }
            }
        }
    }
}