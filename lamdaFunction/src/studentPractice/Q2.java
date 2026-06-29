package studentPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Q2 {

	public static void main(String[] args) {

		StudentData data = new StudentData();
		List<Student> list = data.students;

		List<Student> result = list.stream()

				.filter(s -> s.getYearOfPassedOut().equals("2025-26"))

				.filter(s -> s.getQualification().equalsIgnoreCase("BE CS")
						|| s.getQualification().equalsIgnoreCase("BTech CS"))

				.sorted(Comparator.comparing(
						Student::getPercentage).reversed())

				.collect(Collectors.toList());

		result.forEach(System.out::println);

	}

}