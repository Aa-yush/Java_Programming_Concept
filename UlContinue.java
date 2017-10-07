
/* Program to understand "Concept of UnLabeled Continue Statement"  
*
*
*Continue Statement : The unlabeled form continues statement skips the remainder of iteration of the loop . It evaluates the Boolean expression that control the loop at the end.
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/public class UlContinue{
	public static void main(String[] args){
		for(int i=0;i<=10;i++){
			if(i%3==0){
				continue;
			}
		System.out.println(i);
		}
	}
}

/* OutPut:
1
2
4
5
7
8
10
*/