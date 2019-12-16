import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	public static int first_set[] = {1, 2, 3};
	public static int second_set[] = {4, 5, 6};
	public static int third_set[] = {7, 8, 9};

	Logger logger = Logger.getLogger(Main.class.getName());
	public void main(String[] args) {
		logger.log(Level.INFO,"Список вопросов:");
		int ticket[] = Main.ticket();
		for (int i = 0; i < 3; i++) {
			logger.log(Level.INFO, String.valueOf(ticket[i]));
		}
	}

	public static int[] ticket() {
		int ticket[] = {first_set[(int) (Math.random() * 100) % 3], second_set[(int) (Math.random() * 100) % 3], third_set[(int) (Math.random() * 100) % 3]};
		return ticket;
	}
}
