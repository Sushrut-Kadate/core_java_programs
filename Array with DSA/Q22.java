class Q22
{
	public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {10, 20, 30, 40};

        boolean equal = true;

        // Check size
        if (array1.length != array2.length) {
            equal = false;
        } else {
            // Check elements
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    equal = false;
                    break;
                }
            }
        }

        if (equal) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}