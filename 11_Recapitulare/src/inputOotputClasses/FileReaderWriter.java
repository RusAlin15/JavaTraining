//
package inputOotputClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReaderWriter {

	private Scanner inputFile;
	private PrintStream outputFile;

	public FileReaderWriter(String inputFileName, String outputFileName) throws FileNotFoundException {
		inputFile = new Scanner(new File(inputFileName));
		outputFile = new PrintStream(outputFileName);
	}

	public FileReaderWriter(String inputFileName) throws FileNotFoundException {
		inputFile = new Scanner(new File(inputFileName));
	}

	public ArrayList<String> extractor() {
		ArrayList<String> numberList = new ArrayList<>();
		while (inputFile.hasNext()) {
			String nextLine = inputFile.nextLine();
			numberList.add(nextLine);
		}
		inputFile.close();
		return numberList;
	}

	public <T> void inserter(String message, T value) {
		outputFile.append(message);
		outputFile.append(value.toString());
		outputFile.append("\n");
	}

	public String getLine() {

		return null;
	}

	public void close() {
		inputFile.close();
		outputFile.close();
	}
}
