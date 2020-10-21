public class Boolean{
	public static void main(String[] args)
	{
		System.out.println("Invoked by JVM");	
		arrayOfBoolean();
		System.out.println("End of main method by JVM");
	}
	
	public static void arrayOfBoolean()
	{
		System.out.println("Invoking Method Array Of Boolean Types");
		
		boolean milkIsWhite=true;
		boolean snakeIsBird=false;
		boolean mobileIsLivingBeing=false;
		boolean sunIsHot=true;
		
		boolean sets[]={milkIsWhite,snakeIsBird,sunIsHot,mobileIsLivingBeing};
		int numberOfArrays=sets.length;
		System.out.println("Number of Statements: "+numberOfArrays);
		
		boolean lineAtIndex0=sets[0];
		System.out.println("Element at Index0: "+lineAtIndex0);
  
        boolean lineAtIndex1=sets[1];
		System.out.println("Element at Index1: "+lineAtIndex1);
		
		boolean lineAtIndex2=sets[2];
		System.out.println("Element at Index2: "+lineAtIndex2);
		
		boolean lineAtIndex3=sets[3];
		System.out.println("Element at Index3: "+lineAtIndex3);
		
		
	}
}