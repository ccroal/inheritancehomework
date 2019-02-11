import TechStaff.DatabaseAdmin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("David", "123456A", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("David", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("123456A", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(21000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(200, databaseAdmin.payBonus(), 0.01);
    }
}
