package pl.infoshare.model;

import java.time.LocalDateTime;

public class Item extends ItemComponent{

    public Item(int id, int itemCode, String name, Category category, Producer producer, double weight, LocalDateTime expirationDate, Warehouse localization) {
        super(id, itemCode, name, category, producer, weight, expirationDate, localization);
    }
}
