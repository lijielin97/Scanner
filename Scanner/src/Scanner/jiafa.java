package Scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       Scanner s=new Scanner(System.in);
       System.out.println("请输入加数：");
       int a=s.nextInt();
       System.out.println("请输入另一个加数：");
       int b=s.nextInt();
       int sum=a+b;
       System.out.println("计算结果，和为："+sum);
	}

}
