package customsorting;

import java.util.TreeSet;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("abc",20);
		Student s2 = new Student("aab",40);
		Student s3 = new Student("acc",10);
		//TreeSet<Student> t = new TreeSet<Student>(new StudentAgeComparator());
		TreeSet<Student> t = new TreeSet<Student>(new StudentNameComparator());
		t.add(s1);
		t.add(s2);
		t.add(s3);
		for(Student stud:t) {
			System.out.println(stud);
		}
	}

}
