import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class World2 {

    public static void main(String[] args)
    {
		Logger logger = Logger.getLogger(Main.class.getName());
        List<String> list = (List<String>) Arrays.asList("LutaiI", "Hello", "Laba3", "Yuvhenii");
        logger.log(Level.INFO, "The sorted stream is : ");
        list.stream().sorted().forEach(System.out::println);
    }
}
