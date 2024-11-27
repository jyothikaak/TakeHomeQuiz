public class Main {
    public static void main(String[] args) {
        Sum sum = (a, b) -> {
            int total = 0;
            for (int i = a; i <= b; i++) {
                total += i;
            }
            return total;
        };
        System.out.println(sum.sum(1,3));
    }
}