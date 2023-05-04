public class Second_Array {
    public static void main(String[] args) {
        int[] daysInMonth = new int[12]; //создаем новый массив и руками заполняем каждый его элемент
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;
        // выводим все элементы массива
        for ( int i = 0; i < daysInMonth.length; i++) {
            System.out.println(daysInMonth[i]);
        }
    }
}
