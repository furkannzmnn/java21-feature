package org.example.secuencedCollections;

import java.util.*;
import java.util.concurrent.ExecutorService;

public class Sequence {

    public static void main(String[] args)  {
        List<String> as = new ArrayList<>();


        LinkedHashSet<String> ss = new LinkedHashSet<>();
        ss.addFirst("fff");

        Set<String> sss = new HashSet<>();

        for (int i = 0; i <100; i++) {
            as.add(""+i);
            sss.add(""+i);
        }

        as.addFirst("furkan");
        as.addFirst("özmen");

        System.out.println(as.getLast());
        System.out.println(as.getFirst());
    }
}

