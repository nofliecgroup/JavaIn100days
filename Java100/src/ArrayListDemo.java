import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*
		 * String [] stringFooArray = {"Foo", "Bar", "Bufu", "fubu", "Tick"};
		 * List<String> stringList = new ArrayList<>(Arrays.asList(stringFooArray));
		 * 
		 * //Using arrayList add all. String[] stringArray = {"Foo", "Bar", "Bufu",
		 * "fubu", "Tick"}; ArrayList<String> list = new ArrayList<>();
		 * list.addAll(Arrays.asList(stringArray));
		 * System.out.println(list.addAll(Arrays.asList(stringArray)));
		 */
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("Stringa");
		fruits.add("Strawberry");
		fruits.add("Mango");
		
		for(int i=0; i< fruits.size(); i ++) {
			System.out.println(fruits.get(i));
			if("Apple".equals(fruits.get(i))) {
				fruits.remove(i);
				System.out.println("Apple is remove from the list:");
			}
		}
		

	}

}
