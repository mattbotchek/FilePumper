//Created by Matthew Botchek
//LEAVE THIS IN ^^

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FilePumper {
		//This is a blank constructor because you don't need to pass any properties to it.
		public FilePumper()
		{
		
		}
		/*
		 * The createFile() method creates a single file wherever you want it to go
		 * you supply the pathname and it does the rest of the work
		 * The string you pass it upon calling the method is the pathname that the method 
		 * will use to place a new file in.
		 */
		public void createFile(String f) throws IOException
		{
			String pathname = f;
			File newFile = new File(pathname);
			newFile.createNewFile();
		}
		/*
		 * The infiniteFiles() method uses a boolean and an int to run.
		 * The int is the amount of file created and the boolean controls if the files are created or not
		 * (ie, it runs till the program terminates so be careful with this program)
		 */
		public void infiniteFiles(String pathname) throws IOException
		{
			int i = 1;
			boolean run = true;
			while (run = true)
			{
				//This takes the i int and converts it to a string and then adds it to the string f
				String f = pathname + i + ".txt";	
				//the string f contains the pathname and the file name with a .txt at the end
				File newFile = new File(f);
				newFile.createNewFile();
				i++;	
				//This prints out the path to the file
				System.out.println(f);
			}
		}
		/*
		 * The pumpFile() method takes in the pathname string that is passed to it and generates random
		 * numbers within the file. Be careful with this as depending on whether your smart enough to make 
		 * this recursive you could generate a large .txt file.
		 */
		public void pumpFile(String pathname) throws IOException
		{
			Random generator = new Random();
			//This PrintWriter using the name out takes the pathname that is passed and opens that file
			PrintWriter out = new PrintWriter(new FileWriter(pathname));
			boolean run = true;
			while (run = true)
			{
				//This generates a random in up to the value of 9
				int x = generator.nextInt(9);
				//This prints it to the page
				out.print(x);
				//You could imagine that this is the save ability and calling it saves all the data onto the page.
				out.flush();
				System.out.println(x);
			}
			//This is also like a save ability and saves the data
			out.close();
			//(I'm not sure which one actually saves the data into the .txt file.
		}
	}

