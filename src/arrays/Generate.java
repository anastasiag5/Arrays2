/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author arch
 */
public class Generate {
	public static String[] NAMES = {"Артем", "Андрей", "Александр", "Анна", "Катя", "Ангелина"};
	public static String[] LAST_NAMES = {"Брагин", "Шахов", "Помелов", "Молчанова", "Заворыкина", "Манничева"};
	public static String[] GENDERS = {"М", "М", "М", "Ж", "Ж", "Ж"};

	public static int[] generateArray(int[] array, int min, int max) {
		for (int i = 0; i < array.length; i++) {
			array[i] = generateNumber(min, max);
		}
		return array;
	}

	public static int[][] generateArray(int[][] array, int min, int max) {
		for (int[] a : array) { // Заполнение массива случайными значениями
			for (int i = 0; i < a.length; i++) {
				a[i] = (int) (Math.random() * max + min);
			}
		}
		return array;
	}
	
	public static int generateNumber(int min, int max) {
		return (int) (Math.random() * min + max);
	}

	public static String[] generateNameAndLastNameAndGender() {
		int randomNumber = (int)(Math.random() * NAMES.length);
		String name = NAMES[randomNumber];
		String lastName = LAST_NAMES[randomNumber];
		String gender = GENDERS[randomNumber];
		String[] result = {name, lastName, gender};
		return result;
	}

	public static Student generateStudent() {
		String[] nameAndLastNameAndGender = generateNameAndLastNameAndGender();
		int age = (int)(Math.random() * 12 + 7); // Max: 19; Min: 7
		return new Student(nameAndLastNameAndGender[0], nameAndLastNameAndGender[1], nameAndLastNameAndGender[2], age);
	}
}
