class RailFence1
{
char[] input;
char[] output;
int key;
RailFence1(String input , int key)
{
	 String temp = input.replaceAll("\\s","");

	  this.input = temp.toCharArray();
      this.key=key;
      this.output=new char[temp.length()];
	  }


public String encryption()
{
boolean flag=true,joke=true;	
int t=0;
int k=0;
int m=1;
int pos=key+(key-2);
int col1=pos,col2=0;


for(char r:input)
{
	System.out.print(r);
}
 //System.out.println("\nValue of pos is :"+pos);
 //System.out.println("Length of string is :"+input.length);
for(int i = 0;i<key;i++)
{
	 //System.out.println("Starting of key i:"+i);
	 //System.out.println("value of column key 1 is :" +col1);
     //System.out.println("value of column key  2 is :"+col2);
	 //System.out.println("value of m :"+m);
	for(int j=0+k;j<input.length;)
	{
		
		
		if(flag==true )
		{ 
	      
			
		    System.out.println("in col 1 :"+j);
			if( col1==col2)
			{
				//System.out.println("in col1=col2");
				if(j<input.length)
				{
					//System.out.println("in value of t col1:"+t);
			
			output[t]=input[j];
			j=j+col1;
			//System.out.println("in col 1 value of j after incrementing:"+j);
			t++;
	        
				}
			}
			if(col1!=col2 && col1!=pos)
			{
				//System.out.println("in col1!=pos and col1!=col2");
				if(j<input.length)
				{
					output[t]=input[j];
				t++;
				j=j+col1;
				if(j<input.length)
				{
				output[t]=input[j];
				t++;
				flag=false;
				}
				}
			}
			
			if(col1==pos)
			{
				//System.out.println("in col1=pos");
				
				if(j<input.length)
			
			{
				output[t]=input[j];
			j=j+col1;
			//System.out.println("in col 1 value of j after incrementing:"+j);
			t++;
	       
			flag=false;
			}
			
				
			}
		}
			
			
			
			
		
		
	   else if(flag==false&&col2!=0)
	   {
		  // System.out.println("in col 2 :"+j);
		  
		   j=j+col2;
		  // System.out.println("in col 1 value of j after incrementing:"+j);
		  
		   
		   flag=true;
	   }
	  else
	   {
		   flag=true;
	   }
	   
	}
	 k=k+1;
	    m++;
	   // System.out.println("value of k is :"+k);
		
	if(m==key)
	{
		//System.out.println("IN if i== "+m);
		col1=pos;
		col2=0;
		
		flag=true;
		
	}
   else
   {
	col1-=2;
	col2=2*i+2;
	   
		flag=true;
   }


  
}
String temp = new String(output);
return (temp);
}

public String decryption()
{
	boolean flag=true,joke=true;	
int t=0;
int k=0;
int m=1;
int pos=key+(key-2);
int col1=pos,col2=0;

for(int i=0;i<input.length;i++)
{
	output[i]='#';
}
 //System.out.println("\nValue of pos is :"+pos);
 //System.out.println("Length of string is :"+input.length);
for(int i = 0;i<key;i++)
{
	 //System.out.println("Starting of key i:"+i);
	 //System.out.println("value of column key 1 is :" +col1);
     //System.out.println("value of column key  2 is :"+col2);
	 //System.out.println("value of m :"+m);
	for(int j=0+k;j<input.length;)
	{
		
		
		if(flag==true )
		{ 
	      
			
		    System.out.println("in col 1 :"+j);
			if( col1==col2)
			{
				//System.out.println("in col1=col2");
				if(j<input.length)
				{
					//System.out.println("in value of t col1:"+t);
			
			output[j]=input[t];
			j=j+col1;
			//System.out.println("in col 1 value of j after incrementing:"+j);
			t++;
	        
				}
			}
			if(col1!=col2 && col1!=pos)
			{
				//System.out.println("in col1!=pos and col1!=col2");
				if(j<input.length)
				{
					output[j]=input[t];
				t++;
				j=j+col1;
				if(j<input.length)
				{
				output[j]=input[t];
				t++;
				flag=false;
				}
				}
			}
			
			if(col1==pos)
			{
				//System.out.println("in col1=pos");
				
				if(j<input.length)
			
			{
				output[j]=input[t];
			j=j+col1;
			//System.out.println("in col 1 value of j after incrementing:"+j);
			t++;
	       
			flag=false;
			}
			
				
			}
		}
			
			
			
			
		
		
	   else if(flag==false&&col2!=0)
	   {
		  // System.out.println("in col 2 :"+j);
		  
		   j=j+col2;
		  // System.out.println("in col 1 value of j after incrementing:"+j);
		  
		   
		   flag=true;
	   }
	  else
	   {
		   flag=true;
	   }
	   
	}
	 k=k+1;
	    m++;
	   // System.out.println("value of k is :"+k);
		
	if(m==key)
	{
		//System.out.println("IN if i== "+m);
		col1=pos;
		col2=0;
		
		flag=true;
		
	}
   else
   {
	col1-=2;
	col2=2*i+2;
	   
		flag=true;
   }


  
}
String temp = new String(output);
return (temp);
}

}

class RailFence
{
	public static void main(String[] args)
	{
		String str;
	RailFence1 r1 = new RailFence1("cryptography sucks",5);
    str=r1.encryption();
	System.out.println("ENCRYPTED TEXT IS :"+str);
	// System.out.println("MAIN END");	

	 RailFence1 r2 = new RailFence1(str,5);
     System.out.println("ENCRYPTED TEXT IS :"+r2.decryption());
	}
}
