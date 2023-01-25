package SecondLargest;

public class A {
	public static void main(String[] args) {
		int x[]= {2,4,3,5,4,6,5,7,6,8,7,9};
		int largest_num=-x[0];
		int sec_largesrt=x[0];
		
		for(int i=0; i<x.length; i++) {
			if(x[i]>largest_num) {
				sec_largesrt=largest_num;
				
				largest_num=x[i];
				
			}else if(x[i]>sec_largesrt && x[i]!=largest_num) {
				sec_largesrt=x[i];
			}
		}
		System.out.println("second largest number"+sec_largesrt);
	}

	
}
