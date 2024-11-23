package hust.soict.dsai.garbage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] aStrings) {
        String filename = System.getProperty("user.dir")+File.separator+"test.txt";
        byte[] inputBytes = { 0 };
        long startTime = System.currentTimeMillis();
     
        try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String outputString = "";
        for(byte b: inputBytes){
            outputString += (char) b;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
