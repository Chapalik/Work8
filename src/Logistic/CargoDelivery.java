package Logistic;

/**
 * Класс доставки между терминалами
 * Айди для идентификации машин , с помощью его узнаем все данные о машине
 * direction - начальный и startingPoint конечный пункт доставки
 * cargo,cargoWight,cargoValuation,price,deliveryDate - характеристики груза
 */

public class CargoDelivery {
    int ID;
    String direction;
    String startingPoint;
    String cargo; // название груза
    int cargoWight;
    double cargoValuation; // оценка груза/страховка
    double price;//стоимость доставки
    String deliveryDate;//час доставки
}
