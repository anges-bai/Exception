/**
 * @Author: BaiMiao
 * @Date: 2019/12/7 16:05
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static String test(){
        try {
            System.out.println("tryBlock");
            return test1();
        }finally {
            System.out.println("finallyBlock");
        }
    }
    public static String test1(){
        System.out.println("statement");
        return "afterreturn";
    }
}
//输出顺序
//1.tryBlock
//2.statement  调用test1()函数先输出statement
//3.finallyBlock  finally块是一定要执行的块，在try块的return之前要执行
//4.afterreturn  test()函数调用所return得到的afterreturn
