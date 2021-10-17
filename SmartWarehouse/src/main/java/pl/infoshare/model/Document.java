package pl.infoshare.model;


import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Document {
    private int id;
    private DocumentType documentType;
    private User receiver;
    private User dispatcher;
    private LocalDateTime date;
    private ArrayList<OrderItem> items;
}
