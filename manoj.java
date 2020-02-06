import com.chilkatsoft.*;
import java.io.*;
import java.util.Scanner;

class manoj {

  static {
    try {
        System.loadLibrary("chilkat");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }



public static void main(String argv[])
  {

try
{
  
int a;
Writer output = null;
String text;
File file = new File("write.txt");
output = new BufferedWriter(new FileWriter(file));

Scanner input=new Scanner(System.in);


  //  Create two separate instances of the DH object.

	// One for sender one for client.



    CkDh dhSender = new CkDh();
    CkDh dhreceiver = new CkDh();

    boolean success;

    //  Unlock the component once at program startup...
    success = dhSender.UnlockComponent("Anything for trial");
    if (success != true) {
        System.out.println(dhSender.lastErrorText());
        return;
    }


for(;;)
{



String pnum;

		
System.out.println("-------------------------------------------------------------------");
		System.out.println("Enter a Prime Number");
		pnum=input.nextLine();



a= Integer.parseInt(pnum);



if(a==2 || a==3 )
{

break;
}


if(a%2==0 || a%3==0 )
{

System.out.println("(Sender) Enter a Prime Number");

continue;
}


break;


  }


for(;;)
{



String pnum;

		
System.out.println("-------------------------------------------------------------------");
                System.out.println("(Receiver) Enter a Prime Number");
		pnum=input.nextLine();



a= Integer.parseInt(pnum);

if(a==2 || a==3 )
{

break;
}


if(a%2==0 || a%3==0 )
{

System.out.println("Please Enter a Prime Number");

continue;
}


break;


  }


   dhSender.UseKnownPrime(a);


    String p;
    int g;
    //  Sender will now send P and G to receiver.

    p = dhSender.p();
    g = dhSender.get_G();

  


    success = dhreceiver.SetPG(p,g);
    if (success != true) {
        System.out.println("P is not a safe prime");
        return;
    }


    String eSender;
    eSender = dhSender.createE(256);

    //  receiver does the same:

    String ereceiver;
    ereceiver = dhreceiver.createE(256);

   

    String kSender;
    String kreceiver;

  
    kSender = dhSender.findK(ereceiver);

    
    kreceiver = dhreceiver.findK(eSender);



  String ciphertext;

		//Scanner input=new Scanner(System.in);
System.out.println("-------------------------------------------------------------------");
		System.out.println("Enter plain text");
		ciphertext=input.nextLine();


System.out.println("-------------------------------------------------------------------");

   
    System.out.println("Sender's shared secret:");
    System.out.println(kSender);
	text=kSender;



output.write(text);
output.close();

System.out.println("-------------------------------------------------------------------");

    System.out.println("receiver's shared secret (should be equal to Sender's)");
    System.out.println(kreceiver);

    CkCrypt2 crypt = new CkCrypt2();
    success = crypt.UnlockComponent("Anything for trial.");
    if (success != true) {
        System.out.println(crypt.lastErrorText());
        return;
    }

    crypt.put_EncodingMode("hex");
    crypt.put_HashAlgorithm("md5");

    String sessionKey;
    sessionKey = crypt.hashStringENC(kSender);

System.out.println("-------------------------------------------------------------------");

	System.out.println(" ");


    System.out.println("128-bit Session Key for sender and receiver is :");
    System.out.println(sessionKey);

  
    crypt.put_CryptAlgorithm("aes");
    crypt.put_KeyLength(128);
    crypt.put_CipherMode("cbc");

    
    String iv;
    iv = crypt.hashStringENC(sessionKey);


System.out.println("-------------------------------------------------------------------");

    System.out.println("Initialization Vector:");
    System.out.println(iv);

    crypt.SetEncodedKey(sessionKey,"hex");
    crypt.SetEncodedIV(iv,"hex");

	String cipher;
  
    crypt.put_EncodingMode("base64");

cipher=crypt.encryptStringENC(ciphertext);	



System.out.println("-------------------------------------------------------------------");

System.out.println("Encrypted form of plain Text");


 System.out.println(cipher);

System.out.println("-------------------------------------------------------------------");
System.out.println("Decrpt form of plaintext");


    String plainText;
    plainText = crypt.decryptStringENC(cipher);


    System.out.println(plainText);

}

catch(Exception e)
{
e.printStackTrace();
}


}
}




