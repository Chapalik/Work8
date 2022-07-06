package InternetShop;

/**
 * Класс продукта
 * Айди имя идентификации продукта
 * Остальное переменные для информации на странице товара
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Product {
    int ID;
    String productName;
    double price;
    String description;
    int amount;
    Image logo = new Image() {
        @Override
        public int getWidth(ImageObserver observer) {
            return 0;
        }

        @Override
        public int getHeight(ImageObserver observer) {
            return 0;
        }

        @Override
        public ImageProducer getSource() {
            return null;
        }

        @Override
        public Graphics getGraphics() {
            return null;
        }

        @Override
        public Object getProperty(String name, ImageObserver observer) {
            return null;
        }
    };
}
