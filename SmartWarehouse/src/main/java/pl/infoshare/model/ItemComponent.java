package pl.infoshare.model;

import java.time.LocalDateTime;

public abstract class ItemComponent {
    private int id;
    private int itemCode; //producer serial number
    private String name;
    private Category category;
    private Producer producer;
    private double weight;
    private LocalDateTime expirationDate;
    private Warehouse localization;

    public ItemComponent(int id, int itemCode, String name, Category category, Producer producer, double weight, LocalDateTime expirationDate, Warehouse localization) {
        this.id = id;
        this.itemCode = itemCode;
        this.name = name;
        this.category = category;
        this.producer = producer;
        this.weight = weight;
        this.expirationDate = expirationDate;
        this.localization = localization;
    }
}
