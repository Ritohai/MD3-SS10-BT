package bt2;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.List;

public class BT2 {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.floor(Math.random() * 20);
            arr1.add(number);
        }
        System.out.println("Mảng cũ: " + arr1);
        System.out.println(arr1.size());
        List<Integer> arr2 = new ArrayList<>();
        for (int i = arr1.size() - 1; i >= 0; i--) {
            arr2.add(arr1.get(i));
        }
        System.out.println("Mảng ngược lại là: " + arr2);
    }
}
