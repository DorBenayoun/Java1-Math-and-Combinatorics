

public class EX1 {
	public static void main(String[] args) {
		
		
		//Alef - sum numerous digits to one 
		int num = MyConsole.readInt(" ");
		int sum = 0;

		//loop until the sum is smaller than 10
		while(num!=0 || sum>9) {
			if(num==0) {
				num = sum;
				sum = 0;
			}
				sum = sum+num%10;
				num = num/10;
		}	
		System.out.println(sum);
		
		
		//Bet - powering separate digit sum, resulting 4/1
		int num2 = MyConsole.readInt(" ");
		int sum2 = 0;
		
				//Loop conditions
				while(num2!=0 || sum2>4) {
					if (num2==0) {
						num2 = sum2;
						sum2 = 0;
					}
						//Digit powers
						sum2 = (sum2+(int)Math.pow(num2%10, 2));
						num2 = num2/10;
				}
				if(sum2==1) {
					System.out.println(true);
				}
					else {
						System.out.println(false);
					}
							
							//Gimel - deciding either palindrome is correct or not
							int num3 = MyConsole.readInt(" ");
					    	int temp = num3;
					    	int mod = 0;
					    	int mul = 0;
					    	//Technique - reversing the number to decide if its a palindrome
					    	while(num3!=0) {
					    		mod = num3%10;
					    		mul = mul*10+mod;
					    		num3 = num3/10;	
					    	}
					    		if (temp==mul) {
					    			System.out.println(true);
					    		}
					    			else {
					    				System.out.println(false);
					    			}
					    		
					    		//Dalet - Josephus problem
					    		int num4 = MyConsole.readInt(" ");
					    		int sum4 = 0;
					    		int sumexp = 0;
					    		int sum5 = 0;
					    		int win = 0;
					    		int winb = 0;
					    		
					    		//Numbers that are powers of the basis 2 resulting the winner
					    		if (num4>0) {
					    			sum4 = (int)Math.pow(2, num4);
					    			if (sum4%num4==0) {	
					    				win = 1;
					    				System.out.println(win);
					    			}
					    			//Numbers following the equation winner=2^i+n and 2n+1 is the final result of the winner
					    			else {
					    				for (int i = 1; i<num4 ; i++) {
					    					sumexp = (int)Math.pow(2, i);	
					    					if (sumexp<num4) {
					    						sum5 = num4%sumexp;
					    						winb = sum5*2+1;
					    					}
					    				}
					    			System.out.println(winb);
					    			}
					    		}
							
	}
}
