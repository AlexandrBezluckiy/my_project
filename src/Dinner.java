public class Dinner {
    public static void main(String[] args) {
        int money = 10;
        if (money > 500) {
            System.out.println("Купи пиццу");
            }
        else if (300 < money) {
            if (money < 500) {
                System.out.println("Купи шаурму");
            }
        }
        else if (100 < money) {
            if (money < 300) {
                System.out.println("Купи гамбургер");
            }
        }
        else if (money < 100) {
            System.out.println("Купи доширак");
            }
    }
}
