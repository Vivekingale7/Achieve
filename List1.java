package Collection;

import java.util.*;
import java.util.List;

public class List1 {
    public static void main(String[] args) {

        List<Integer> lst = new ArrayList();

        lst.add(10);
        lst.add(20);
        lst.add(40);

        System.out.println(lst);

        lst.add(1000);

        System.out.println(lst);
    }
}
