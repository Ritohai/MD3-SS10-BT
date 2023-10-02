package bt3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BT3 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) Math.floor(Math.random() * 20);
            array.add(number);
        }
        System.out.println("Mảng là: " + array);
        Collections.sort(array);
        List<Integer> array2 = new ArrayList<>();
        for (Integer num : array) {
            array2.add(num);
        }
        System.out.println("Mảng đã sắp xếp là: " + array2);
    }
}
