package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main1 {
   public  static void main(String[] args) {
       List<Empolyee> emp = Arrays.asList(
              new Empolyee("pragati","IT"),
       new Empolyee("preeti","IT Support"),
       new Empolyee("pushpa","IT")
       );


       Map<String,List<Empolyee>> map = emp.stream()
               .collect(Collectors.groupingBy(e -> e.department));
       System.out.println(map);
    }
}
