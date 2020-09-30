//foreach loop with collections

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

//collection of elements of type object

// list -- ordered  - allows duplicates

// set -- unordered- unique

//map -- key-value key is unique


public class EnhancedForCollections {

public static void main(String[] args) {

Vector<StudentDemo> hs=new Vector<>();

StudentDemo sd1=new StudentDemo("Raj", 1);
StudentDemo sd2=new StudentDemo("Raja", 2);
StudentDemo sd3=new StudentDemo("Raju", 5);
StudentDemo sd4=new StudentDemo("Ram", 4);

hs.add(sd1);
hs.add(sd2);
hs.add(sd3);
hs.add(sd4);
hs.add(sd4);


for(StudentDemo sd:hs)
{
sd.dispStudent();
}

}



}
