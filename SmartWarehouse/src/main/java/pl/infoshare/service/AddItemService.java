package pl.infoshare.service;

import pl.infoshare.model.ItemComponent;
import pl.infoshare.utils.ConsoleInput;

import java.util.*;

import  pl.infoshare.model.User;

import static pl.infoshare.utils.ConsoleInput.*;


public class AddItemService {


       public static ItemComponent addItem() {
           ItemComponent item = new ItemComponent();

        System.out.println("Podaj nazwe produktu.");
        String nameInput = getInputUserString();
        item.setName(nameInput);
        System.out.println("Podaj kategorie produktu.");
        String categoryInput = getInputUserString();
        item.setCategory(categoryInput);
        System.out.println("Podaj nazwe dostawcy produktu.");
        String supplierInput = getInputUserString();
        item.setSupplier(supplierInput);
        System.out.println("Podaj wage produktu.");
        double weightInput = getInputUserDouble();
        item.setWeight(weightInput);
        System.out.println("Podaj ilosc produktu w jednym opakowaniu.");
        int quantityPerPackagingInput = getInputUserInteger();
        item.setQuantityPerPackaging(quantityPerPackagingInput);
        System.out.println("Dodales produkt o nazwie " + nameInput +" z kategorii " + categoryInput +",ktorego dostawca jest " + supplierInput + ".");
        System.out.println("Waga towaru to " + weightInput + " a ilosc w kazdym opakowaniu to " + quantityPerPackagingInput);
        System.out.println("Dziekujemy, Twoj produkt zostal dodany.");

        return item;


   }

}
