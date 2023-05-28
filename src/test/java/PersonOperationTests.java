import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonOperationTests {
    @Test
    public void testPersonGetAge(){
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        Assert.assertEquals(man1.getAge(), 65, "Age get wrong");
    }

    @Test
    public void testPersonSetAge(){
        int age = 85;
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        man1.setAge(age);
        Assert.assertEquals(man1.getAge(), age, "Age set wrong");
    }

    @Test
    public void testPersonGetFirstName(){
        Woman woman1 = new Woman("Lida", "Koval", 55, "Single");
        Assert.assertEquals(woman1.getFirstName(), "Lida", "FirstName get wrong");
    }

    @Test
    public void testPersonGetLastName(){
        Woman woman1 = new Woman("Lida", "Koval", 55, "Single");
        Assert.assertEquals(woman1.getLastName(), "Koval", "LastName get wrong");
    }

    @Test
    public void testPersonSetLastName(){
        String lastname = "Klynin";
        Man man1 = new Man("Vasya", lastname, 65, "Single");
        man1.setLastName(lastname);
        Assert.assertEquals(man1.getLastName(), lastname, "LastName set wrong");
    }

    @Test
    public void testPersonGetPartner(){
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        Assert.assertEquals(man1.getPartner(), "Single", "Partner get wrong");
    }

    @Test
    public void testPersonSetPartner(){
        Man man1 = new Man("Vasya", "Petrov", 65, "Single");
        man1.setPartner("TestPartner");
        Assert.assertEquals(man1.getPartner(), "TestPartner", "Partner set wrong");
    }

    @Test
    public void testPersonSetRetired(){
        Woman woman1 = new Woman("Lida", "Koval", 55, "Single");
        Assert.assertEquals(woman1.isRetired(), false, "Main logic isRetired method wrong");
        woman1.setRetired(true);
        Assert.assertEquals(woman1.isRetired(), true, "Retired set wrong");
    }
}
