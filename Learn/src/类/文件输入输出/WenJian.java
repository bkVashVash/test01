package 类.文件输入输出;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class WenJian {
    public static void main(String[] args) throws IOException {
        System.out.println("这是一个文件读写");
        writecc();
        readecc();
    }

    static void writecc() throws IOException{
        PrintWriter out = new PrintWriter("2.txt","UTF-8");
        out.println("我喜欢你鲁鲁");
        out.println("夏莉22");
        out.close();
    }

    public static void readecc() throws IOException {
        System.out.println("这是一个读取方法");
        try{
            BufferedReader br =
                    new BufferedReader(new FileReader("2.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        }
        catch (IOException e){
            System.out.println("io 问题");
        }
    }
}
