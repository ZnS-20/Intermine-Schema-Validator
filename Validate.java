package validate;

import java.io.File;

public class Validate
{
	public void check_extension(File file)
	{
		if(getFileExtension(file).equals("gff3"))
		{
			System.out.println("Extension Verified : .gff3");
		}
		else if(getFileExtension(file) == "fasta")
		{
			System.out.println("Extension Verified : .fasta");
		}
		else
			System.out.println("Invalid Extension");
	}


    private static String getFileExtension(File file)
        {
             String fileName = file.getName();
             if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) //To check the extension of the file.
             return fileName.substring(fileName.lastIndexOf(".")+1); //Return the extension of the file.
             else return "";
        }
}
