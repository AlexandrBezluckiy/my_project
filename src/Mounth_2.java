public class Mounth_2 {
    public static void main(String[] args) {
        String[] Mounth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String result = "";
        for ( int i = 0; i < Mounth.length; i++) {
            result += Mounth[i];
            if (i == Mounth.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
