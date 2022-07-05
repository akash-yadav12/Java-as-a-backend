import java.util.*;
class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// Adding elements to the Set using add()
		set.add("Geeks");
		set.add("For");
		set.add("Geeks");
		set.add("Example");
		set.add("Set");

		System.out.println(set);
	}
}
