public class P48 {
    public static void main(String[] args) {

        // Increasing part
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i);

                if (j < i) {
                    System.out.print(" * ");
                }
            }

            System.out.println();
        }

        // Decreasing part
        for (int i = 3; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(i);

                if (j < i) {
                    System.out.print(" * ");
                }
            }

            System.out.println();
        }
    }
}