public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n");
        int i = 6;
        while(i > -7) {
            System.out.print(i + " ");
            i -= 2;
        }

        System.out.print("\n");
        int a = 10;
        int sum = 0;
        do {
            if(a % 2 != 0) {
               sum += a;
            }
            a++;
        } while(a <= 20);
        System.out.println(sum);
    }
}