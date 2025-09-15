public class merge_array {
        public static void main(String[] args) {
            int a[] = {10, 20, 30, 40, 50};
            int b[] = {11, 12, 13};

            int c[] = zigzag(a, b);

            System.out.println("Merged array (zigzag):");
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i] + " ");
            }
        }

        static int[] zigzag(int[] x, int[] y) {
            int[] z = new int[x.length + y.length];
            int i = 0, j = 0, k = 0;

            // elements from both arrays
            while (i < x.length && j < y.length) {
                z[k++] = x[i++];
                z[k++] = y[j++];
            }

            // remaining elements from x
            while (i < x.length) {
                z[k++] = x[i++];
            }

            //  remaining elements from y
            while (j < y.length) {
                z[k++] = y[j++];
            }

            return z;
        }
    }
