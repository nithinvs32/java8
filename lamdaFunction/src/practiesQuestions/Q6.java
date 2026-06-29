package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q6 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

List<String> ans=L1.stream().sorted(java.util.Comparator.comparing(Employee::getSalary).reversed()).limit(3).map(Employee::getName).collect(Collectors.toList());System.out.println(ans);
    }
}
