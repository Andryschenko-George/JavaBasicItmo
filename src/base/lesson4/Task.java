package base.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    //General
    Scanner scanner = new Scanner(System.in);

    //Part1

    public void oddNumbers(){
        for (int i = 0; i < 100; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
    public void divisionBy (){
        for (int i = 0; i < 100; i++) {
            if (i%5==0 && i%3==0){
                System.out.println(i + " делится на 3 и на 5");
            }else if (i%5==0){
                System.out.println(i + " делится на 5");
            }else if (i%3==0){
                System.out.println(i + " делится на 3");
            }
        }
    }
    public boolean correctAmount(){
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            if (i==2){
                System.out.println("Введите сумму: ");
                ints[i] = scanner.nextInt();
            } else {
                System.out.println("Введите число " + i + ": ");
                ints[i] = scanner.nextInt();
            }
        }
        if (ints[0]+ints[1]==ints[2]){
            return true;
        }else{
            return false;
        }

    }
    public boolean correctAscending(){
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Введите число " + i + ": ");
            ints[i] = scanner.nextInt();
        }
        if (ints[0]<ints[1] && ints[1]<ints[2]){
            return true;
        }else{
            return false;
        }
    }
    public boolean checkingThree(int...ints){
        if (ints.length>=2){
            System.out.println("Array: "+Arrays.toString(ints));
            if (ints[0]==3 || ints[ints.length-1]==3){
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("Массив должен содеражать больше 1 элемента");
            return false;
        }
    }
    public boolean checkingOneThree(int...ints){
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]==1 || ints[i]==3){
                return true;
            }
        }
        return false;
    }

    //Part2
    public String checkingArraySorting(int...ints){
        for (int i = 0; i < ints.length-1; i++) {
            if (ints[i]>ints[i+1]){
                return "Please, try again";
            }
        }
        return "OK";
    }

    public void setArray (){
        System.out.println("Введите длинну масива: ");
        int[] ints = new int[scanner.nextInt()];
        System.out.println("Введите массив : ");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("Result: "+Arrays.toString(ints));
    }
    public void changeFirstAndLast (int...ints ){
        System.out.println("Array 1: "+Arrays.toString(ints));
        int temp = ints[0];
        ints[0]=ints[ints.length-1];
        ints[ints.length-1]=temp;
        System.out.println("Result: "+Arrays.toString(ints));
    }
    public String firstUnique (int...ints ){
        for (int i = 0; i < ints.length; i++) {
            int counter = 0;
            for (int j = 0; j < ints.length; j++) {
                if (i!=j) {
                    if (ints[i] == ints[j]) {
                        counter++;
                    }
                }
            }
            if (counter == 0) {
                return ("Первое уникальное число: " + ints[i]);
            }
        }
        return "В массиве нет уникальных чисел";
    }
    public int[] mergeSort(int... ints) {
        System.out.println(Arrays.toString(ints));

        if (ints.length < 2) {
            return ints;
        }

        int mid = ints.length / 2;

        int[] left = new int[mid];

        int[] right;
        if (ints.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = ints[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }
}


