package string;

public class StringConcept {
	public static void main(String[] args) {
           String s1="Hello there";
           
           String s2="Hello there";
           String s3=s2;
           
           String s4=new String("Hello there");
           
           String s5=s4.intern();
           
           String prefix="Hello";
           String s6=prefix+" there";
           String s7=s6.intern();
           
           final String newPrefix="Hello";
           String s8=newPrefix+" there";
           
           System.out.println("s1==s2 => "+(s1==s2));//true
           System.out.println("s1==s3 => "+(s1==s3));//true
           System.out.println("s2==s3 => "+(s2==s3));//true 
           System.out.println("s1==s4 => "+(s1==s4));//false
           System.out.println("s1==s5 => "+(s1==s5));//true
           System.out.println("s1==s6 => "+(s1==s6));//false
           System.out.println("s1==s7 => "+(s1==s7));//true
           System.out.println("s1==s8 => "+(s1==s8));//true => if we define the variable as final 
           
	}
}
