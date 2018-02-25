import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FilePumper {
		public FilePumper()
		{

		}
		public void createFile(String f) throws IOException
		{
			String pathname = f;
			File newFile = new File(pathname);
			newFile.createNewFile();
		}
		public void infiniteFiles(String pathname) throws IOException
		{
			int i = 1;
			boolean run = true;
			while (run = true)
			{
				String z = Integer.toString(i);
				String f = pathname + z + ".txt";			
				File newFile = new File(f);
				newFile.createNewFile();
				i++;	
				System.out.println(f);
			}
		}
		public void pumpFile(String pathname) throws IOException
		{
			Random generator = new Random();
			
			PrintWriter out = new PrintWriter(new FileWriter(pathname));
			boolean run = true;
			while (run = true)
			{
				int x = generator.nextInt(9);
				out.print(x);
				out.flush();
				System.out.println(x);
			}
			out.close();
			
		}
	}

