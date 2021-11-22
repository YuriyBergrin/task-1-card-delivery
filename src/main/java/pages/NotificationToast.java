package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

/**
 * Тост с уведомлением
 */
public class NotificationToast {
    public NotificationToast clickRePlanButton() {
        $("[data-test-id='replan-notification'] button").click();
        return this;
    }

    public NotificationToast checkRePlanNotification() {
        $("[data-test-id='success-notification']").shouldBe(Condition.visible);
        return this;
    }
}
