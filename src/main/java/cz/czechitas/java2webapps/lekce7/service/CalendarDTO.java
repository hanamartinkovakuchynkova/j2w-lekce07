package cz.czechitas.java2webapps.lekce7.service;

import java.time.LocalDate;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Filip Jirsák
 */
public class CalendarDTO implements Iterable<DateDTO> {
    private final Deque<DateDTO> list = new LinkedList<>();

    public CalendarDTO append(String label, LocalDate date) {
        list.add(new DateDTO(label, date));
        return this;
    }

    @Override
    public Iterator<DateDTO> iterator() {
        return list.iterator();
    }

    public LocalDate getFirstDay() {
        return list.getFirst().date();
    }

    public LocalDate getLastDay() {
        return list.getLast().date();
    }
}
