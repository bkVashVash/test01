package 类.io文件输入输出;

import java.io.*;

public class WenJian {
    public static void main(String[] args) throws IOException {
        System.out.println("这是一个文件写入, 文件读取");
        writecc2();
        readecc();
    }

    static void writecc() throws IOException{
        PrintWriter out = new PrintWriter("2.txt","UTF-8");
        out.println("我喜欢你鲁鲁");
        out.println("夏莉22");
        out.close();
    }

    static void writecc2() {
        try{
            String content = "招客缦胡应，吴钩霜雪明";
            File file = new File("new.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }catch (IOException e){
            System.out.println("出现了写入错误");
        }
    }

    public static void readecc()  {
        try{
            BufferedReader br =
                    new BufferedReader(new FileReader("new.txt"));
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
