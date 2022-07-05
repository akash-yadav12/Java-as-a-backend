import java.io.*;
import java.util.*;
class Write {
	public static void main(String[] args) throws IOException{
    Scanner sc= new Scanner(System.in);
    String str;
    System.out.println("Enter text that needs to be written in the file:");
    str = sc.nextLine();
		FileWriter fw=new FileWriter("output.txt");

		for (int i = 0; i < str.length(); i++){
			fw.write(str.charAt(i));
    }

		System.out.println("Written successfully");
		fw.close();
	}
}
