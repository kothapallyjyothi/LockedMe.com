package com.lockedme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeMain {

	static final String folderpath="C:\\MyPhase1Project\\SourceCode\\LockedmeProject\\directory";
	public static void main(String[] args) 
		{
		//Display Main Menu Options
		FileHandlingOptions.displayFirstMenuOptions();
	
		}	

			public static void getAllFiles()
			{
				
				//Getting the files

				// TODO Auto-generated method stub

				//get file names
				//Using forEach loop to get all file names 
				List<String> fileName = FileOperations.getAllFiles(folderpath);
				for (String f :fileName)
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
