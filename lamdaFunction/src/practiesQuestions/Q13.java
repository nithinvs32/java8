package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q13 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

double ans=L1.stream().filter(e->e.getName().startsWith("A")).mapToDouble(Employee::getSalary).sum();System.out.println(ans);
    }
}
