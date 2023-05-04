public class Array_homework {
    public static void main(String[] args) {
        int[] right_dir = new int[900];
        for (int i = 0; i < right_dir.length; i++) {
            right_dir[i] = 100 + i;
        }
        int[] left_dir = new int[right_dir.length];
        for (int k = (right_dir.length - 1); k >= 0; k--) {
            left_dir[k] = right_dir[(right_dir.length - (k + 1))];
        }
        for (int j : left_dir) {
            System.out.println(j);
        }
    }
}
