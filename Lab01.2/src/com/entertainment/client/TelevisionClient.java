package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

public class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 10);
        System.out.println(tv1);

        tv2.changeChannel(9);
        System.out.println(tv2);

        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        // use == to show if tvA and tvB refer to same physical object
        System.out.println("tvA==tvB: " + (tvA == tvB));
        // use equals() to show if tvA and tvB are "equal" (details later)
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB));

        System.out.println(tvA.hashCode());
        System.out.println(tvB.hashCode());

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        System.out.println("The size of the Set is " + tvs.size());



    }
}