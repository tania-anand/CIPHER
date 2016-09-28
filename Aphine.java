
class Aphine
{  char[] input;
   int x,y;

Aphine(char[] input,int x1,int y1)
{
this.input=input;
x=x1;
y=y1;
prime();
	
}

public void prime()
{
	

}

public char[] getEncryption()
{   char s =' ';
    int[] tempArr = new int[input.length];	
	for(int i=0;i<input.length;i++)
	{
	  char ch = input[i];

	  if(ch==' ')
	  {
	  tempArr[i]=(int)s;
       continue;
	  }

	  tempArr[i]=(int)ch -97;

	}

	for(int i=0;i<input.length;i++)
	{   if(tempArr[i]==(int)s)
       {  tempArr[i]=(int)s;
          continue;
          }

	 tempArr[i]=x*tempArr[i]+y;
	}


   for(int i=0;i<input.length;i++)
	{ 
	   if(tempArr[i]==(int)s)
       {  tempArr[i]=(int)s;
          continue;
          }


	 tempArr[i]=tempArr[i]%26;
	}

	for(int i=0;i<input.length;i++)
	{

	  if(tempArr[i]==(int)s)
       {  input[i]= s;
          continue;
          }

	 input[i]=(char)(tempArr[i]+97);
	}

return input;
}

public void getDecryption()
{

}
}




class Aphine1
{
public static void main(String[] args)
{
	String s ="hello my name is tania";
    char[] input = s.toCharArray();
    int x1,y1;
    System.out.println("Before Aphine encryption the data is \n" +s);
    x1=5;
    y1=2;
    Aphine a = new Aphine (input,x1,y1);

    char [] output = a.getEncryption();

    System.out.println("code after encryption is");

    for(int i=0;i<output.length;i++)
    {
    System.out.print(output[i]);
    }
}
}
