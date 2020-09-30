
class Student1 {
String name;

Student1(int x){
name="new name";
}
void disp(){
System.out.println(name);
}
}
public class ConstDemo5 {
public static void main(String[] args) {
	//Student student=new Student();//error
	Student1 student=new Student1(10);//error

	student.disp();
}
}