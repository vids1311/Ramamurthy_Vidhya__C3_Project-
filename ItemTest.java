import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ItemTest<item> {
    //TDD
    //When selecting an item from the menu
        //  the price should be returned
    //On selecting multiple items
        //  the price should show the total price of all items selected
    //When no items are selected the price should be zero


    @Test
    public void when_selecting_item_from_menu_total_cost_should_be_returned() {

       Item menuItemName = null;
       int price = 3;
       Cost menuItem = Item.totalCost(menuItemName,price);
       assertNotNull(menuItemName);
    }




}