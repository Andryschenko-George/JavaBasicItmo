package base.lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaProgram {
    public static void main(String[] args) {
    //Part1
        Task task = new Task();
        task.oddNumbers();
        task.divisionBy();
        System.out.println("Результат "+ task.correctAmount());
        System.out.println("Результат "+ task.correctAscending());
        System.out.println("Результат "+task.checkingThree(1,5,6,4,1,3));
        System.out.println("Результат "+task.checkingOneThree(3,5,10,880,10));

    //Part2
        System.out.println(task.checkingArraySorting(1));
        task.setArray();
        task.changeFirstAndLast(1,2,3,4,5,6,7,8);
        System.out.println(task.firstUnique(1,1));
        System.out.println("Результат сортировки " + Arrays.toString(task.mergeSort(1,4,6,7,9,0,2,1,10)));
    }
}
