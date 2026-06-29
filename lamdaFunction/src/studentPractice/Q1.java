package studentPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Q1 {

	public static void main(String[] args) {

		StudentData data = new StudentData();
		List<Student> list = data.students;

		Map<String, Optional<Student>> result = list.stream()

				.collect(Collectors.groupingBy(Student::getGender,
						Collectors.maxBy(Comparator.comparing(Student::getPercentage))));

		result.forEach((g, s) -> System.out.println(g + " -> " + s.get()));

	}

}