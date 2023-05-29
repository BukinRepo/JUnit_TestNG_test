package ManWomanTest;

import ManWoman.Man;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ManOperationsTests {
    // ManWoman.Man class have ony isRetired unique setting logic. All common test will be covered in PersonTest.PersonOperationTests

    @Test
    public void testManIsRetired(){
        SoftAssert softAssert = new SoftAssert();
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        softAssert.assertTrue(man1.isRetired(), "Please check retired age");
        Man man2 = new Man("Vasya2", "Petrov2", 64, "Single");
        softAssert.assertFalse(man2.isRetired(), "Please check retired boundary age");
        softAssert.assertAll();
    }
}
