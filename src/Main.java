import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String []args) throws IOException{
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������n:");
		int n=input.nextInt();
		if(n<0 || n>100)
			System.out.println("�������������������ȷ����!");
		//System.out.println("201571030143");
		File writename = new File("result.txt"); // ���·�������û����Ҫ����һ���µ�result��
		 writename.createNewFile(); // �������ļ�
         BufferedWriter out = new BufferedWriter(new FileWriter(writename));
         out.write("201571030143\r\n"); // \r\n��Ϊ����
         
		for(int i=1;i<=n;i++)
		{
			int a=(int)(Math.random()*100);
			int b=(int)(Math.random()*100);
			int a1=(int)(Math.random()*100);
			int b1=(int)(Math.random()*100);
			int c=(int)(Math.random()*4);
			switch(c)
			{
			    case 0:
			    	while(true){
			    		a1= (int) (Math.random()*100 + 0);
			            b1= (int) (Math.random()*100 + 1);
			    		if(a1%b1==0)
			    		{
			    			 System.out.println(a+"+"+b+"+"+a1+"/"+b1+"=");
			    			 out.write(a+"+"+b+"+"+a1+"/"+b1+"="+(a+b+a1/b1)+"\r\n");
			    			 break;
			                 //count++;
			    		}
			    	}
			    	break;
			    case 1:
			    	if(a<b)
			    	{
			    		int temp=a;
			    		a=b;
			    		b=temp;
			    	}
			    	System.out.println("("+a+"-"+b+")"+"+"+a1+"*"+b1+"=");
			    	out.write("("+a+"-"+b+")"+"+"+a1+"*"+b1+"="+((a-b)+a1*b1)+"\r\n");
			    	break;
			    case 2:
			    	System.out.println(a + " * " + b+"+" +a1+"+ "+b1+" = ");
			    	out.write(a + " * " + b+"+" +a1+"+ "+b1+" = "+(a*b+a1+b1)+"\r\n");
			    	break;
			    case 3:
			    	while(true){
			    		a = (int) (Math.random()*100 + 0);
			            b = (int) (Math.random()*100 + 1);
			    		if(a%b==0)
			    		{
			    			if(a/b+a1>=b1)
			    			 System.out.println(a + " / " + b +"+"+ a1+"-"+b1+" = " );
			    			 out.write(a + " / " + b +"+"+ a1+"-"+b1+" = " +(a/b+a1-b1)+"\r\n");
			    			 break;
			                 //count++;
			    		}
			  
			    	}
			    	/*while(b==0)
			    	{
			    		b=1+(int)(Math.random()*a);
			    		if(a%b==0)
			    		{
			    			System.out.println(a+"/"+b+"="+(a/b));	
			    		}
			    	}
		    		System.out.println(a+"/"+b+"="+(a/b));
			    	break;*/
			    	}
			
				
	           
	           
	            
	            out.flush(); // �ѻ���������ѹ���ļ�
	            //out.close(); // ���ǵùر��ļ�
			
			}
		}
	
}