package collection1;
import java.io.*;
import java.util.*;
class student {
	int number ;
	String name;

	student(int n , String a){
		this.number=n;
		name=a;
	}}
class test12{

	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		int t=0,maxi=0;
		List <student> t1 = new ArrayList<>();
		System.out.println("enter name and marks");
		for (int i=0; i<=3;i++){
			String b=in.nextLine();
			int g=Integer.parseInt(in.nextLine());
			student x=new student(g,b);
			t1.add(x);

		}//mistake in lower logic 
		for (int i=0;i<=2;i++){
			if((t1.get(i).number)>(t1.get(i+1).number)){
				maxi=t1.get(i).number;
				t=i;
			}
			else{
				maxi=t1.get(i+1).number;
				t=i+1;			
			}
		}
		System.out.println(t1.get(t).name + " " + maxi);
	}}



