package comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,0,15,5,20);
        System.out.println(list);
        //Ascending sort
        Collections.sort(list);
        System.out.println(list);
        //Descending order
        Collections.sort(list,new MyComparator());
        System.out.println(list);
        Collections.sort(list,(o1,o2)->(o1>o2)?-1:(o2<o1)?1:0);
        //Ascending sort
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
        //Descending order
        // list.sort((o1,o2)->o2.compareTo(o1)); either one ok
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println(list);



    }


}
