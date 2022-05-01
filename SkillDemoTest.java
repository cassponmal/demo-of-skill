import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    int[] IntegerList = {5,3,2,7,1};

    @Test
    public void MaxTester() {
        assertEquals(5, SkillDemo.Max(IntegerList));//Test That Fails Intially
    }   
}
