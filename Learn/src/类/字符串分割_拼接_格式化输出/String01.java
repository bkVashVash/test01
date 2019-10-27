package 类.字符串分割_拼接_格式化输出;

/**
 * @BelongsProject: test01
 * @BelongsPackage: 类.继承
 * @Author: bkvashvash
 * @CreateTime: 2019-10-19 10:47
 * @Description:
 */
public class String01 {
    public static void main(String[] args) {
        String cc = "鲁鲁修和红月卡莲";
        System.out.println(cc.charAt(3));
        System.out.println(cc.replace("卡莲","夏莉"));

        // 字符串分割
        cc = cc.substring(0,3) + "123";
        System.out.println(cc);

        // 字符串拼接
        String vv = String.join(" / ","夏莉","cc","卡莲");
        System.out.println(vv);

        // 格式化输出
        System.out.printf("%s永远喜欢%s","露露","夏莉");
    }
}
