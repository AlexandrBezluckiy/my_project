public class fourth_array {
    public static void main(String[] args) {
        // создаем массив из 10 элементов
        int[] nums = new int[10];
        // по очереди перебираем каждый элемент
        for (int i = 0; i < nums.length; i++){
            // проверяем что первый элемент не 0 т.к далее будем обращаться к предыдущему элементу массива
            if (i == 0){
                nums[i] = i + 10;
            }
            else {
                // присваиваем текущему элементу массива, значение предыдущего, увеличенного на 10
                nums[i] = nums[i-1] + 10;
            }
        }
        // перебираем все элементы массива для вывода элементов массива
        for (int k = 0; k < nums.length; k++) {
            System.out.println(nums[k]);
        }
    }
}