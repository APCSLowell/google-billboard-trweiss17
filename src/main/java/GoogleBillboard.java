

public class GoogleBillboard {
	public static String digits;
        public static double run;
        public static int g= 0;
        public static int count= 0;
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		setup();
	}
	
public static void setup()  
{            
  for(int i=0; i<e.length(); i++){
    digits = e.substring(i,i+10);
    run= Double.parseDouble(digits);
    if(isPrime(run)==true){
      System.out.println(run);
	//break; Dont need to break if you are already returning, creates an unreachable statement (bad
} 
  }
for(int i=0; i< e.length();i++){
  digits = e.substring(i, i+10);
  for(int k= 0; k<10; k++){
    count+=Integer.parseInt(digits.substring(k));
  }
  if(count==49){
    f++;
    if(f==5){
      //return "f(5)="+digits; you cant return a String in a void function
      break;
    }
  }else{
    count=0;
  }
}
}  
public static boolean isPrime(double dNum)  
{   
  if(num<2){
  return false;
  }
  for(int i=2; i<= Math.sqrt(num);i++){
    if(num%i==0){
    return false;
    }
  }
  return true;
}
}
   
