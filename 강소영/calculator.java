import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        int num=0, num1=0, num2=0;

        System.out.println("==== 지원하는 연산 ====");
        System.out.println("1.  +  (더하기)");
        System.out.println("2.  -  (빼기)");
        System.out.println("3.  *  (곱하기)");
        System.out.println("4.  /  (몫)");
        System.out.println("5.  %  (나머지)");
        System.out.println("6.  종료");
        System.out.println("=======================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("수행하고 싶은 연산을 선택해주세요>>");
        num = scanner.nextInt();

        if (num != 6) {
            System.out.print("첫번째 피연산자를 입력해주세요>>");
            num1 = scanner.nextInt();
            System.out.print("두번째 피연산자를 입력해주세요>>");
            num2 = scanner.nextInt();
        }
        else if (num == 6) {
            System.out.println("프로그램이 종료되었습니다.");
        }

        if (num == 1) {
            System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
        }
        else if (num == 2)
        {
            System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);
        }
        else if (num == 3)
        {
            System.out.printf("%d * %d = %d%n", num1, num2, num1 * num2);
        }
        else if (num == 4)
        {
            System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
        }
        else if (num == 5)
        {
            System.out.printf("%d %% %d = %d%n", num1, num2, num1 % num2);
        }

    }
}
