//                1 Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Set;

// public class Homework6 {

//     public static void main(String[] args) {
//         HashMap<String, Set<String>> emp = new HashMap<String, Set<String>>();
//         Set<String> number = new HashSet();
//         number.add("+73332221122");
//         number.add("+79991115522");
//         emp.put("Иванов", new HashSet(number));
//         number.removeAll(number);
//         number.add("+79991111111");
//         number.add("+79992222222");
//         emp.put("Петров", new HashSet(number));
//         number.removeAll(number);
//         number.add("+44956663331");
//         emp.put("Печкин", new HashSet(number));
//         for (String key : emp.keySet()) {
//             System.out.printf("\n%s ", key);
//             for (String string : emp.get(key)) {
//                 System.out.printf("%s, ", string);      
//             }
//         }
//     }
// }


// 2.Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
//  Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

/**
 * Homework6
 */
import java.util.HashMap;
import java.util.Map;

public class Homework6 {
    public static void main(String[] args) {
        String[] dir = {"Иван","Антон" ,"Петр ", "Иван" , "Петр"};
        Map<String, Integer> map = new HashMap<>();
        for (String t : dir) {
            String name = t.split(" ")[0];
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                .reversed()).forEach(System.out::println);
    }
}