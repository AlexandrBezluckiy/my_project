public class loop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            i++;
            if (i == 5) {
                continue;
            }
            if ( i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
