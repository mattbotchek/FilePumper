//Created by Matthew Botchek
//Please... take it out if for some reason you ever come across this. I'll leave it there as a reminder to myself...
import java.io.IOException;
import java.util.Scanner;
public class FilePumperMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//This is the main class / this is where most methods are called and most interaction with the end user is done
		System.out.println("1 to create a file, 2 to create a lot of files,");
		System.out.println("3 to pump a file with an infinite amount of numbers");
		System.out.println("Remember to add .txt to the end of the file pathname");	
		FilePumper runner = new FilePumper();
		//This scanner controls which options the user wants to use 
		Scanner z = new Scanner(System.in);
		int x = z.nextInt();
		if (x == 1)
		{
			System.out.println("What is the path to where you want the file to be created?");
			System.out.println("Include the filename name and .txt at the end of the path");
			//I know that I could use the scanner created above but I found that it would sometimes cause problems
			//So I just created a new one.
			Scanner M = new Scanner(System.in);
			String q = M.nextLine();
			//This runs the createFile() method that is in the FilePumper.java Class
			runner.createFile(q);
		}
		if (x == 2)
		{
			System.out.println("What is the path to where the files should go?");
			System.out.println("Do not include a name for the file or .txt");
			System.out.println("Be sure to end the path with a /");
			//Same issue as the other scanner above
			Scanner M = new Scanner(System.in);
			String q = M.nextLine();
			runner.infiniteFiles(q);
		}
		if (x == 3)
		{
			System.out.println("What is the path to the .txt file you want to pump?");
			System.out.println("Be sure to include the filename and .txt in the path");
			//Same issue with the other two scanners above.
			Scanner M = new Scanner(System.in);
			String a = M.nextLine();
			runner.pumpFile(a);
		}
	}

}
