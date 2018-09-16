public class Program2 {
		 
		public static void main(String args[]) {
		int a = 89, b = 90;
		
		a = a ^ b; 
		b = a ^ b; 
		a = a ^ b; 
		 
		
		System.out.println( a);
		System.out.println( b);
		}
		}
