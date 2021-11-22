package pages;

import com.codeborne.selenide.Selenide;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Форма назначения встречи
 */
public class CardDeliveryForm {
    @Getter
    private NotificationToast notificationToast = new NotificationToast();

    public CardDeliveryForm open() {
        Selenide.open("/");
        return this;
    }

    public CardDeliveryForm setCity(String city) {
        $("[data-test-id='city'] input").setValue(city);
        $(".menu-item_type_block").click();
        return this;
    }

    public CardDeliveryForm setDate(String date) {
        $(".calendar-input__custom-control input").setValue(date);
        return this;
    }

    public CardDeliveryForm setName(String name) {
        $("[name='name']").setValue(name);
        return this;
    }

    public CardDeliveryForm setPhone(String phone) {
        $("[name='phone']").setValue(phone);
        return this;
    }

    public CardDeliveryForm clickCheckBox() {
        $("[data-test-id='agreement']>span.checkbox__box").click();
        return this;
    }

    public CardDeliveryForm clickConfirmButton() {
        $x("//button//span[text()='Запланировать']").click();
        return this;
    }
}
