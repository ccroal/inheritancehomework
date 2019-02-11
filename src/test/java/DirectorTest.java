import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Janet", "123456A", 50000, "Finance", 1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Janet", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("123456A", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDept() {
        assertEquals("Finance", director.getDept());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2000.00);
        assertEquals(52000, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }
}
