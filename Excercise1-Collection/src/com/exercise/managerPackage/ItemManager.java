package com.exercise.managerPackage;

import java.util.ArrayList;
import java.util.List;

import com.exercise.objects.Item;

public class ItemManager {
	
		
public  List<Item> getSortedList(List<Item> itemList) {
			
			int listSize = itemList.size();
			Item itemTemp = new Item();
			for(int i =0; i<listSize;i++) {
				for(int j =i+1;j<listSize;j++) {
					if((itemList.get(i).getPrice()) < (itemList.get(j).getPrice()))
					{
						itemTemp = itemList.get(i);
						itemList.set(i,itemList.get(j)) ;
						itemList.set(j, itemTemp);
					}
				}
			}
		return itemList;
	}
//
public  void filterByT(List<Item> itemList) {
	for(Item item : itemList) {
		if(item.getBrand().startsWith("T")) {
			System.out.println("Item id :"+item.getItemId());
			System.out.println("ShortDescription: "+item.getShortDescription());
			System.out.println("Price:"+item.getPrice());
			System.out.println("Brand :" +item.getBrand() + "\n\n\n");
			
		}
	}
	
}

public  List<Item> createItemList() {
	List<Item> itemList = new ArrayList<Item>();
	Item item1 = new Item();
	item1.setItemId(1);
	item1.setShortDescription("Rice");
	item1.setPrice(34);
	item1.setBrand("Falcon");
	Item item2 = new Item();
	item2.setItemId(2);
	item2.setShortDescription("Wheat");
	item2.setPrice(58);
	item2.setBrand("Fortune");
	Item item3 = new Item();
	item3.setItemId(3);
	item3.setShortDescription("Flour");
	item3.setPrice(60);
	item3.setBrand("Nirapara");
	Item item4 = new Item();
	item4.setItemId(4);
	item4.setShortDescription("Semolina");
	item4.setPrice(45);
	item4.setBrand("Vedaka");
	Item item5 = new Item();
	item5.setItemId(5);
	item5.setShortDescription("Biriyani Rice");
	item5.setPrice(80);
	item5.setBrand("Fortune");
	Item item6 = new Item();
	item6.setItemId(6);
	item6.setShortDescription("Dhall");
	item6.setPrice(78);
	item6.setBrand("Maharaja");
	Item item7 = new Item();
	item7.setItemId(7);
	item7.setShortDescription("Orid Dhall");
	item7.setPrice(58);
	item7.setBrand("Maharaja");
	Item item8 = new Item();
	item8.setItemId(8);
	item8.setShortDescription("Tea");
	item8.setPrice(25);
	item8.setBrand("Tetley");
	Item item9 = new Item();
	item9.setItemId(9);
	item9.setShortDescription("Coffee");
	item9.setPrice(65);
	item9.setBrand("Nescafe");
	Item item10 = new Item();
	item10.setItemId(10);
	item10.setShortDescription("Raw Rice");
	item10.setPrice(37);
	item10.setBrand("Torisca");
	itemList.add(item1);
	itemList.add(item2);
	itemList.add(item3);
	itemList.add(item4);
	itemList.add(item5);
	itemList.add(item6);
	itemList.add(item7);
	itemList.add(item8);
	itemList.add(item9);
	itemList.add(item10);
	return itemList;
}





	}
	
