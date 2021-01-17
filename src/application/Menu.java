package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

		private Scanner scanner = new Scanner(System.in);
		private List<String> menuChoices = Arrays.asList(
				"See a list of available recipes", 
				"See a single recipe with its flavors",
				"Create a new recipe",
				"Delete an old recipe",
				"Add a new flavor",
				"Delete an old flavor",
				"Replace an old flavor with a new one");
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			if (selection.equals("1")) {
				//displayAllRecipes();
			} else if (selection.equals("2")) {
				//displaySingleRecipe();
			} else if (selection.equals("3")) {
				//CreateRecipe();
			} else if (selection.equals("4")) {
				//deleteRecipe();
			} else if (selection.equals("5")) {
				//addNewFlavor();
			} else if (selection.equals("6")) {
				//deleteOldFlavor();
			} else if (selection.equals("7")) {
				//replaceOldFlavor();
			}
			
			System.out.println("Press enter to continue.....");
			scanner.nextLine();
		} while(!selection.equals("-1"));
	}

	
		
	

	private void printMenu() {
		System.out.println("Select an option\n----------------------------------");
		for (int i = 0; i < menuChoices.size(); i++) {
			System.out.println(i + 1 + ") " + menuChoices.get(i));
		}
	}
}
