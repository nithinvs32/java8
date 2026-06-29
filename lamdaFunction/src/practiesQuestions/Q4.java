package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q4 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

List<String> ans=L1.stream().filter(e->e.getSalary()%10000==0).map(Employee::getName).collect(Collectors.toList());System.out.println(ans);
    }
}
