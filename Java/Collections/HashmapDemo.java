import java.util.*;

class HashmapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();

		// Adding elements to the Map using put()
		hm.put("Akash", 10);
		hm.put("Arsh", 30);
		hm.put("Akku", 20);

		// Print size and content of the Map
		System.out.println("Size of map is:- " + hm.size());
		System.out.println(hm);
		if (hm.containsKey("Akash")) {
			// Printing value fr the corresponding key
			System.out.println("value for key Akash is: " + hm.get("Akash"));
		}
	}
}
