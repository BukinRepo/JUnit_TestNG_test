package PersonTest;

import ManWoman.Man;
import ManWoman.Woman;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PersonGetterSetterOperationTests {

    private SoftAssert softAssert = new SoftAssert();
    @Test
    public void testPersonGetAge(){
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        softAssert.assertEquals(man1.getAge(), 65, "Age get wrong");
        softAssert.assertAll();
    }

    @Test
    public void testPersonSetAge(){
        int age = 85;
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        man1.setAge(age);
        softAssert.assertEquals(man1.getAge(), age, "Age set wrong");
        softAssert.assertAll();
    }

    @Test
    public void testPersonGetFirstName(){
        Woman woman1 = new Woman("Lida", "Koval", 55, "Single");
        softAssert.assertEquals(woman1.getFirstName(), "Lida", "FirstName get wrong");
        softAssert.assertAll();
    }

    @Test
    public void testPersonGetLastName(){
        Woman woman1 = new Woman("Lida", "Koval", 55, "Single");
        softAssert.assertEquals(woman1.getLastName(), "Koval", "LastName get wrong");
        softAssert.assertAll();
    }

    @Test
    public void testPersonSetLastName(){
        String lastname = "Klynin";
        Man man1 = new Man("Vasya", lastname, 65, "Single");
        man1.setLastName(lastname);
        softAssert.assertEquals(man1.getLastName(), lastname, "LastName set wrong");
        softAssert.assertAll();
    }

    @Test
    public void testPersonGetPartner(){
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        softAssert.assertEquals(man1.getPartner(), "Single", "Partner get wrong");
        softAssert.assertAll();
    }

    @Test
    public void testPersonSetPartner(){
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        man1.setPartner("TestPartner");
        softAssert.assertEquals(man1.getPartner(), "TestPartner", "Partner set wrong");
        softAssert.assertAll();
    }

    @Test
    public void testPersonSetRetired(){
        Woman woman1 = new Woman("Lida", "Koval", 55, "Single");
        softAssert.assertEquals(woman1.isRetired().booleanValue(), false, "Main logic isRetired method wrong");
        woman1.setRetired(true);
        softAssert.assertEquals(woman1.isRetired().booleanValue(), true, "Retired set wrong");
        softAssert.assertAll();
    }


    @Test
    public void testWomanGetMaidenName(){
        String womanLastName = "Koval";
        Woman woman = new Woman("Lida3", womanLastName, 60, "Single");
        Man man = new Man("Vasya2", "Petrov", 65, "Single");
        woman.registerPartnership(man);
        softAssert.assertEquals(woman.getMaidenName(), womanLastName);
    }
}
