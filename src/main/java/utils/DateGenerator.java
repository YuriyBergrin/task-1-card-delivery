package utils;

import com.github.javafaker.Faker;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * Генератор даты (не ранее трёх дней с текущей даты)
 */
public class DateGenerator {
    /**
     * Получить рандомную дату
     *
     * @return рандомная дата
     */
    public static Date getRandomDate() {
        Faker faker = new Faker(new Locale("ru_RU.UTF-8"));
        return faker.date().future(30, 3, TimeUnit.DAYS);
    }

    /**
     * Прибавить к дате рандомное кол-во дней
     *
     * @param date дата, к которой прибавляются дни
     * @return дата с прибавленными днями
     */
    public static Date getRandomDateByDate(Date date) {
        int days = (int) (Math.random() * 10);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, days);
        return calendar.getTime();
    }
}
