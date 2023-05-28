import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanOperationTests {
    // Woman class have ony isRetired, registerPartnership, deregisterPartnership unique setting logic. All common test will be covered in PersonOperationTests

    @Test
    public void testWomanIsRetired(){
        Woman woman1 = new Woman("Lida", "Koval", 60, "Single");
        Assert.assertTrue(woman1.isRetired(), "Please check retired age");
        Woman woman2 = new Woman("Lida2", "Koval", 59, "Single");
        Assert.assertFalse(woman2.isRetired(), "Please check retired boundary age");
    }

    @Test
    public void testWomanRegisterPartnership(){
        Woman woman1 = new Woman("Lida", "Koval", 60, "Single");
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        woman1.registerPartnership(man1);
        //Check Last name set.
        Assert.assertEquals(woman1.getLastName(),man1.getLastName(), "Woman last name wasn't set");
        //Check partners for woman attribute are correctly set.
        Assert.assertEquals(man1.getFirstName() + " " + man1.getLastName(),woman1.getPartner(),"Partners for Woman set wrong");
        //Check partners for man attribute are correctly set.
        Assert.assertEquals(woman1.getFirstName() + " " + woman1.getLastName(), man1.getPartner(),"Partners for Man set wrong");
    }

    @Test
    public void testWomanDeregisterPartnership(){
        Woman woman2 = new Woman("Lida2", "Koval", 60, "Single");
        Man man2 = new Man("Vasya2", "Petrov", 65, "Single");
        woman2.registerPartnership(man2);
        woman2.deregisterPartnership(true, man2);
        Assert.assertEquals(woman2.getMaidenName(), woman2.getLastName(),"Woman maiden name set wrong");
        Assert.assertEquals(woman2.getPartner(), "Single", "After divorce Woman partner attribute set wrong");
        Assert.assertEquals(man2.getPartner(), "Single", "After divorce Man partner attribute set wrong");
    }
}
