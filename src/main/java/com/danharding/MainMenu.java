package com.danharding;

import java.io.File;
import java.util.Map;

public class MainMenu {

    public void mainMenu(){
//        User user = new User();
        boolean inMainMenu = true;
//        int balance = 0;
//        Purchase purchase = new Purchase();
//        Inventory inventory = new Inventory();
//        File logFile = inventory.createAuditFile();
//        Map<String, Item> inventoryMap = Inventory.inventory();
//        int updateStock = User.newQuantity;
        while (inMainMenu) {
            System.out.println("What would you like to do?");
            System.out.println("1) Pet your dog.");
            System.out.println("2) Buy your dog a treat.");
            System.out.println("3) Exit");
            String userSelectionForMainMenu = User.getInputFromUser();
            if (userSelectionForMainMenu.equals("1")) {
                System.out.println("Aw! It seems like your dog really likes being petted!");
                inMainMenu = false;
//                for (Map.Entry<String, Item> keys : inventoryMap.entrySet()) {
//                    System.out.println(keys.getKey() + " " + keys.getValue().getName() + " $" + keys.getValue().getPrice() / 100.0+" "+keys.getValue().getQuantity());

            } else if (userSelectionForMainMenu.equals("2")) {
                //balance = purchase.feedMoneyAddToBalance(0, logFile);
                //purchase.makeTransaction(balance, logFile, user);
            } else if (userSelectionForMainMenu.equals("3")) {
                System.out.println("Ok, goodbye. Have a nice day!");
                inMainMenu = false;
              } //else if (userSelectionForMainMenu.equals("4")) {
//                // DO SOMETHING #4 Hidden
//            } else {
//                System.out.println("Sorry, that was an invalid selection. Please try again.");
//            }
        }
    }
}
