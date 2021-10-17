package pl.infoshare.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pack extends ItemComponent{
    private ArrayList<ItemComponent> items;

    public Pack(int id, int itemCode, String name, Category category, Producer producer, double weight, LocalDateTime expirationDate, Warehouse localization) {
        super(id, itemCode, name, category, producer, weight, expirationDate, localization);
        items = new ArrayList<>();
    }

    public void addComponent(ItemComponent item){
        items.add(item);
    }
}
