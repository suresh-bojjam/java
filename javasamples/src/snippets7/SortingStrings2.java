package snippets7;

/**
 * Created by root on 13/3/16.
 */
public class SortingStrings2 {
    public static void main(String[] args) {
        String[] strings = { "java", "c", "python ", "php", "perl" };
        /**
         * Bubble sort mechanism on string with comareTo
         */
        int length=strings.length;
        String t;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                if(strings[i].compareTo(strings[j])>0){
                 t=strings[i];
                 strings[i]=strings[j];
                 strings[j]=t;
                }
            }
        }
        for (String str:
             strings){
            System.out.printf(str+", ");
        }
    }
}
