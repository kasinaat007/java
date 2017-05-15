package asdf;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

		String dept[]={"CSE","IT","MECH","CIVIL"};
		if(rollno.length()==6)
		{
			int i;
			char rlno[]=rollno.toCharArray();
			System.out.print("Roll No          :");
			for(i=0;i<rlno.length;i++)
			{
			System.out.print(rlno[i]);
			}
			System.out.println("");
	    	System.out.println("Year of joining   "+"20"+rollno.substring(0,2));
	    	System.out.println("Ending Year       "+"20"+(Integer.parseInt(rollno.substring(0,2))+4));
	   		char dep=rlno[2];
	   		System.out.print("Department  Name    :");
	   		switch(dep)
	   		{
	   			case 'P': System.out.print("CSE");
	   						break;
	   			case 'M': System.out.print("MECH");
	   						break;
	   			case 'C': System.out.print("CIVIL");
	   						break;
	   			case 'I': System.out.print("IT");
	   						break;
	   		}

	   		int ltrl=Integer.parseInt(rollno.substring(3,4));
	   		if(ltrl>=5)
	   		{
	   			 System.out.println("Lateral  Entry");
	   		}
	   }
	}
}