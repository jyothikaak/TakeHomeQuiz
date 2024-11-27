public class Main {
    @FunctionalInterface
    public interface Sum{
        int sum(int a, int b);
    }
    public static void main(String[] args) {
        Sum sum = (a,b) -> {
            int total = 0;
            for(int i=a; i<=b; i++)
                total+=i;
            return total;
        };
        System.out.println(sum.sum(3,5));
    }
}