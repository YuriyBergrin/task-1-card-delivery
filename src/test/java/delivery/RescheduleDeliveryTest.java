package delivery;

import basetest.BaseTest;
import models.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CardDeliveryForm;
import utils.DateGenerator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RescheduleDeliveryTest extends BaseTest {
    private CardDeliveryForm cardDeliveryForm = new CardDeliveryForm();//форма назначения встречи
    private Customer customer = new Customer();//клиент
    private String firstDate;//первая дата
    private String secondDate;//вторая дата

    @Test()
    public void test() {
        cardDeliveryForm
                .open()
                .setCity(customer.getCity())
                .setDate(firstDate)
                .setName(String.format("%s %s", customer.getLastName(), customer.getName()))
                .setPhone(customer.getPhoneNumber())
                .clickCheckBox()
                .clickConfirmButton()
                .setDate(secondDate)
                .clickConfirmButton()
                .getNotificationToast()
                .clickRePlanButton()
                .checkRePlanNotification();
/**
 * 1. Тест не пройдет, если в имени/фамилии клиента будет буква 'Ё'.
 * 2. Faker, который рекомендуется в домашке не генерирует всех городов, которые могут быть в поле 'Город'
 * с другой стороны Faker генерирует горо, которые не является столицами регионов (например Тольятти).
 */

    }

    @BeforeEach
    public void setDates() {
        Date date = DateGenerator.getRandomDate();
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        firstDate = df.format(date.getTime());
        secondDate = df.format(DateGenerator.getRandomDateByDate(date));
    }
}
