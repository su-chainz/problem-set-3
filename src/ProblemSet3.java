/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();

		
	}
		
	public void dateFashion(int you, int date) {
		if (you >= 8 || date >= 8) {
			if (you <= 2 || date <= 2) {
				System.out.println("NO.");
			} else {
				System.out.println("YES.");
			}
		} else if (you <= 2 || date <= 2) {
			System.out.println("NO.");
		} else {
			System.out.println("MAYBE.");
		}
	}
	
	public void fizzString(String str) {
		int count = str.length() - 1;
		char last = str.charAt(count);
		if (str.charAt(0) == 'f' && last == 'b') {
			System.out.println("FIZZBUZZ.");
		} else if (last == 'b') {
			System.out.println("BUZZ.");
		} else if (str.charAt(0) == 'f') {
			System.out.println("FIZZ.");
		} else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if (isSummer == true) {
			if (temp >= 60 && temp <= 100) {
				System.out.println("YES.");
			} else {
				System.out.println("NO.");
			}
		} else {
			if (temp >= 60 && temp <= 90) {
				System.out.println("YES.");
			} else {
				System.out.println("NO.");
			}
		}
	}
	
	public void fizzStringAgain(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("FIZZBUZZ!");
		} else if (n % 3 == 0) {
			System.out.println("FIZZ!");
		} else if (n % 5 == 0) {
			System.out.println("BUZZ!");
		} else {
			System.out.println(n + "!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		while (big > 0 && goal > 4) {
			big = big - 1;
			goal = goal - 5;
		}
		
		while (small > 0 && goal > 0) {
			small = small - 1;
			goal = goal - 1;
		}
		
		if (goal == 0) {
			System.out.println("YES.");
		} else {
			System.out.println("NO.");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if (a != b && a != c && b!= c) {
			int sum = a + b + c;
			System.out.println(sum + ".");
		} else if (a == b && a != c) {
			System.out.println(c + ".");
		} else if (a == c && a != b) {
			System.out.println(b + ".");
		} else if (c == b && b != a) {
			System.out.println(a + ".");
		} else {
			System.out.println(0 + ".");
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if (a == 13) {
			System.out.println(0 + ".");
		} else if (b == 13) {
			System.out.println(a + ".");
		} else if (c == 13) {
			System.out.println(a+b + ".");
		} else {
			System.out.println(a+b+c + ".");
		}
	}
	
	public void factorialWithFor(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total = total * i;
		}
		System.out.println(total + ".");
	}
	
	public void factorialWithWhile(int n) {
		int total = 1;
		int i = 1;
		while (i <= n) {
			total = total * i;
			i++;
		}
		System.out.println(total + ".");
	}
	
	public void isPrime(int n) {
		
		boolean prime = false;
		for (int i = 2; i <= n/2; ++i) {
			if (n % i == 0) {
				prime = true;
				break;
			}
		}
		if (n == 0 || n == 1) {
			System.out.println("NOT PRIME.");
		} else if (prime == true) {
			System.out.println("NOT PRIME.");
		} else {
			System.out.println("PRIME.");
		}
	}
}