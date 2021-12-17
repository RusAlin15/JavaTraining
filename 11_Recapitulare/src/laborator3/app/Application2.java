package laborator3.app;

import inputOotputClasses.Keyboard;

public class Application2 {
	public static void main(String[] args) {
		Keyboard keyboard = new Keyboard();
		String s1, s2;

		s1 = keyboard.getMessage("Insert firts string");
		s2 = keyboard.getMessage("Insert second string");

		StringBuilder sb = new StringBuilder(s1);
		sb.append(s2);
		System.out.println(sb);

		sb.insert(2, s2);
		System.out.println(sb);

		sb.delete(2, 5);
		System.out.println(sb);
	}
}
