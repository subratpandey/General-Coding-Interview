/**
 * sort a LinkedList with method Collections.sort
 */

import java.util.LinkedList;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("4");
        list.add("5");
        list.add("2");
        list.add("3");
        list.add("6");
        list.add("1");
        System.out.println("Before sorting:");
        System.out.println("===============");
        
        for (String num : list) {
            System.out.println("Num = " + num);        
        }
        
        Collections.sort(list);
        
        System.out.println("After sorting:");
        System.out.println("===============");
        for (String num : list) {
            System.out.println("Num = " + num);
        }
	}

}
