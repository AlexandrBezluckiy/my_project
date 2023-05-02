public class if_operator {
    public static void main(String[] args) {
        int degry = 23;
        if (degry > 25) {
            System.out.println("Включить кондиционер");
            }
        else if (degry < 22) {
            System.out.println("Выключить кондиционер");
            }
        else {
            System.out.println("Кондиционер ничего не делает");
        }
    }
}
