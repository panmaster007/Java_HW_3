// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее ариф. значение

import java.util.*;

public class Task_1 {

    static void delOdd(List<Integer> arrList) {
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        } 
        System.out.println("После удаления четных: " + arrList);
    
    
    }
    static Integer Maxx(List<Integer> arrList) {
        int max = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        } 
        return max;
    }
    static Integer Minn(List<Integer> arrList) {
        int min = arrList.get(0); 
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        } 
        return min;
    }
     static Double Aver(List<Integer> arrList) {
        int sum = 0; 
        double average;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        } 
        average = sum / arrList.size();
        return average;
    }
    
    public static void main(String[] args) {
        int total = 0; // сумма элементов списка
        int count; // количество элементов списка
        int listMax; // минимальное значение
        int listMin; // максимальное значение
        double average = 0;

        List<Integer> list_1 = new ArrayList(Arrays.asList(2, 15, 4, 7, 18, 19, 9, 6, 3, 5));
                        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Исходный список: " + list_1);
        System.out.println("Минимальное значение: " + Minn(list_1));
        System.out.println("Максимальное значение: " + Maxx(list_1));
        System.out.println("Среднее значение: " + Aver(list_1));
        delOdd(list_1);
        System.out.println(list_1);
        
        System.out.println();
        System.out.println();
        System.out.println();
    }
}