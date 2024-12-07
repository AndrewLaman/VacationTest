package ru.netology.javaqa;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest {

    @Nested
    class VacationCalculatorNestedTest {

        @Test
        public void testMonth2() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(40000, 3000, 20000);
            assertEquals(4, months);
        }

        @Test
        public void testMonth3() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(80000, 3000, 20000);
            assertEquals(5, months);
        }

        @Test
        public void testMonth4() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(120000, 3000, 20000);
            assertEquals(6, months);
        }

        @Test
        public void testMonth5() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(160000, 3000, 20000);
            assertEquals(3, months);
        }

        @Test
        public void testMonth6() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(33333, 3000, 20000);
            assertEquals(4, months);
        }


        @Test
        public void testMonth7() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(73333, 3000, 20000);
            assertEquals(5, months);
        }


        @Test
        public void testMonth8() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(113333, 3000, 20000);
            assertEquals(6, months);
        }


        @Test
        public void testMonth9() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(153333, 3000, 20000);
            assertEquals(3, months);
        }


        @Test
        public void testMonth10() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(31111, 3000, 20000);
            assertEquals(4, months);
        }


        @Test
        public void testMonth11() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(71111, 3000, 20000);
            assertEquals(5, months);
        }


        @Test
        public void testMonth12() {
            VacationCalculator vacationManager = new VacationCalculator();
            int months = vacationManager.calcBonus(111111, 3000, 20000);
            assertEquals(6, months);
        }
    }
}