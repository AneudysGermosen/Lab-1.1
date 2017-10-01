        
public class ControlStructures {

public static void main(String[]args){ Prime();
}
 
public static void Prime() {
	int x=1;
	
	int counter=0;
	while(counter<=50) { 
		boolean prime = true;
		for(int y=2;y<=x/2;y++) 
			if(x % y == 0) {
	
			prime=false;
			break;
			}
			
			
		if (prime) {
		counter++;	
		System.out.println(x);
		}
		x++;
}
}
			
}


















	
	
	
	
	
