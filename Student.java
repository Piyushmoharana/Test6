package customsorting;

public class Student {
	String name;
	int age;
	Student(String name,int age){
		this.name= name;
		this.age=age;
	}
	public String toString() {
		return name+"is"+age+"years old";
	}

}
