import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steven", "123456A", 30000, "IT");
    }

    @Test
    public void hasName() {
        assertEquals("Steven", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("123456A", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDept() {
        assertEquals("IT", manager.getDept());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000.00);
        assertEquals(31000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300, manager.payBonus(), 0.01);
    }
}
