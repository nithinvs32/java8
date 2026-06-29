package practiesQuestions;

import java.util.*;
import java.util.stream.*;

public class Q16 {
    public static void main(String[] args) {
        EmployeeBySal obj=new EmployeeBySal();
        List<Employee> L1=obj.emps;

System.out.println(L1.stream().map(Employee::getCompany).distinct().count());
    }
}
