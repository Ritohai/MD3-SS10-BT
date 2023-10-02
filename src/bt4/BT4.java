package bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BT4 {
    public static void main(String[] args) {

        String string = "Rekkei Academy để nông dân biết code";
        List<String> list = new ArrayList<>();
        //        Cách 1: Dùng Arrays.asList
        List<String> arr = Arrays.asList(string.split(" "));
        System.out.println(arr);
        for (String str : arr) {
            if (str.length() > 3) {
                list.add(str);
            }
        }
        System.out.println(list);


//        Cách 2: Không dùng Arrays.asList
        String[] str2 = string.split(" ");
        List<String> list1 = new ArrayList<>();
        for (String str1 : str2) {
            if (str1.length() > 3) {
                list1.add(str1);
            }
        }
        System.out.println(list1);
    }
}
