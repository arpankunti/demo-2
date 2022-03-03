import java.util.Scanner;

public class ConstructorTest {
    int a,b;
    ConstructorTest(int x, int y){
        a=x;
        b=y;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
    }
    void add(){
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        ConstructorTest aa=new ConstructorTest(5,10);
        aa.input();
        aa.add();
    }
}
