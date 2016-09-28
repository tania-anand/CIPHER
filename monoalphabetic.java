class MonalphabeticCipher
{

// here cipher code is the key array which can be set according to you
char[] cipherCode = {'b','e','f','g','h','i','j','k','l','z','p','q','t','c','r','y','m','s','u','w','n','o','v','x','d','a'};
// alphabeticalOrder array where ahphabets are stored in order;
char[] alphabeticalOrder ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
char[] input;
char[] output;
MonalphabeticCipher(String s)
{   
    
	input  = new char[s.length()];
	output = new char[s.length()];
    input=s.toLowerCase().toCharArray();

}

public String encryption()
{
for(int i =0;i<input.length;i++)
{
for(int j= 0;j<alphabeticalOrder.length;j++)
{
if(input[i]==alphabeticalOrder[j])
{
output[i]=cipherCode[j];
}
if(input[i]==' ')
{
output[i]=' ' ;
}
}
}
return(String.valueOf(output));
}

public String decryption()
{
for(int i =0;i<input.length;i++)
{
for(int j= 0;j<alphabeticalOrder.length;j++)
{
if(input[i]==cipherCode[j])
{
output[i]=alphabeticalOrder[j];
}
if(input[i]==' ')
{
output[i]=' ' ;
}
}
}
return(String.valueOf(output));
}
}

class MonalphabeticCipher1
{
public static void main(String[] args)
{
MonalphabeticCipher m = new MonalphabeticCipher("Tania");
System.out.println(" Encryption is "+m.encryption());
MonalphabeticCipher w = new MonalphabeticCipher(m.encryption());
System.out.println("Decryption is "+w.decryption());
}
}
