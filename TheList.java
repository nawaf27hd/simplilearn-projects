import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TheList {
    public void list ()
  {
    	
     Scanner in = new Scanner(System.in);
	  int input = in.nextInt();
	  if (input==3) {
		  System.out.println("thank you for using my program (;");
	  }
	  switch(input)
	  {
	   case 1 :
		   try {
			Files.list(Paths.get("C:\\Users\\rockl\\eclipse-workspace\\file management system\\the project files")).forEach(System.out::println);
			break;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		   case 2 :
			System.out.println("4: add files");
			System.out.println("5: delete files");
			System.out.println("6: search files");
	
			int MM = in.nextInt();
			if (MM==4)
			{
				try {
					System.out.println("add new files");
					 Path path = Paths.get("C:\\Users\\rockl\\eclipse-workspace\\file management system\\the project files//nawaf mohammed.text");
					 Path P = Files.createFile(path);
					 System.out.println("the new file is added ");
					 
					} catch (IOException e) {
						
						e.printStackTrace();
						System.out.println(e.getMessage());
						
					}
					
			} if (MM==5)
			{
				try {
					Files.deleteIfExists(Paths.get("C:\\Users\\rockl\\eclipse-workspace\\file management system\\the project files//nawaf.text"));
					System.out.println("the file is removed ! ");
					} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				break;
			}if (MM==6)
				
			{try {
				Files.list(Paths.get("C:\\Users\\rockl\\eclipse-workspace\\file management system\\the project files")).forEach(System.out::println);
				break;
			} catch (IOException e) {
				
				e.printStackTrace();
				
				    }
		   }
	 
}
	  
	  
	  
	  
	  
  }
}
			
					
				
			
				
  

				
			
			
			
		 
			 
		 
	  
  
			
	  
