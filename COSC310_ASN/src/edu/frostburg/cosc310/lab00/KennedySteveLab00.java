/*
 * Steve Kennedy
 * Sept x, 20xx
 * 
 * Please put your name, date, and brief description of this class here.
 */
package edu.frostburg.cosc310.lab00;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Your documentation should begin here.
 * @author SteveK
 */
public class KennedySteveLab00 implements Lab00 {

    /**
     * Makes a long string using Java concatenation.
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem0(int size) {
        System.out.println("StringBuilder is fastest, ArrayList is second, LinkedList is third.");
        String s = "";
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            s = s + i;
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    /**
     * Makes a long string using Java StringBuilder
     * @param size the # of times
     * @return how long it took
     */
    @Override
    public long problem1(int size) {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();
        return end - start;
    }

    @Override
    public long problem2(int size) {
        List<String> myList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            myList.add(Integer.toString(i));
        }

        long end = System.currentTimeMillis();
        return end - start;

    }

    @Override
    public long problem3(int size) {
        List<String> myList = new LinkedList<>();
        long start = System.currentTimeMillis();

        for (int i=0; i<size; i++) {
            myList.add(Integer.toString(i));
        }

        long end = System.currentTimeMillis();
        return end - start;

    }
    
}
