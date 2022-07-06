package InternetShop;

/**
 * Класс оплыты
 * Айди для индентификации в базе
 * остальное данные оплаты
 * success для проверки прошла оплата или нет
 */
public class Payment {
    int ID;
    double sum;
    String clientName;
    String payDate;
    boolean success;
}
