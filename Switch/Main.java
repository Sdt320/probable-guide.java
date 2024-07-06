import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 1;
        Scanner s = new Scanner(System.in);

        while (flag == 1) {
            System.out.println("Hello, let's do Mathematical operations");
            System.out.print("Do you like to continue? (1 for yes, 0 for no): ");
            flag = s.nextInt();

            if (flag != 1) {
                break;
            }

            System.out.print("Enter the first value: ");
            int num1 = s.nextInt();
            System.out.print("Enter the second value: ");
            int num2 = s.nextInt();

            Operation o = new Operation(num1, num2);
            o.Mathopr();
        }
        s.close();
    }
}
