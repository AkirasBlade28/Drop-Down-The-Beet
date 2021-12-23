
/*>>TAKEN FROM CODEWARS.COM<<
 * Johnny is a farmer and he annually holds a beet farmers convention "Drop the beet".
Every year he takes photos of farmers handshaking. Johnny knows that no two farmers 
handshake more than once. He also knows that some of the possible handshake combinations may not happen.
However, Johnny would like to know the minimal amount of people that participated this year just by counting all the handshakes.
Help Johnny by writing a function, that takes the amount of handshakes and returns the minimal amount of people needed to perform
these handshakes (a pair of farmers handshake only once). 
7h
0-1// Johnny is the null'th ++ person for 0 handshakes
1-2// Johnny + some dude dropping the hc beets
2-3
3-3
4-4
5-4
6-4
7-5
(8-5
9-5
10-5) etc..
 */ 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	System.out.println(solution(7));
	}

	public static int solution (int handshake) {
		int a = 1;
		int b = 0;
		int people = 1;
		
		if(handshake<3) {
			for(int i = 0; i<handshake; ++i) {
				people = people + 1;
			}
			return people;
		}
		else if(handshake>=3) {
			people = 3;
			for(int i=3; i<=handshake; ++i) {
 	        if(a == b) {
 	        	++people;
 	        	++a;
 	        	b = b-a;
 	        }
 	        ++b;
 		}	
		return people;		
		}
		return 0;
 	}
}
