
//Constructor with args

class Student{
	String name;
	Student(){
	name="some name";
	}
	Student(int x){
	name="new name";
	}
	void disp(){
	System.out.println(name);
	}
	}
	public class Day3 {
	public static void main(String[] args) {
		Student student=new Student((int)10.5f);
		student.disp();
		}
}