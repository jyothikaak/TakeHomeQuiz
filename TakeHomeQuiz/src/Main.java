public class Main {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        Sum sum = (a, b) -> {
            int total = 0;
            for (int i = a; i <= b; i++) {
                total += i;
            }
            return total;
        };
        System.out.println( sum.total(start, end));
        //sum
    }
}