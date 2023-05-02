public class seconds {
    public static void main(String[] args) {
        int seconds = 10;
        int day = seconds / 86400;
        int hour = (seconds - (86400*day))/3600;
        int min = (seconds - (86400*day) - (3600*hour))/60;
        int sec = (seconds - (86400*day) - (3600*hour)- (60*min))%60;
        System.out.println("d: " + day + "\nhour: " + hour + "\nmin: " + min + "\nsec: " + sec);
    }
}
