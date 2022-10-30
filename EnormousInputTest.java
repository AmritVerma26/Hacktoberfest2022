import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int Count = 0;
        for(int i=1; i<=n; i++) {
            int num = sc.nextInt();
            if(num % k == 0) {
                Count++;
            }
        }
        System.out.println(Count);
        sc.close();
    }
}
