import java.io.*;
class Read {
	public static void main(String[] args) throws IOException {
		int ch;

  	FileReader f=null;
		try {
			f = new FileReader("output.txt");
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		while ((ch=f.read())!=-1){
			System.out.print((char)ch);
    }
		f.close();
	}
}
