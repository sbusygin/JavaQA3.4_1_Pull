package ru.netology.manager;

import ru.netology.domain.Film;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {

    private FilmManager manager = new FilmManager(3);
    private Film film1 = new Film(1, 14, "Блад шот", "Боевик");
    private Film film2 = new Film(2, 12, "Вперед", "Мультик");
    private Film film3 = new Film(3, 15, "Отель", "Комедия");
    private Film film4 = new Film(4, 31, "Джентельмены", "Боевик");
    private Film film5 = new Film(5, 64, "Человек-Невидимка", "Ужасы");



    @Test
    void getFilmsIfLineBig() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);

        Film[] expected = new Film[]{film3, film2, film1};
        Film[] result = manager.getAll();
        assertArrayEquals(expected, result);
    }

    @Test
    void getFilmsIfLineOk() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        Film[] expected = new Film[]{film3, film2, film1};
        Film[] result = manager.getAll();
        assertArrayEquals(expected, result);
    }

    @Test
    void getFilmsIfLineMin() {
        manager.add(film1);
        manager.add(film2);

        Film[] expected = new Film[]{film2, film1};
        Film[] result = manager.getAll();
        assertArrayEquals(expected, result);
    }

    @Test
    void getFilmsIfLineEmpty() {
        Film[] expected = new Film[]{};
        Film[] result = manager.getAll();
        assertArrayEquals(expected, result);
    }

}
