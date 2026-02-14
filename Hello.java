//package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Hello
{
public static void main (String args[])
{
	System.out.println("Hello");
	// The name of the file to open.
    //String fileName = "C:\\salu\\File2.txt";
      
       String fileName = "C:\\Users\\admin\\Desktop\\Code\\File2.txt";
  


// This will reference one line at a time
    
   String line = null;

try {
// FileReader reads text files in the default encoding.

FileReader fileReader = new FileReader(fileName);

// Always wrap FileReader in BufferedReader.
BufferedReader bufferedReader = new BufferedReader(fileReader);
String orginalR1 = "",orginalR2 = "";
//String orginalR2 = "";
while((line = bufferedReader.readLine()) != null) 
{
	if(!line.trim().isEmpty()){
	String[] s=line.split(" ");
	if(s[0].startsWith("R1")){
		orginalR1=orginalR1.concat(s[14]);
	}
	if(s[0].startsWith("R2")){
		orginalR2=orginalR2.concat(s[14]);
	}
System.out.println(line);
	}
        }
System.out.println("*R1*"+orginalR1); 
System.out.println("*R2*"+orginalR2); 
char[] cArray = orginalR1.toCharArray();
char[] dArray = orginalR2.toCharArray();
// System.out.println("*R1*"+orginalR1); 
//   System.out.println("*R2*"+orginalR2); 
int i=0;
int c=1;
if(cArray.length==dArray.length){
for (;i<cArray.length;i++){
	if(cArray[i]!=dArray[i]){
		System.out.println(c +" "+cArray[i]+"-"+dArray[i]+":"+"("+(i+1)+")"); 	
c=c+1;
	}

            }
        }

// Always close files.
bufferedReader.close();			
    }
catch(FileNotFoundException ex) {
System.out.println(
"Unable to open file '" + fileName + "'");				
    }
catch(IOException ex) {
System.out.println(
"Error reading file '" + fileName + "'");					
// Or we could just do this: 
// ex.printStackTrace();
    }
	
}
}


