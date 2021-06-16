import java.util.Scanner;

public class FileManagementSystem {
	int add;
	int delet;
	int creat;
	

	public static void main(String[] args) {
	System.out.println("welcome to our file management system application where you can create add or delet your files ");
	Scanner in = new Scanner(System.in);
	System.out.println(" ");
	System.out.println("I am nawaf Mohammed i just asked form my manager to develop this great file management system. \r\n" + 
			"And I hope you enjoy using my application (:\r\n" + 
			"");
	        System.out.println("you can press .1 for add .2 delet .3 creat new file .0 to exit ");
	        int user = in.nextInt();
	        
	        for(int i =-1; user == 1;i++) {
	           System.out.println("welcome u can add new files now ");
	           System.out.println("u can exit by pressing 0");
	           int exit = in.nextInt();
	           if (exit ==0)
	           {
	        	   break;
	           }
	        }
	        
	        
	        
	

	}
}


