package company;

import java.io.*;

public class ver {
    // boolean, byte, short, int, long, float, double, char
    public static void main(String[] args) throws IOException {

        // 12 12 12

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] partes = br.readLine().split("[.]");
        int x = Integer.parseInt(partes[0]);
        int y = Integer.parseInt(partes[1]);
        int z = Integer.parseInt(partes[2]);

        while (true){
            String n = br.readLine();
            if(n.equals("")){
                break;
            }else{
                bw.write("OK\n");
            }
        }
        bw.flush();
    }
}

