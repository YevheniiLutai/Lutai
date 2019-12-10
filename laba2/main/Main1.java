import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main1 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Time obj = new Time(1, 1, 2000, 3, 30);
        Class[] paramsTime = {int.class,  int.class, int.class, int.class, int.class };
        Constructor constructorTime = Time.class.getConstructor(paramsTime);
        Class[] paramsDate = {int.class, int.class, int.class};
        Constructor constructorDate = Date.class.getConstructor(paramsDate);
        System.out.println(obj.getClass().getModifiers());
        System.out.println(obj.getClass().getDeclaredFields()[0].getName());
    }
}
