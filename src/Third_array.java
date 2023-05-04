public class Third_array {
    public static void main(String[] args) {
        // создаем новый массив
        int[] Number =  new int[10];
        // заполняем массив значением i*i
        for (int i = 0; i < Number.length; i++ ) {
            Number[i] = i*i;
        }
        // выводим элементы массива (намеренно используя другую переменную для перебора элементов массива
        for (int k = 0; k < Number.length; k++) {
            System.out.println(Number[k]);
        }
    }
}
