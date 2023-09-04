import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> empLds = new HashMap<>();
        empLds.put("Atanas", 12345);
        empLds.put("Ivan", 23234);
        empLds.put("Georgi", 443234);
        System.out.println(empLds);
        System.out.println(empLds.get("Ivan"));
        System.out.println(empLds.containsKey("Georgi"));
        System.out.println(empLds.containsValue(12345));
        System.out.println(empLds.containsValue(1));
        empLds.put("Ivan", 100001);
        System.out.println(empLds);
        empLds.replace("Ivan", 200002);
        System.out.println(empLds);
        empLds.putIfAbsent("Kalina", 222333);
        System.out.println(empLds);
        empLds.remove("Ivan");
        System.out.println(empLds);
    }
}