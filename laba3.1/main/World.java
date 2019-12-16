import java.util.*;

public class World

{
    public static void main(String[] args)
    {
        Map<String, Integer> unique = new LinkedHashMap<String, Integer>();
        for (String string : "Lutai, Ocean, Ocean, City, Map, City, Map, City, Map, Valya, Valya, Lutai".split(", ")) {
            if(unique.get(string) == null)
                unique.put(string, 1);
            else
                unique.put(string, unique.get(string) + 1);
        }
        String uniqueString = join(unique.keySet(), ", ");
        List<Integer> value = (List<Integer>) new ArrayList<Integer>(unique.values());

        System.out.println("Output = " + uniqueString);
        System.out.println("Values = " + value);

    }

    public static String join(Collection<String> s, String delimiter) {
        StringBuilder buffer = new StringBuilder();
        Iterator<String> iter = s.iterator();
        while (iter.hasNext()) {
            buffer.append(iter.next());
            if (iter.hasNext()) {
                buffer.append(delimiter);
            }
        }
        return buffer.toString();
    }
}
