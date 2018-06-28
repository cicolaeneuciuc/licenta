import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("E:\\licenta\\myfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println("the text");
            //more code
            out.println("more text");
            //more code
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}



System.out.print(((ASTId)jjtGetChild(0)).name + "=");
    jjtGetChild(1).draw();


    jjtGetChild(0).draw();
    System.out.print("+");
    jjtGetChild(1).draw();
    System.out.println(); 