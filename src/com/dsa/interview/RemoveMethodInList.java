package com.dsa.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return name + " (" + rollNo + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student s = (Student) o;
        return rollNo == s.rollNo && Objects.equals(name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }
}

public class RemoveMethodInList {

	public static void main(String[] args) {
		
//		    List<Integer> numbers = new ArrayList<>();
//
//	        numbers.add(10);
//	        numbers.add(20);
//	        numbers.add(30);
//	        numbers.add(40);
//
//	        System.out.println("Original List: " + numbers);
//
//	        // Remove by index
//	        numbers.remove(2);  // removes the element at index 2 → 30
//
//	        System.out.println("After removing index 2: " + numbers);
//
//	        // Remove by value
//	        numbers.remove(Integer.valueOf(20));  // removes the object 20
//
//	        System.out.println("After removing value 20: " + numbers);
		
		
		    List<Student> students = new ArrayList<>();

	        students.add(new Student("Alice", 1));
	        students.add(new Student("Bob", 2));
	        students.add(new Student("Charlie", 3));

	        System.out.println("Original List: " + students);

	        // Remove student by object
	        students.remove(new Student("Bob", 2));

	        System.out.println("After removing Bob: " + students);

	}

}
