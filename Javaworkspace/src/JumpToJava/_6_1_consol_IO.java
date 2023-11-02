package JumpToJava;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class _6_1_consol_IO {
    public static void main(String[] args) throws IOException{
//        InputStream in = System.in;

//        int a;
//        a = in.read();
//        System.out.println(a);

//        byte[] a = new byte[3];
//        in.read(a);
//
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);

//        InputStreamReader reader = new InputStreamReader(in);
//        char[] a = new char[3];
//        reader.read(a);
//        System.out.println(a);

//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//
//        String a = br.readLine();
//        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        sc.close();


    }
}
