package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class DeducerForUF_HWQUPC {
    private static int[] testNumbers= {10, 100, 1000, 10000, 100000, 1000000, 10000000};

    public static int count(int n) {
        UF h = new UF_HWQUPC(n);
        int numberOfNeededConnections = 0;
        Random ran = new Random();
        while (h.components() != 1) {
            int p = ran.nextInt(n);
            int q = ran.nextInt(n);
            if (p != q) {
                h.connect(p ,q);
                numberOfNeededConnections++;
            }
        }
        return numberOfNeededConnections;
    }

    public static void main(String[] args) {
        for (int i : testNumbers) {
            System.out.println("The number of needed connections to make " + i + " sites are connected is : " + count(i));
        }
    }
}
