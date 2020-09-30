

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

//collection of elements of type object

// list -- ordered  - allows duplicates

// set -- unordered- unique

//map -- key-value key is unique


public class HashSetDemo {

public static void main(String[] args) {

HashSet<Integer> hs=new HashSet<>();

hs.add(10);
hs.add(15);
hs.add(20);
hs.add(25);
hs.add(10);

System.out.println(hs);

}



}