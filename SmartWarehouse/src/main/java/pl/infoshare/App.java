package pl.infoshare;

import pl.infoshare.service.AddItemService;

import static pl.infoshare.service.AddItemService.addItem;
import static pl.infoshare.utils.ConsoleInput.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Yellow Angels" );

       Menu menu = new Menu();

         menu.run();

        AddItemService.addItem();





    }
}
