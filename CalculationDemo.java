//funcs which perfrm clsly rltd task can b givn same name
//func overloading

//type , seq , num of args -> must be different

public class CalculationDemo {


public void sum(int x,int y,int z) {
System.out.println(x+y+z);
}
public void sum(char x,int y) {
System.out.println(x+y);
}
public void sum(int y,char x) {
System.out.println(x+y); // 10A - 75
System.out.println("int char");
}
public void sum(int y,float x) {
System.out.println(x+y);
System.out.println("int float");
}
public void sum(int x,int y) {
System.out.println(x+y);
System.out.println("int int");
}
public static void main(String[] args) {
CalculationDemo c=new CalculationDemo();
c.sum(10,'A');

}

}


