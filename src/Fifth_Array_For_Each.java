public class Fifth_Array_For_Each {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i*i;
        }
        for (int k : nums) {
            System.out.println(k);
        }
        /*
        char[] chars = new char[10];
        for (char ch : chars) {
            System.out.println(ch);
        }
         */
    }
}
