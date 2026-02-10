package base.lesson5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Task task = new Task();
        //part1
        System.out.println(task.longestword("What is Lorem Ipsum? Lorem123 Ipsum is simply dummy text of the printing" +
        "and typesetting123 industry. + Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived" +
        "not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It" +
        "was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more" +
        " recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        //part2
        System.out.println(task.palindrome("дед"));
        //part3
        System.out.println(task.bword("бяка и бяка на крыше"));
        //part4
        System.out.println(task.isSubstring("What is Lorem Ipsum? Lorem123 Ipsum is simply dummy text of the printing" +
        " and typesetting123 industry.","Lorem"));
        //part5
        System.out.println(task.invertWords());
    }
}
