public class sr_num {
    public static void main(String[] args) {
        float sum = 0;
        int i = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        sum = sum / i;
        System.out.println(sum);
    }
}
