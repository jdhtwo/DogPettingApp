package com.danharding;

import java.io.File;

public class Application {

    public static void main (String[] args){
        System.out.println("*** Welcome to the Dog Petting App! ***");
        MainMenu mainMenu = new MainMenu();
        mainMenu.mainMenu();

        //all taken from walt

//        MainMenu mainMenu = new MainMenu();
//        mainMenu.mainMenu();
//
//        Inventory inventoryDao = new FileInventory(new File("vendingmachine.csv"));
//
//        ChangeMaker changeMaker = new MinimumChangeMaker();
//
//        Auditable auditLog = new FileAuditLog(new File("Log.txt"));
//
//        VendingMachine vendingMachine = new VendingMachine(inventoryDao, changeMaker, auditLog);

//        // Create CLIs
//        Menu menu = new Menu(System.in, System.out);
//        PurchaseMenuCLI purchaseMenuCLI = new PurchaseMenuCLI(menu, vendingMachine);
//        VendingMachineCLI cli = new VendingMachineCLI(menu, purchaseMenuCLI, vendingMachine);
//
//        // Begin
//        cli.run();
    }
}
