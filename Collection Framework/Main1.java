import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(98);
        arr.add(200);
        arr.add(205);
        arr.add(15);

        System.out.println("Array List 1 : " + arr);

        arr.remove(3);

        System.out.println("Array List 2 : " + arr);
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(29);
        arr2.add(46);

        arr.addAll(arr2);

        System.out.println("Array List 3 : " + arr);
        arr.removeAll(arr2);
        System.out.println("Array List 4 : " + arr);
        
        System.out.println("Sixe of arr: " + arr.size());
        System.out.println("Sixe of arr2: " + arr2.size());

        arr2.clear();
        System.out.println("Sixe of arr2: " + arr2.size());

        System.out.println(arr.get(3));
        arr.set(3 , 199);
        System.out.println(arr.get(3));
        System.out.println("Array List 5 : " + arr);

        System.out.println(arr.contains(199));

        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(100);
        c.add(15);
        c.add(700);
        c.add(3);

        System.out.println(c);

        Collections.sort(c);
        System.out.println(c);

        Collections.sort(arr);
        System.out.println("Array List 6 : " + arr);


        System.out.println();
    }
}



