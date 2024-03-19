import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExist {

    public static void main(String[] args) {
        String filePath = "src/dictionary.txt";
        		
        // Check if the file exists
        if (doesFileExist(filePath)) {
            // Print out the words in the file
            Scanner scanner = null;
			try {
				scanner = new Scanner(new File(filePath));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            while (scanner.hasNext()) {
            	String string = scanner.nextLine();
            	for(int i = 0; i < string.length(); i ++) {
                if(string.charAt(i) == '-' || string.charAt(i) ==',')
                System.out.println();
                else
                System.out.print(string.charAt(i));
            	}
            	System.out.println();
            }
            scanner.close();
        } else {
            System.out.println("File does not exist");
        }
    }

    public static boolean doesFileExist(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }
}