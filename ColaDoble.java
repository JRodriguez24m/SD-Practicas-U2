import java.awt.print.Printable;
import java.util.Scanner;
class ColaDoble{   
    public static void main(String[] args) {
        int in=0,ou=0, vla, m, mm;
    }

}

/**
 * Metodos
 */
public class Metodos {
    int [] queue=new int[5];

    public int push(int in, int ou, int val) {
        if(in!=ou){
            queue[ou]=val;
            in++;
            return in;
        }else{
            System.out.println("    COLA LLENA...");
            return in;
        }
    }

    public void Peek() {
        for (int i = 0; i < queue.length; i++) {
            System.out.print("  "+queue[i]);
        }
    }
}