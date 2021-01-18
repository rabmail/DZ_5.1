import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 26000_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNeWRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForNewRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 26000_60;
        boolean registered = false;
        long expected = 260;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}