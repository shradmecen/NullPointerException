import java.io.*;

public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        String s = null;
        try
        {
            if (s.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}