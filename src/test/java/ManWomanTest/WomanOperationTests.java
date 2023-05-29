package ManWomanTest;

import ManWoman.Man;
import ManWoman.Woman;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WomanOperationTests {
    // ManWoman.Woman class have ony isRetired, registerPartnership, deregisterPartnership unique setting logic. All common test will be covered in PersonTest.PersonOperationTests
    private SoftAssert softAssert = new SoftAssert();

    @Test
    public void testWomanIsRetired(){
        Woman woman = new Woman("Lida", "Koval", 60, "Single");
        softAssert.assertTrue(woman.isRetired(), "Please check retired age");
        Woman womanAnother = new Woman("Lida2", "Koval", 59, "Single");
        softAssert.assertFalse(womanAnother.isRetired(), "Please check retired boundary age");
        softAssert.assertAll();
    }

    @Test
    public void testWomanRegisterPartnership(){
        Woman woman = new Woman("Lida", "Koval", 60, "Single");
        Man man = new Man("Vasya", "Petrov", 65, "Single");
        woman.registerPartnership(man);
        //Check Last name set.
        softAssert.assertEquals(woman.getLastName(),man.getLastName(), "ManWoman.Woman last name wasn't set");
        //Check partners for woman attribute are correctly set.
        softAssert.assertEquals(man.getFirstName() + " " + man.getLastName(),woman.getPartner(),"Partners for ManWoman.Woman set wrong");
        //Check partners for man attribute are correctly set.
        softAssert.assertEquals(woman.getFirstName() + " " + woman.getLastName(), man.getPartner(),"Partners for ManWoman.Man set wrong");
        softAssert.assertAll();
    }

    @Test
    public void testWomanDeregisterPartnership(){
        Woman woman = new Woman("Lida2", "Koval", 60, "Single");
        Man man = new Man("Vasya2", "Petrov", 65, "Single");
        woman.registerPartnership(man);
        woman.deregisterPartnership(true, man);
        softAssert.assertEquals(woman.getMaidenName(), woman.getLastName(),"ManWoman.Woman maiden name set wrong");
        softAssert.assertEquals(woman.getPartner(), "Single", "After divorce ManWoman.Woman partner attribute set wrong");
        softAssert.assertEquals(man.getPartner(), "Single", "After divorce ManWoman.Man partner attribute set wrong");
        softAssert.assertAll();
    }
}
