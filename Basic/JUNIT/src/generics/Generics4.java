package generics;
//type inference and generic method
import java.util.Arrays;
import java.util.List;

public class Generics4 {
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(1, 2, 3,null);
        List<String>  ls = Arrays.asList("one", "two", "three",null);
        printList1(li);
        printList(ls);
    }
    public static void printList1(List<Integer> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
}