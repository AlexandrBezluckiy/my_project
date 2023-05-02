public class day_night {
    public static void main(String[] args) {
        int time = 1;
        boolean night = time >= 23 || time <= 5;
        boolean g_weth = true;
        if (night) {
            System.out.println("Go to sleep");
        }
        if (!night && g_weth){
            System.out.println("Go to walk");
        }
        if (!night && !g_weth) {
            System.out.println("Read a book");
        }
    }

}
