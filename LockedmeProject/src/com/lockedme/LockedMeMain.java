package com.lockedme;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class LockedMeMain {

	static final String folderpath="C:\\MyPhase1Project\\SourceCode\\LockedmeProject\\directory";
	public static void main(String[] args) 
{
		FileHandlingOptions.displayFirstMenuOptions();
	
			}	
//	public static boolean displayFirstMenuOptions()
//	{
//		do {
//			try
//			{
//				Scanner sc = new Scanner(System.in);
//				int input;
//				WelcomeAndMenuOptions.displayMenu();
//				input = Integer.parseInt(sc.nextLine()); //Taking Input from the user
//				switch (input)
//				{
//				case 1:
//					LockedMeMain.getAllFiles(); //Display files in the directory
//					break;
//				case 2:
//					LockedMeMain.welcomeScreenOptions();
//					break;
//				case 3:
//					System.out.println("Program exited successfully."); //exit the program
//					return true;
//				case 4:System.exit(0);
//				break;
//			default:
//				System.out.println("Please select a valid option from above.");//In case of invailed Entery  
//				}
//			}
//				catch (Exception ex)
//				{
//					System.out.println(ex.getClass().getName());
//				}
//		}while (true);
//		
//		
//		
//	}
//			public static   boolean welcomeScreenOptions()
//				{
//				
//				
//				//Variable declaration
//					Scanner sc = new Scanner(System.in);
//					int ch;
//					
//					WelcomeAndMenuOptions.displayFileMenuOption();	
//
//					try 
//					{
//					//Menu 
//					
//					ch=Integer.parseInt(sc.nextLine());
//					
//					//
//					switch(ch)
//					{
//					
//					case 1 : createFiles(); //getting the filenames from folderpath
//							break;
//					case 2 : deleteFile(); // creating new file in folderpath
//							break;
//					case 3: searchFile();	// deleting a file from folderpath
//							break;
//					case 4: return false;	//Search a file from given folderpath
//							
//					case 5: System.exit(0);	//
//							break;
//					default : System.out.println("Invalid Option");
//							break;
//					
//				}
//					}
//					catch(Exception e)
//					{
//						System.out.println(e.getClass().getName());
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//						
//					}
//					return true;
//				
//			}
			
			public static void getAllFiles()
			{
				
				//Getting the files

				// TODO Auto-generated method stub

				//get file names
				//Using forEach 
				List<String> fileName = FileOperations.getAllFiles(folderpath);
				for (String f :fileName)
					System.out.println(f);	
				
//					List<String> fileNames = FileOperations.getAllFiles(folderpath);
//						
//					for(String f:fileNames)
//					System.out.println(f);
			}
			/**This class to create files calling method  from FileOperations
			 * 
			 */
			public static void createFiles()
			{
				//Adding file name 

				//Variable declaration
						Scanner obj = new Scanner(System.in);
						String fileName;
						int linesCount;
						List<String> content = new ArrayList<String>();
						
						//Read file name from user
						System.out.println("Enter file Name:");
						fileName=obj.nextLine();
						
						//Read number of lines from user 
						System.out.println("Enter how many lines in the file:");
						linesCount=Integer.parseInt(obj.nextLine());
						
						//Read Line from user
						for(int i=1;i<=linesCount;i++)
						{
							System.out.println("Enter line "+i+":");
							content.add(obj.nextLine());
							
						}
						
						//save the content into the file 
						boolean isSaved = FileOperations.createFiles( folderpath, fileName, content);
						
						if(isSaved)
							System.out.println("File and data is saved successfully");
						
						else 
							System.out.println("Some error occured. Please contact admin@jyo.com");
			}
			public static void deleteFile()
			
			{
				//Code for deleting a file
						String fileName;
						Scanner obj = new Scanner(System.in);
						System.out.println("Enter file name to be deleted:");
						fileName=obj.nextLine();
						//deletes the specific file from folderpath 
						boolean isDeleted = FileOperations.deleteFile(folderpath, fileName);
						if(isDeleted)
							System.out.println("File deleted successfully");
						else
							System.out.println("Either file not there or some access issue");
			}
			
			public static void searchFile()
			{
				//Code for searching a file
				String fileName;
				Scanner obj = new Scanner(System.in);
				// **input from user 
				System.out.println("Enter file name to be searched:");
				fileName=obj.nextLine();
				//
				boolean isFound = FileOperations.searchFile(folderpath, fileName);
				if(isFound)
					System.out.println("File is present in the folder");
				else
					System.out.println("File is not present in the folder");
				
			}			
}
