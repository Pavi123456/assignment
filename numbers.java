import java.util.Scanner;
public class Numbers
    
 public static void main(String[] args) {
		String test = "1234";
		count(test);

	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		
		int num = 0;
		for(int i = 0; i < x.length(); i++){
			
			if(Character.isDigit(ch[i])){
				num ++ ;
			}		}
	
		
	
		System.out.println("number: " + num);
	
			}
}