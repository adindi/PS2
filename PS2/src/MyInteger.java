public class MyInteger {
	private int value;
	
	public MyInteger(int value)
	{
		this.value = value;
	}

	public int GetValue()
	{
		return this.value;
	}

	public boolean IsEven()
	{
		return(this.value % 2 ==0);
	}

	public boolean IsOdd()
	{
		return(this.value % 2 !=0);
	}
	
	public boolean IsPrime()
	{
		if(value == 1)
		{
			return false;
		}
			for(int x = 2; x < Math.sqrt(value); x++)
			{
				if (value % x == 0)
				{
					return false;
				}
			}
			return true;
	}
	
	public static boolean IsEven(MyInteger MyInt)
	{
		return(MyInt.value % 2 ==0);
	}

	public static boolean IsOdd(MyInteger MyInt)
	{
		return(MyInt.value % 2 !=0);
	}
	
	public static boolean IsPrime(MyInteger MyInt)
	{
		if(MyInt.value == 1)
		{
			return false;
		}
			for(int x = 2; x < Math.sqrt(MyInt.value); x++)
			{
				if (MyInt.value % x == 0)
				{
					return false;
				}	
			{
				return true;
			}
			}
			return true;
			
	}
	
	public boolean equals(int number){
		if (number == value){
			return true;
		}
		else{
			return false;
		}
	}
	
	private boolean equals(MyInteger MyInt){
		if (MyInt.value == value){
			return true;
		}else{
			return false;
		}
	}
	
	public static int parseInt(char[] word){
		int count = 0;
		
		 for (int x = 0 ; x < word.length; x++){
			 count = word[x];
			 count++;
		 }
		 
		 return count;
	}
	
	public static int parseInt(String count){
		return count.length();
	}
	
	}

