
class CaesarEncr
{  private char[] original,final1;
   int shift;
	 public CaesarEncr(char [] input,int shift)
	{
	 original=input;
	 this.shift=shift;
	 }

	 public char[] coding()
	 {  
        for(int i=0;i<original.length;i++)
        {
        char temp = original[i];

        if(temp==' ')
        	{ original[i]=' ';
            continue; 
        }
        temp=(char)(temp+shift);

        if(temp>'z')
        temp =(char)(temp-26);

        else if(temp<'a')
        temp = (char)(temp+26);

         original[i]=temp;
         }


         return original;
    } 


    public char[] decoding()
    {   
 for(int i=0;i<original.length;i++)
        {
        char temp = original[i];

        if(temp==' ')
        	{ original[i]=' ';
            continue; 
        }
        temp=(char)(temp-shift);

        if(temp>'z')
        temp =(char)(temp-26);

        else if(temp<'a')
        temp = (char)(temp+26);

         original[i]=temp;
         }


         return original;
     
    }
}
class CaesarCipher
{
public static void main(String[] args)
{
	char[] input;
	char[] output;

	String s;

	s="my name is tania";
	input=s.toCharArray();
	System.out.println("Message to be encrypted is \n"+s);
	CaesarEncr c = new CaesarEncr(input,2);
   System.out.println("caesar encryption is\n" +c);

	output=c.coding();
    for(int i=0;i<output.length;i++)
    	{System.out.print(output[i]);}

    System.out.println();

    output=c.decoding();
    for(int i=0;i<output.length;i++)
    	{System.out.print(output[i]);}

}
}
