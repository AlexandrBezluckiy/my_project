public class days {
    public static void main(String[] args) {
        int days = 15;
        int year = days / 365;
        int mon = (days % 365)/31;
        int day = days - (year * 365) - (mon * 31);
        System.out.println("Лет: " + year + "\nМесяцев: " + mon + "\nДней: " + day);
    }
}
