package bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BT1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(10);
        int numer;
        for (int i = 0; i < 10; i++) {
            numer =(int) Math.floor(Math.random() * 20);
            array.add(numer);
        }
        System.out.println(array);

        System.out.println("Số lớn nhất: " + Collections.max(array));

    }
}
