import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        algo(num);
    }

    private static void algo(int num) {
        System.out.print(num);
        if(num%2 == 0)
            num = num /2;
        else
            num = num*3+1;
        if(num == 1) {
            System.out.print("->"+1);
            return;
        }else{
            System.out.print("->");
            algo(num);
        }

    }
}
