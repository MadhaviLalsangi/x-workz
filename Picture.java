public class Picture{
	public static void main(String[] ab)
	{
		System.out.println("Invoked by JVM");
		
		arrayOfChar();
		
		System.out.println("End of main method by JVM");
	}
	
	public static void arrayOfChar()
	{
		System.out.println("Invoking array of characters");
	
		char pucGrade='A';
		char upGrade='B';
		char lowGrade='c';
		char dog='D';
		char elephant='E';
		char fish='F';
		char goat='G';
		char hat='H';
		char ink='I';
		char zip='Z';
		
		char[] grades={pucGrade,upGrade,lowGrade,dog,elephant,fish,goat,hat,ink,zip};
		
		int sizeOfArray=grades.length;
		System.out.println("Number of characters in Array: "+sizeOfArray);
		
		char characterAtIndex0=grades[0];
		 System.out.println("character at index 0: "+characterAtIndex0);
		 
		char characterAtIndex2=grades[2];		 
		 System.out.println("character at index 2: "+characterAtIndex2);
		 
		char characterAtIndex4=grades[4];	 
		 System.out.println("character at index 4: "+characterAtIndex4);
		
		char characterAtIndex6=grades[6];		 
		 System.out.println("character at index 6: "+characterAtIndex6);
		 
		char characterAtIndex8=grades[8];	 
		 System.out.println("character at index 8: "+characterAtIndex8);
	}
}