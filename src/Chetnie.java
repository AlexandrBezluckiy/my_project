public class Chetnie {
    public static void main(String[] args) {
        int num = 1000;
        while (num >= 0) {
            if (num%2 != 0) {
                num--;
                continue;
            }
            System.out.println(num);
            num--;
        }
    }
}
