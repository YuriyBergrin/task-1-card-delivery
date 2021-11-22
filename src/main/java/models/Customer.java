package models;

import com.github.javafaker.Faker;
import lombok.Data;

import java.util.Locale;

/**
 * Клиент
 */
@Data
public class Customer {
    private String city;
    private String name;
    private String lastName;
    private String phoneNumber;

    public Customer() {
        setRandomData();
    }

    /**
     * Задать клиенту рандомные данные
     */
    private void setRandomData() {
        Faker faker = new Faker(new Locale("ru_RU.UTF-8"));
        setCity(faker.address().city());//todo faker генерирует не все столицы регионов, а так же генерирует не столицы регионов, по хорошему нужно писать кастомный генератор
        setName(faker.name().firstName());
        setLastName(faker.name().lastName());
        setPhoneNumber(faker.phoneNumber().phoneNumber());
    }
}
