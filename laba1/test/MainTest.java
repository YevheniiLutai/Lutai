import org.junit.Test;
import org.junit.Assert;

public class MainTest {
    @Test
    public void ticketTest() throws IllegalArgumentException {
        Main obj = new Main();
        int ticket[] = obj.ticket();
        boolean flag_for_first_set = false;
        boolean flag_for_second_set = false;
        boolean flag_for_third_set = false;
        for (int i = 0; i < 3; i++){
            if (obj.first_set[i] == ticket[0]) flag_for_first_set = true;
            if (obj.second_set[i] == ticket[1]) flag_for_second_set = true;
            if (obj.third_set[i] == ticket[2]) flag_for_third_set = true;
        }
        Assert.assertTrue(flag_for_first_set);
        Assert.assertTrue(flag_for_second_set);
        Assert.assertTrue(flag_for_third_set);
    }
}
