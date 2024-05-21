package cz.czechitas.java2webapps.lekce7.service;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Filip Jirsák
 */
class CalendarServiceTest {

    private final CalendarService calendarService = new CalendarService();

    @Test
    void testChristmas() {
        assertAll(
                () -> assertEquals(LocalDate.of(1960, 12, 24), calendarService.christmas(1960).getFirstDay()),
                () -> assertEquals(LocalDate.of(1990, 12, 24), calendarService.christmas(1990).getFirstDay()),
                () -> assertEquals(LocalDate.of(2000, 12, 24), calendarService.christmas(2000).getFirstDay()),
                () -> assertEquals(LocalDate.of(2021, 12, 24), calendarService.christmas(2021).getFirstDay()),
                () -> assertEquals(LocalDate.of(2023, 12, 24), calendarService.christmas(2023).getFirstDay())
        );
    }

    @Test
    void testSylvester() {
        assertAll(
                () -> assertEquals(LocalDate.of(1960, 12, 31), calendarService.sylvester(1960).getFirstDay()),
                () -> assertEquals(LocalDate.of(1961, 1, 1), calendarService.sylvester(1960).getLastDay()),
                () -> assertEquals(LocalDate.of(1990, 12, 31), calendarService.sylvester(1990).getFirstDay()),
                () -> assertEquals(LocalDate.of(1991, 1, 1), calendarService.sylvester(1990).getLastDay()),
                () -> assertEquals(LocalDate.of(2000, 12, 31), calendarService.sylvester(2000).getFirstDay()),
                () -> assertEquals(LocalDate.of(2001, 1, 1), calendarService.sylvester(2000).getLastDay()),
                () -> assertEquals(LocalDate.of(2021, 12, 31), calendarService.sylvester(2021).getFirstDay()),
                () -> assertEquals(LocalDate.of(2022, 1, 1), calendarService.sylvester(2021).getLastDay()),
                () -> assertEquals(LocalDate.of(2023, 12, 31), calendarService.sylvester(2023).getFirstDay()),
                () -> assertEquals(LocalDate.of(2024, 1, 1), calendarService.sylvester(2023).getLastDay()));
    }

    @Test
    void testEaster() {
        assertAll(
                () -> assertEquals(LocalDate.of(1960, 4, 18), calendarService.easter(1960).getLastDay()),
                () -> assertEquals(LocalDate.of(1990, 4, 16), calendarService.easter(1990).getLastDay()),
                () -> assertEquals(LocalDate.of(2000, 4, 24), calendarService.easter(2000).getLastDay()),
                () -> assertEquals(LocalDate.of(2005, 3, 28), calendarService.easter(2005).getLastDay()),
                () -> assertEquals(LocalDate.of(2020, 4, 13), calendarService.easter(2020).getLastDay()),
                () -> assertEquals(LocalDate.of(2021, 4, 5), calendarService.easter(2021).getLastDay()),
                () -> assertEquals(LocalDate.of(2023, 4, 10), calendarService.easter(2023).getLastDay())
        );
    }

    @Test
    void testPentecost() {
        assertAll(
                () -> assertEquals(LocalDate.of(1960, 6, 5), calendarService.pentecost(1960).getFirstDay()),
                () -> assertEquals(LocalDate.of(1990, 6, 3), calendarService.pentecost(1990).getFirstDay()),
                () -> assertEquals(LocalDate.of(2000, 6, 11), calendarService.pentecost(2000).getFirstDay()),
                () -> assertEquals(LocalDate.of(2005, 5, 15), calendarService.pentecost(2005).getFirstDay()),
                () -> assertEquals(LocalDate.of(2020, 5, 31), calendarService.pentecost(2020).getFirstDay()),
                () -> assertEquals(LocalDate.of(2021, 5, 23), calendarService.pentecost(2021).getFirstDay()),
                () -> assertEquals(LocalDate.of(2023, 5, 28), calendarService.pentecost(2023).getFirstDay()));
    }
}
