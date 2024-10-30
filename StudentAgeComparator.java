package customsorting;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
	public int compare(Student x,Student y) {
		return x.age-y.age;
	}

}
