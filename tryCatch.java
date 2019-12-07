/**
 * @Author: BaiMiao
 * @Date: 2019/12/7 16:08
 * @Description:
 */
public class tryCatch {
    public int test(){
        int div=10;
        int result=100;
        try {
            while (div>-1){
                div--;
                result=result+100/div;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("...");
            return -1;
        }
       // return result;
    }

    public static void main(String[] args) {
        tryCatch t1=new tryCatch();
        System.out.println(t1.test());
    }
}
//-1
