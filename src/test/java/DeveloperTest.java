import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sarah", "123456A", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Sarah", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("123456A", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(21000, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, developer.payBonus(), 0.01);
    }
}



