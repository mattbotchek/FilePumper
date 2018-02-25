import java.io.IOException;
import java.util.Scanner;
public class FilePumperMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1 to create a file, 2 to create a lot of files,");
		System.out.println("3 to pump a file with an infinite amount of numbers");
		System.out.println("Remember to add .txt to the end of the file pathname");	
		FilePumper runner = new FilePumper();
		Scanner z = new Scanner(System.in);
		int x = z.nextInt();
		if (x == 1)
		{
			System.out.println("What is the path to where you want the file to be created?");
			System.out.println("Include the filename name and .txt at the end of the path");
			Scanner M = new Scanner(System.in);
			String q = M.nextLine();
			runner.createFile(q);
		}
		if (x == 2)
		{
			System.out.println("What is the path to where the files should go?");
			System.out.println("Do not include a name for the file or .txt");
			System.out.println("Be sure to end the path with a /");
			Scanner M = new Scanner(System.in);
			String q = M.nextLine();
			runner.infiniteFiles(q);
		}
		if (x == 3)
		{
			System.out.println("What is the path to the .txt file you want to pump?");
			System.out.println("Be sure to include the filename and .txt in the path");
			Scanner M = new Scanner(System.in);
			String a = M.nextLine();
			runner.pumpFile(a);
		}
	}

}
