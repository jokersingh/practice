import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChandanProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String valueStr = sc.nextLine();
        String[] values = valueStr.split(" ");
        Set<Integer> set = new HashSet<>(num);
        for(int i = 0; i< num; i++){
            set.add(Integer.parseInt(values[i]));
        }
        for(int value:set)
        System.out.print(value);
    }
}
