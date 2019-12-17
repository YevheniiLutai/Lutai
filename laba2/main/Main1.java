import java.util.logging.Level;
import java.util.logging.Logger;

public class Main1 {

	public static void main(String[] args) throws NoSuchMethodException {
		Time obj = new Time(1, 1, 2000, 3, 30);
		Logger logger = Logger.getLogger(Main1.class.getName());
		Class[] paramsTime = {int.class,  int.class, int.class, int.class, int.class };
		Time.class.getConstructor(paramsTime);
		Class[] paramsDate = {int.class, int.class, int.class};
		Date.class.getConstructor(paramsDate);
		logger.log(Level.INFO, String.valueOf(obj.getClass().getModifiers()));
		logger.log(Level.INFO, obj.getClass().getDeclaredFields()[0].getName());

	}
}
