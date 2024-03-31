import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiseTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit1() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 2000;
        boolean registered = false;
        long expected = 20;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку ( сравнивая ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateForRegisteredAndOverLimit2() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 300;
        boolean registered = false;
        long expected = 3;

        // вызываем целевой метод;
        long actual = service.calculate(amount, registered);

        // производим проверку ( сравнивая ожидаемый и фактический);
        Assertions.assertEquals(expected, actual);
    }
}









