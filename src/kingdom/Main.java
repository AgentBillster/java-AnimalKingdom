package kingdom;

import java.util.*;
import java.util.function.Predicate;

public class Main {

	private static List<AbstractClass> filteredList = new ArrayList<>();

	public static void filterAnimals(List<AbstractClass> animals, CheckA tester, boolean printit) {
		filteredList.clear();
		for (AbstractClass a : animals) {
			if (tester.test(a)) {
				if (printit) {
					System.out.println(a.getName());
				}
				filteredList.add(a);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Is this thing on?");
		// create animal list - using an array list
		List<AbstractClass> animalList = new ArrayList<>();
		// mammals
		animalList.add(new Mammal("Panda", 1869));
		animalList.add(new Mammal("Zebra", 1778));
		animalList.add(new Mammal("Koala", 1816));
		animalList.add(new Mammal("Sloth", 1804));
		animalList.add(new Mammal("Armadillo", 1758));
		animalList.add(new Mammal("Raccoon", 1758));
		animalList.add(new Mammal("Bigfoot", 2021));
		// birds
		animalList.add(new Birds("Pigeon", 1837));
		animalList.add(new Birds("Peacock", 1821));
		animalList.add(new Birds("Toucan", 1758));
		animalList.add(new Birds("Parrot", 1824));
		animalList.add(new Birds("Swan", 1758));
		// fish
		animalList.add(new Fish("Salmon", 1758));
		animalList.add(new Fish("Catfish", 1817));
		animalList.add(new Fish("Perch", 1758));
		for (AbstractClass a : animalList) {
			System.out.println(a);
		}
		// see if we can even print the list
		// List all the animals in descending order by year named
		System.out.println("\n *** List all the animals in descending order by year named");
		animalList.sort(Comparator.comparing(o -> o.getYear(), Comparator.reverseOrder()));
		for (AbstractClass a : animalList) {
			System.out.println(a);
		}
		System.out.println("\n ***  List all the animals alphabetically");
		animalList.sort(Comparator.comparing(o -> o.getYear(), Comparator.reverseOrder()));
		for (AbstractClass a : animalList) {
			System.out.println(a);
		}
		System.out.println("\n ***  List all the animals order by how they move");
		animalList.sort(Comparator.comparing(o -> o.move()));
		for (AbstractClass a : animalList) {
			System.out.print(a);
		}
		System.out.println("\n *** List only those animals the breath with lungs");
		filterAnimals(animalList, a -> a.breath().equals("Lungs"), true);


		System.out.println("\n *** List only those animals that breath with lungs and were named in 1758");
		filterAnimals(animalList, a -> a.breath().equals("Lungs") & a.getYear() == 1758, true);

		System.out.println("\n *** aninmals that lay eggs and breath with lungs");
		filterAnimals(animalList, a -> a.birth().equals("Eggs") & a.breath().equals("Lungs"), true);
		System.out.println("\n ***List alphabetically only those animals that were named in 1758");

		animalList.sort(Comparator.comparing(o -> o.getName()));
		filterAnimals(animalList, a -> a.getYear() == 1758, true);









		// List only those animals that lay eggs and breath with lungs
		// List alphabetically only those animals that were named in 1758
	}

	// Predicate<AbstractClass> withLungs = new Predicate<>(){
	// public boolean test(AbstractClass t) {
	// return t.breath() == "lungs";
	// }
	// };

}
