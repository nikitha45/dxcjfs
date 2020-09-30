
//const with args auto gen const

//right click-> source-> generate constructor using fields

class Student2{
String name;
int studentId;
int rollNo;
float fees;


public Student2(String name, int studentId, int rollNo, float fees) {

this.name = name;
this.studentId = studentId;
this.rollNo = rollNo;
this.fees = fees;
}

void disp(){
System.out.println(name);
}
}
public class AutoConst {
public static void main(String[] args) {
Student2 student=new Student2("Raj",123,144,1500.0f);//error
student.disp();
}
}