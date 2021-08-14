package com.lockedme;

import java.util.Scanner;

public class FileHandlingOptions {
	
	public static boolean displayFirstMenuOptions()
	{
		do {
			try
			{
				Scanner sc = new Scanner(System.in);
				int input;
				WelcomeAndMenuOptions.displayMenu();
				input = Integer.parseInt(sc.nextLine()); //Taking Input from the user
				switch (input)
				{
				case 1:
					LockedMeMain.getAllFiles(); //Display files in the directory
					break;
				case 2:
					FileHandlingOptions.welcomeScreenOptions();
					break;
				case 3:
					System.out.println("Program exited successfully."); //exit the program
					return true;
				case 4:System.exit(0);
				break;
			default:
				System.out.println("Please select a valid option from above.");//In case of invailed Entery  
				}
			}
				catch (Exception ex)
				{
					System.out.println(ex.getClass().getName());
				}
		}while (true);
		}
	
	public static   boolean welcomeScreenOptions()
	{
	
		do {
			//Variable declaration
		Scanner sc = new Scanner(System.in);
		int ch;
		
		WelcomeAndMenuOptions.displayFileMenuOption();	

		try 
		{
		//Menu 
		
		ch=Integer.parseInt(sc.nextLine());
		
		//switch 
			switch(ch)
			 {
			
				case 1 : LockedMeMain.createFiles(); //getting the filenames from folderpath
						break;
				case 2 :LockedMeMain.deleteFile(); // creating new file in folderpath
						break;
				case 3: LockedMeMain.searchFile();	// deleting a file from folderpath
						break;
				case 4: return false;	//Search a file from given folderpath
						
				case 5: System.exit(0);	//
						break;
				default : System.out.println("Invalid Option");
						break;
			
			 }
		}
		catch(Exception e)
		{
			System.out.println(e.getClass().getName());
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
}while (true);
	}
	public static boolean FileHandlingDisplayMenu()
	{
	
		do
			
		{
			try
			{
				//Menu 
				WelcomeAndMenuOptions.displayMenu();

				//Variable declaration
				Scanner obj = new Scanner(System.in);
				int ch;
				ch=Integer.parseInt(obj.nextLine());
				
				//
				switch(ch)
				{
				
				case 1 : LockedMeMain.getAllFiles(); //getting the filenames from folderpath
							break;
				case 2 : LockedMeMain.createFiles(); // creating new file in folderpath
						break;
				case 3: LockedMeMain.deleteFile();	// deleting a file from folderpath
						break;
				case 4: LockedMeMain.searchFile();	//Search a file from given folderpath
						break;
				case 5: System.exit(0);
						System.out.println("Program exited successfully.");//exit the program
						break;
				default : System.out.println("Invalid Option");
						break;
				}		
		
				
			}
			catch (Exception Ex)
			{
				
				System.out.println(Ex.getClass().getName());
//				 FileHandlingDisplayMenu();
			}
			
		}while (true);
			}
	
	}