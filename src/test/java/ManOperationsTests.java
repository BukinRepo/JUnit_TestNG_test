import org.testng.Assert;
import org.testng.annotations.Test;

public class ManOperationsTests {
    // Man class have ony isRetired unique setting logic. All common test will be covered in PersonOperationTests

    @Test
    public void testManIsRetired(){
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        Assert.assertTrue(man1.isRetired(), "Please check retired age");
        Man man2 = new Man("Vasya2", "Petrov2", 64, "Single");
        Assert.assertFalse(man2.isRetired(), "Please check retired boundary age");
    }
}
