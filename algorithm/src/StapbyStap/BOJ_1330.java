package algorithm.src.StapbyStap;
import java.util.*;
import java.io.*;
public class BOJ_1330 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a==b) System.out.println("==");
        else if(a<b) System.out.println("<");
        else if(a>b) System.out.println(">");
    }
}
