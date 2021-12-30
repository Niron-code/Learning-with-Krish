import java.util.Scanner;

class Freddy{
		
	public static void main(String [] args) {
		
		double distance, bal_distance;
		int cycle;
		int hop, temp_hop;
		double time, temp_time;

		hop = 0;
		time = 0.0;

		System.out.print("Enter the Distance : ");
		Scanner sc = new Scanner(System.in);
		distance = sc.nextDouble();

		if(distance >0) {
			if(distance >= 1 && distance <9) {
				if(distance <= 5) {
					hop = 1;
					time = 0.0;
				}else {
					hop = 2;
					time = 1.0;
				} 
			} else {
				cycle = (int) distance / 9;
				temp_hop = cycle * 3;
				temp_time = cycle * 6.5;
				
				bal_distance = distance % 9;

				if(bal_distance < 5 && bal_distance > 0) {
					hop = temp_hop + 1;
					time = temp_time;
				}else if (bal_distance > 5) {
					hop = temp_hop + 2;
					time = temp_time + 1;
				}else if (bal_distance ==0) {
					hop = temp_hop;
					time = temp_time - 3.5;
				}
			}
		}else {
			hop = 0;
			time = 0.0;
		}
		System.out.println("Number of Hops are " + hop);
		System.out.println("Number of seconds for rest are " + time);
	}
}