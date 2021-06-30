import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
public class TheMenu2 {
	public void Menu2()

	{
		Scanner user = new Scanner(System.in);
		int num = user.nextInt();
		if (num==1)
		{
			try {
				Files.list(Paths.get("C:\\Users\\rockl\\eclipse-workspace\\Project2\\files of the project")).forEach(System.out::println);
			} catch (IOException e) {

				e.printStackTrace();
			}
			System.out.println("all the files is in Ascending order");

		}if(num==3)
		  {
			System.out.println("thank you for using our app (:");
		  }
		while (num<=7 && num!=3 &&  num>1 )
		{
			System.out.println("4: to add files");
			System.out.println("5: delete files");
			System.out.println("6: search files");
			System.out.println("7: go back ");
			int xx = user.nextInt();
			if(xx==4)
			{

				Path path = Paths.get("C:\\Users\\rockl\\eclipse-workspace\\Project2\\files of the project//nawaff.text");
				try {
					Path P = Files.createFile(path);
				} catch (IOException e) {

					e.printStackTrace();
				}
				System.out.println("the new file is added ");
				break;
			}if (xx==5)
			{try {
				Files.deleteIfExists(Paths.get("C:\\Users\\rockl\\eclipse-workspace\\project2\\files of the project//asm.text"));
				System.out.println("the file is removed ! ");
			} catch (IOException e) {

				e.printStackTrace();
			}

			break;  
			}if (xx==6)
			{
				try {
					Files.list(Paths.get("C:\\Users\\rockl\\eclipse-workspace\\Project2\\files of the project")).forEach(System.out::println);
				} catch (IOException e) {

					e.printStackTrace();
				}
				break;
			} 
			             while(true)
			       {      if(xx==7)
			       {
			    	   MethodOne mm = new MethodOne();
			    		  
			    		  mm.Method1();
			    		  break;
			       }
			    	 
			      }
		} 


	} 
}    




