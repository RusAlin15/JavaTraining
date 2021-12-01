package Laborator1;

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

	public ArrayList<Double> extractor() {
		ArrayList<Double> numberList = new ArrayList<Double>();
		while (inputFile.hasNext()) {
			numberList.add(Double.parseDouble(inputFile.nextLine()));
		}
		return numberList;

	}

	public <T> void inserter(String message, T value) {
		outputFile.println(value);
	}
}
