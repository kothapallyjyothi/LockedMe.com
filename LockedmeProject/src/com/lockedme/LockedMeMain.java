package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeMain {

	static final String folderpath="C:\\MyPhase1Project\\LockedMeFiles";
	public static void main(String[] args) 
{
		
				{
						//Variable declaration
						Scanner obj = new Scanner(System.in);
						int ch;
						
						//Menu 
						displayMenu();
						System.out.println("Enter your choice:");
						ch=Integer.parseInt(obj.nextLine());
						
						//
						switch(ch)
						{
						case 1 : getAllFiles();
								break;
						case 2 : createFiles();
								break;
						case 3: deleteFile();
								break;
						case 4: searchFile();
								break;
						case 5: System.exit(0);
								break;
						default : System.out.println("Invalid Option");
								break;
						}		
				
				}
			}	
			//display the options 
			public static void displayMenu()
			{
				System.out.println("***********************************************************");
				System.out.println("\t\tWelcome to LockedMe.com\t\t ");
				System.out.println("");
				System.out.println("***********************************************************");
				System.out.println("1.Display all files ");
				System.out.println("2.Add new file"); 
				System.out.println("3.Delete a file");
				System.out.println("4.Search a file");
				System.out.println("5.Exit");
				System.out.println("***********************************************************");
			}
			public static void getAllFiles()
			{
				
				//Getting the files

				// TODO Auto-generated method stub

					List<String> fileNames = FileOperations.getAllFiles(folderpath);
						
					for(String f:fileNames)
					System.out.println(f);
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
