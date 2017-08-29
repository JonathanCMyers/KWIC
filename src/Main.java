import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        MessageManager manager = new MessageManager();

        LineParser lineParser = new LineParser(manager);
        Shifter shifter = new Shifter(manager);

        lineParser.Parse("input.txt");


    }
}
