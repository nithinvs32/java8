package studentPractice;

import java.util.*;

public class StudentData {

	public List<Student> students;

	public StudentData() {

		students = Arrays.asList(

				new Student("Nithin", "BCA", "2023-24", 72.5, "Male"),
				new Student("Anu", "BTech CS", "2025-26", 91.0, "Female"),
				new Student("Ravi", "BE CS", "2025-26", 87.5, "Male"),
				new Student("Priya", "BCom", "2024-25", 75.0, "Female"),
				new Student("Rahul", "BE ECE", "2025-26", 69.5, "Male"),
				new Student("Sneha", "BTech CS", "2025-26", 95.2, "Female"),
				new Student("Ajay", "BE CS", "2023-24", 81.5, "Male"),
				new Student("Kiran", "BCA", "2025-26", 63.5, "Male"),
				new Student("Meena", "BTech CS", "2024-25", 88.2, "Female"),
				new Student("Divya", "BE CS", "2025-26", 93.6, "Female"),
				new Student("Karthik", "BSc", "2025-26", 58.5, "Male"),
				new Student("Amala", "BTech CS", "2025-26", 79.5, "Female"),
				new Student("Manoj", "BE CS", "2024-25", 66.2, "Male"),
				new Student("Pooja", "MBA", "2025-26", 83.5, "Female"),
				new Student("Ramesh", "BE CS", "2025-26", 97.1, "Male")

		);

	}

}