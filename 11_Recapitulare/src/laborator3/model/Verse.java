package laborator3.model;

import java.util.Random;

public class Verse {
	private String verse;
	private int wordsNumber;
	private int vowelsNumber;
	private boolean upperCaseFlag;

	public Verse(String verse) {
		super();
		this.verse = verse;
	}

	public void initWordsNumber() {
		if (verse.isEmpty() || verse == null) {
			wordsNumber = 0;
		} else {
			String[] s = verse.split("\\s+");
			wordsNumber = s.length;
		}
	}

	@Override
	public String toString() {
		String message;

		if (wordsNumber != 0) {
			message = verse + "			--> Number of Words : " + wordsNumber + " ; Number of vowels : " + vowelsNumber;
		} else {
			message = verse;
		}

		return upperCaseFlag ? message.toUpperCase() : message;
	}

	public int getWordsNumber() {
		return wordsNumber;
	}

	public void initVowelsNumber() {
		vowelsNumber = vowelno(verse, verse.length());
	}

	private int vowelno(String verse, int length) {
		if (length == 0) {
			return 0;
		} else {
			if (length == 1) {
				return isvowel(verse.charAt(length - 1));
			}
		}
		return vowelno(verse, length - 1) + isvowel(verse.charAt(length - 1));
	}

	private int isvowel(char charAt) {
		charAt = Character.toLowerCase(charAt);
		if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u') {
			return 1;
		} else {
			return 0;
		}
	}

	public void generateRandomUperCase() {
		Random rand = new Random();
		double randomNumber = rand.nextDouble();
		if (randomNumber < 0.1) {
			upperCaseFlag = true;
		}
	}
}
