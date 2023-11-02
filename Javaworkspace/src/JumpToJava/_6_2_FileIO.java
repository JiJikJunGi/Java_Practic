package JumpToJava;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class _6_2_FileIO {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("out.txt");
//        for(int i=0; i<11; i++){
//            String data = i + "번째 줄입니다. /n/r";
//            fw.write(data);
//        }
//        fw.close();

//        PrintWriter pw = new PrintWriter("out.txt");
//        for (int i = 0; i < 11; i++) {
//            String data = i + "번째 줄입니다.";
//            System.out.println(data);
//            pw.println(data);
//        }
//        pw.close();
//
//        PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
//        for(int i=11; i<21; i++){
//            String data = i+"번째 줄입니다.";
//            pw2.println(data);
//            System.out.println(data);
//        }
//        pw2.close();

//        byte[] b = new byte[1024];
//        FileInputStream input = new FileInputStream("out.txt");
//        input.read(b);
//        System.out.println(new String(b)); // byte 배열을 문자열로 변경하여 출력
//        input.close();

        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        while(true){
            String line = br.readLine();
            if(line==null)break;
            System.out.println(line);
        }
        br.close();
    }
}
