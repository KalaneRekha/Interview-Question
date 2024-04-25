import java.util.*;
 class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a First no.");

   
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i=0;i<n;i++) {
            numbers[i] = scanner.nextInt();
        }
	System.out.println("Enter a Second no.");
        int Q = scanner.nextInt();

        for (int i=0;i<Q;i++) {
            int query = scanner.nextInt();
            int count = 0;
            for (int num : numbers) {
                if (num == query) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(count);
            } else {
                System.out.println("NOT PRESENT");
            }
        }

        scanner.close();
    }
}
