import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2019/12/14 15:40
 * @Description:
 * 接收用户输入分数信息，若分数在0-100之间，输出成绩。如果成绩不再该范围内，
 * 抛出异常信息，提示分数必须在0-100之间。
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        while (s1.hasNext()){
            int n=s1.nextInt();
                try {
                    if (n>0 && n<100){
                        System.out.println("成绩为："+n);
                    }else{
                        throw new IllegalGradeException("分数必须在0-100");
                    }

                }catch (IllegalGradeException e){
                    e.printStackTrace();
                }
        }

    }

}
class IllegalGradeException extends Exception{

    public IllegalGradeException(String msg){
        super(msg);
    }
}
