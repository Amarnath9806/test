package exam;
import java.util.Scanner;
public class marsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
				String s= "SOSSOSSOS";
	System.out.println("entermessage receive from mars");
		String s1= sc.nextLine();
	char[] ch = s.toCharArray();
	char[] ch1=	s1.toCharArray();
		
		for (int i = 0; i < s1.length(); i++) {
			if(ch1(i)=ch(i))
					{
				System.out.println("Same message received");
			}
			else(){
				System.out.println("error");
			}

		}	
		
	
	}

}

