import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		int ch;
		int ele;
		Scanner sc=new Scanner(System.in);
		MyQueue q1=new MyQueue(5);
		do
		{
			System.out.println("1. Enqueue ");
			System.out.println("2. Dequeue ");
			System.out.println("3. Display ");
			System.out.println("0. Exit ");
			System.out.println("Enter Yout choice  ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Number ");
				ele=sc.nextInt();
				q1.enQueue(ele);break;
			case 2:
				ele=q1.deQueue();
				if(ele==-9999)
					System.out.println(" Queue Is Empty ");
				else
					System.out.println("Deleted Ele Is "+ele);
				break;
			case 3:
				q1.display();
				break;
			}
			
		}while(ch!=0);
		 
	}
}
