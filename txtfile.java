import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
public class Vegetables {
public static void main(String[] args) {
Scanner ip = new Scanner(System.in);
System.out.println("Enter the name of the file : ");
String b = ip.nextLine();
System.out.println("How many lines do u want to write? : ");
int t = ip.nextInt();
b = "C:\\Users\\Dell\\Downloads\\" + b + ".txt";
try {
File hi = new File(b);
if(hi.createNewFile()) {
	System.out.println("File name : " + hi.getName() + " has been created successfully ;)");
	FileWriter hie = new FileWriter(b);
	String a = ip.nextLine();
	for(int i=1 ; i<=t ; i++) {
	System.out.println("Enter the " + i + " line");
	 a = ip.nextLine();
	hie.write(a + "\n");
}
	System.out.println("successfully written to the file");
	hie.close();
}
else {
	System.out.println("File already exists");
}

} catch(IOException e) {
	System.out.println("Something went wrong ;(");
}

}}

