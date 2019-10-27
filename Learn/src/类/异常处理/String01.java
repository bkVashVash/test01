package 类.异常处理;

/**
 * @BelongsProject: test01
 * @BelongsPackage: 类.继承
 * @Author: bkvashvash
 * @CreateTime: 2019-10-19 10:47
 * @Description:
 */
public class String01 {
    public static void main(String[] args) {
        try {
            System.out.printf("%d永远喜欢%s","卡莲","夏莉");
        }catch (Exception e){
            // d != java.lang.String
            System.out.println(e.getMessage());
        }finally {
            System.out.println("cc:我也喜欢露露");
        }
    }
}
