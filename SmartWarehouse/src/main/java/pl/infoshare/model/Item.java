package pl.infoshare.model;

import java.time.LocalDateTime;

public class Item extends ItemComponent{
    private int id;
    private int itemCode; //producer serial number
    private String name;
    private Category category;
    private Producer producer;
    private double weight;
    private LocalDateTime expirationDate;
}
