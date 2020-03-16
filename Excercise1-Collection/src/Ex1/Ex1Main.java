package Ex1;

import java.util.ArrayList;
import java.util.List;

import com.exercise.managerPackage.ItemManager;
import com.exercise.objects.Item;

public class Ex1Main {

	public static void main(String[] args) {
		
		ItemManager manager = new ItemManager();
	    
        List<Item> itemList = new ArrayList<Item>();
        //Calling createItemList() method from ItemManager
        itemList = manager.createItemList();
        System.out.println("Items... \n");
        for(Item item : itemList) {
			System.out.println("Item id :"+item.getItemId());
			System.out.println("ShortDescription: "+item.getShortDescription());
			System.out.println("Price:"+item.getPrice());
			System.out.println("Brand :" +item.getBrand() + "\n\n\n");
		}
        
        // Ex1-Calling filterByT method from ItemManager
        manager.filterByT(itemList);
        
        //Ex1-Calling getSortedList method from ItemManager
        List<Item> sortedList = new ArrayList<Item>();
		sortedList = manager.getSortedList(itemList);
		System.out.println("Sorted Items... \n");
		for(Item item : itemList) {
			System.out.println("Item id :"+item.getItemId());
			System.out.println("ShortDescription: "+item.getShortDescription());
			System.out.println("Price:"+item.getPrice());
			System.out.println("Brand :" +item.getBrand() + "\n\n\n");
		}
	}
	


}
