import java.util.*;

class World2 {

    public static void main(String[] args)
    {
        List<String> list = (List<String>) Arrays.asList("LutaiI", "Hello", "Laba3", "Yuvhenii");
        System.out.println("The sorted stream is : ");
        list.stream().sorted().forEach(System.out::println);
    }
}
