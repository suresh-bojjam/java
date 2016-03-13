package snippets7;

import java.util.Arrays;

/**
 * Created by root on 13/3/16.
 */
public class SortingStrings {
    public static void main(String[] args) {
        String[] strings = { "java", "c", "python ", "php", "perl" };
        Arrays.sort(strings);
        for (String str:
             strings) {
            System.out.print(str+", ");
        }
    }
}
