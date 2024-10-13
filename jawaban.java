public class jawaban {
    public static void main(String[] args) {
        int n = 5;

        // Pola Bintang
        System.out.println("Output 1:");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pola Angka
        System.out.println();
        System.out.println("Output 2:");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
