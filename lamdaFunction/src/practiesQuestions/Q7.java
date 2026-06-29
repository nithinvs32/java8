package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q7 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

double avg=L1.stream().mapToDouble(Employee::getSalary).average().orElse(0);List<String> ans=L1.stream().filter(e->e.getSalary()<avg).map(Employee::getName).collect(Collectors.toList());System.out.println(ans);
    }
}
