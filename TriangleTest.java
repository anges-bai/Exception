import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/14 16:04
 * @Description:
 * 写一个方法void isTriangle(int a,int b,int c),判断三个参数是否能构成一个三角形，
 * 如果不能则抛出异常IllegalArgumentException，显示异常信息“a，b，c不能构成三角形”，
 * 如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个数，调用此方法，并捕获异常。
 */
public class Test3 {
    public void isTriangle(int a,int b,int c){
            try {
                if (a+b>c&&a+c>b&&b+c>a){
                    System.out.println("a,b,c能构成三角形");
                }
                else{
                throw new IllArguementException("a,b,c不能构成三角形");
                }
            }catch (IllArguementException e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        Test3 tt3=new Test3();
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        int b=s1.nextInt();
        int c=s1.nextInt();
        tt3.isTriangle(a,b,c);
    }
}
class IllArguementException extends Exception{
    public IllArguementException(String msg){
        super(msg);
    }
}
