package pl.infoshare.model;

import java.time.LocalDateTime;

//public abstract class ItemComponent {
//    private int id;
//    private int itemCode; //producer serial number
//    private String name;
//    private Category category;
//    private Producer producer;
//    private double weight;
//    private LocalDateTime expirationDate;
//    private Warehouse localization;
//
//    public ItemComponent(int id, int itemCode, String name, Category category, Producer producer, double weight, LocalDateTime expirationDate, Warehouse localization) {
//        this.id = id;
//        this.itemCode = itemCode;
//        this.name = name;
//        this.category = category;
//        this.producer = producer;
//        this.weight = weight;
//        this.expirationDate = expirationDate;
//        this.localization = localization;
//    }
public class ItemComponent {
      private String name;
      private String category;
      private String supplier;
      private String packaging;
      private double weight;
      private int quantityPerPackaging;



    public ItemComponent(String name, String category, String supplier, double weight, int quantityPerPackaging) {
    }

    public ItemComponent(){

    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public void setQuantityPerPackaging(int quantityPerPackaging) {
        this.quantityPerPackaging = quantityPerPackaging;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
