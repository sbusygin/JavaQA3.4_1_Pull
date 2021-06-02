package ru.netology.manager;

import ru.netology.domain.Film;

public class FilmManager {
    private Film[] filmsLine = new Film[0];
    int howManyFilms;

    public FilmManager() {
        howManyFilms = 10;
    }

    public FilmManager(int howManyFilms) {
        this.howManyFilms = howManyFilms;
    }

    public void add(Film film) {
        int length = filmsLine.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(filmsLine, 0, tmp, 0, filmsLine.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        filmsLine = tmp;
    }

    public Film[] getAll() {
        int resultLength;
        if (filmsLine.length > howManyFilms) {
            resultLength = howManyFilms;
        } else {
            resultLength = filmsLine.length;
        }

        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = filmsLine.length - i - 1;
            result[i] = filmsLine[index];
        }
        return result;
    }

}
