package Week1.day1;

public class IsPrime {

	public static void main(String[] args) {
        
		
	int n=3,rem=0;
	
	for(int i=2;i<n;i++) {
		if(n%i==0) {
	
			System.out.println("Not Prime");
			rem=1;
			break;
		}
	}
	if(rem==0){
	System.out.println("Prime");
	}
	
	}

}
