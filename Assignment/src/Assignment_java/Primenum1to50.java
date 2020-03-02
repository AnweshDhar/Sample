package Assignment_java;

public class Primenum1to50 {

	public static void main(String[] args) {

  
    
    for(int i=2; i<=50; i++)
    { 
    	int cnt= 0;
    	for (int j=2; j<=i/2; j++)
    		
    	{
    		
    		if (i%j==0)
    		{
    		
    			cnt++;
    		}
    		
    	}
    	if (cnt== 0)
    	
    		System.out.println(i);
    	
    }
    	
	}

}
