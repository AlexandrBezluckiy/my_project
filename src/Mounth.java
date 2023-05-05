public class Mounth {
    public static void main(String[] args) {
        String[] Mounth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for ( int i = 0; i < Mounth.length; i++) {
            if (i == Mounth.length - 1) {
                System.out.printf(Mounth[i] + ".");
            } else {
                System.out.printf(Mounth[i] + ", ");
            }
        }
    }
}
