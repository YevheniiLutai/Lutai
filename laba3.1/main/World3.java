import java.util.Map;
import java.util.HashMap;

public class World3 {
    public static void main(String[] args) {
        String Str1 = "GHhghg";
        String Str2 = "hfh";
        String Str3 = "hk";
        String Str4 = "ds";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put(Str1, Str1.length());
        map.put(Str2, Str2.length());
        map.put(Str3, Str3.length());
        map.put(Str4, Str4.length());

        map.entrySet().stream()
                .sorted(Map.Entry.<String , Integer>comparingByValue().reversed())
                .forEach(System.out::println); // или любой другой конечный метод
    }
}
