public class GetPrimes {
    public boolean isFactor(int num, int denom) {
        return num % denom == 0;
    }

    public void getPrimes(int N) {
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (isFactor(i, j)) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GetPrimes obj = new GetPrimes();
        obj.getPrimes(20);
    }
}
