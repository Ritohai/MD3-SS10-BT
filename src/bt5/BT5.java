package bt5;

import java.util.ArrayList;
import java.util.List;

public class BT5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String string = "duyệt list trên bằng vòng lặp tìm ra các phần tử có length nhỏ nhất.";
        String[] words = string.split(" ");
        String check = words[0];
        for (String str : words) {
            if (str.length() < check.length()) {
                check = str;
                list.clear();
               list.add(check);
            } else if (str.length() == check.length()) {
                list.add(str);
            }
        }
        System.out.println(list);
    }
}

