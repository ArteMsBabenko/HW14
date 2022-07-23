package Max;

import java.util.*;

public class Add {
	
	ArrayList<Commodity> add = new ArrayList<Commodity>();

	public void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name:");
		String name = sc.next();
		System.out.println("Enter the length of the item:");
		int length = sc.nextInt();
		System.out.println("Enter product weight:");
		int weight = sc.nextInt();
		System.out.println("Enter product width:");
		int width = sc.nextInt();
		
		Commodity cm = new Commodity(name,length,width,weight);
		
		add.add(cm);
		System.out.println("Product"+cm.toString()+"added to shelf");
	}
	
	public void removeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name:");
		String name = sc.next();
		System.out.println("Enter the length of the item:");
		int length = sc.nextInt();
		System.out.println("Enter product weight:");
		int weight = sc.nextInt();
		System.out.println("Enter product width:");
		int width = sc.nextInt();
		
		boolean Correct = isExists(add,name,length,width,weight);
		
		if (Correct) {
			Iterator<Commodity> it =add.iterator();
			
			while(it.hasNext()) {
				Commodity nextCommodity = it.next();
				if (nextCommodity.getName().equalsIgnoreCase(name)&& nextCommodity.getLength() == length
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight()== weight) {
					it.remove();
					System.out.println("Product " + nextCommodity.toString() + " removed from shelf");
				}
			}
		}
		else {
			System.out.println("The product you entered is not exists");
		}
	}
	
	public void replaceCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name:");
		String name = sc.next();
		System.out.println("Enter the length of the item:");
		int length = sc.nextInt();
		System.out.println("Enter product weight:");
		int weight = sc.nextInt();
		System.out.println("Enter product width:");
		int width = sc.nextInt();
		
		boolean Correct = isExists(add,name,length,width,weight);
		
		if(Correct) {
			for(Commodity commodity :add) {
				if(commodity.getName().equalsIgnoreCase(name)&& commodity.getLength()==length
					&& commodity.getWidth()== width && commodity.getWeight() == weight) {
					
						System.out.println("Enter a new product name:");
						String newName = sc.next();
						System.out.println("Enter new product length:");
						int newLength = sc.nextInt();
						System.out.println("Enter new product width");
						int newWidth = sc.nextInt();
						System.out.println("Enter new product weight");
						int newWeight = sc.nextInt();
						commodity.setName(newName);
						commodity.setLength(newLength);
						commodity.setWidth(newWidth);
						commodity.setWeight(newWeight);
						System.out.println("The entered product has been  replaced with " + commodity.toString() );
					}
				}
			
			}
		else {
			System.out.println("The product you entered is not exists");
		}
}

	
public void sortByName() {
	System.out.println("Before sorting, the goods were placed on the shelf in the following order:");
	for (Commodity commodity : add) {
		System.out.println(commodity);
		}
	Collections.sort(add,new Name());
	System.out.println("After sorting, the order of the items on the shelf will be as follows:");
	for(Commodity commodity :add) {
		System.out.println(commodity);
	}
	}

public void sortByLength() {
	System.out.println("Before sorting, the goods were placed on the shelf in the following order:");
	for (Commodity commodity : add) {
		System.out.println(commodity);
		}
	Collections.sort(add,new Length());
	System.out.println("After sorting, the order of the items on the shelf will be as follows:");
	for(Commodity commodity :add) {
		System.out.println(commodity);
	}
	}

public void sortByWidth() {
	System.out.println("Before sorting, the goods were placed on the shelf in the following order:");
	for (Commodity commodity : add) {
		System.out.println(commodity);
		}
	Collections.sort(add,new Width());
	System.out.println("After sorting, the order of the items on the shelf will be as follows:");
	for(Commodity commodity :add) {
		System.out.println(commodity);
	}
	}

public void sortByWeight() {
	System.out.println("Before sorting, the goods were placed on the shelf in the following order:");
	for (Commodity commodity : add) {
		System.out.println(commodity);
		}
	Collections.sort(add,new Weight());
	System.out.println("After sorting, the order of the items on the shelf will be as follows:");
	for(Commodity commodity :add) {
		System.out.println(commodity);
	}
	}

public void getCommodity() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the serial number of the product on the shelf:");
	int i =sc.nextInt();
	
	if (i<0 || i>(add.size()-1)) {
		System.out.println("Product with this serial number is not on the shelf");
	} 
	else {
		System.out.println("Under the ordinal " + i + " on the shelf is " + add.get(i).toString());
	}
}

static boolean isExists(ArrayList<Commodity> add, String name, int length, int width, int weight) {
	boolean flag = false;

	for (Commodity commodity : add) {
		if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
				&& commodity.getWidth() == width && commodity.getWeight() == weight) {
			flag = true;
		}
	}

	return flag;
}


}
	

