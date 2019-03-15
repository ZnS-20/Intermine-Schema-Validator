import validate.Validate;	

import java.io.File;
import java.util.Scanner;

class Intermine_Schema_Validator
{
	public static void main(String[] args)throws Exception 
	{
		Scanner scan = new Scanner(System.in);
		String st = scan.nextLine();
		File file = new File(st);
        Validate obj = new Validate();
        obj.check_extension(file);
    }
}
