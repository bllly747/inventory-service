package com.BillyCodes.inventoryservice;

import com.BillyCodes.inventoryservice.Model.Inventory;
import com.BillyCodes.inventoryservice.Repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}




	@Bean
	public CommandLineRunner addInv(InventoryRepository inventoryRepository)
	{
		return args -> {
			// adding data into the database

			Inventory inventory = new Inventory();
			inventory.setQuantity(55);
			inventory.setSkuCode("iphone-13");

			Inventory inventory1 = new Inventory();
			inventory1.setQuantity(2);
			inventory1.setSkuCode("Asus Laptop");

			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory);


		};
	}

}
