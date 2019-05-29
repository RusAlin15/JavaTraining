package sessions.session01.tema;
import java.io.*;

public class CountLines {

		private String folderName;
		private int foldersNumber = 0;
		private int filesNumber = 0;
		private int javaFilesNumber = 0;
		private int linesNumber = 0 ;
		
		private int ignoredFreeLines = 0;
		private int ignoredcommentsLines = 0;
		private int countedAccesSpecifiers = 0;
		//41050853
		private int publicSpecifier = 0;
		private int privateSpecifier = 0;
		private int protectedSpecifier = 0;
		
		
		private boolean ignoreSpaces = false;
		private boolean ignoreComments = false;
		private boolean countAccessSpecifiers = false;
		
		CountLines(String[] args) throws IOException{
			
			if(args.length > 0 && args[args.length - 1].indexOf(":") != -1) {
				folderName = args[args.length - 1];
			} else {
				folderName = ".";				
			}
			
			for(int i = 0; i < args.length; i++) {
				switch(args[i]) {
				case "ignoreSpaces" : 
					ignoreSpaces = true;
					break;
				case "ignoreComments" :
					ignoreComments = true;
					break;
				case "countAccessSpecifier":
					countAccessSpecifiers = true;
					break;
				default:
					
				}
			}
			
			search(new File(folderName));
			
		}
		
		public String toString() {
			String toScreen = "";
			toScreen += " Folder Name: " + folderName +"\n"; 
			toScreen += foldersNumber + " Folders\n";
			toScreen += filesNumber + " Files\n";
			toScreen += javaFilesNumber + " Java Files\n";
			
			if(ignoreSpaces) {
				if(ignoreComments) {
					toScreen += (linesNumber - ignoredcommentsLines - ignoredFreeLines) + " lines of code\n"
							+ " ( comment lines & Free lines not counted)\n";					
				} else {
					toScreen += (linesNumber - ignoredFreeLines) + " lines of code\n"
							+ " ( Free lines not counted)\n";
				} 	
			} else {
				toScreen += linesNumber + " lines of code\n"
						+ " ( All lines not counted)\n";
			}
			
			//toScreen += ignoredFreeLines + " space lines\n";
			//toScreen += ignoredcommentsLines + " comment lines\n";
			
			if(countAccessSpecifiers) {
				toScreen += "\n Access Specifier Report:\n" ;
				toScreen += publicSpecifier + " public " + "("+
						 + (publicSpecifier/(publicSpecifier + privateSpecifier + protectedSpecifier)) 
						 + ")\n";
				toScreen += protectedSpecifier + " protected " + "("+
						 + (protectedSpecifier/(publicSpecifier + privateSpecifier + protectedSpecifier)) 
						 + ")\n";
				toScreen += privateSpecifier + " private " + "("+
						 + (privateSpecifier/(publicSpecifier + privateSpecifier + protectedSpecifier)) 
						 + ")\n";
				
			}

			return toScreen;
			}
			
		private void search(File folder) throws IOException {
			File[] files = folder.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					foldersNumber++;
					search(file);
				} else {
					filesNumber++;
					String[] splits = file.getName().split("\\.");
					
					if(splits[splits.length-1].contentEquals("java")){
						javaFilesNumber++;
						countLines(file);
					}
				}
			}
		}
		
		private int countLines (File file) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			
			while(true) {
				String s = br.readLine();
				
				if(s == null) {
					break;
				}
				linesNumber++;		
				s = s.trim();
				
				if(s.length() == 0) {
					ignoredFreeLines++;
				}
				
				if(s.indexOf("//") == 0) {
					ignoredcommentsLines++;
				}
				
				
				if(s.indexOf("/*") == 0) {
					ignoredcommentsLines++;
					while(s.indexOf("*/") == -1) {
						ignoredcommentsLines++;
						s = br.readLine();
					} 
				}
				if( s.indexOf("//") == -1  && countAccessSpecifiers  ) {
					if(s.indexOf("public") == 0) {
						publicSpecifier++;
					} else if(s.indexOf("proteced") == 0) {
						protectedSpecifier++;
					} else if(s.indexOf("private") == 0) {
						privateSpecifier++;
					}
					
				}
			}
			br.close();
			return linesNumber;
	}
}

