import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LineParser {

    MessageManager manager;

    public LineParser(MessageManager manager) {
        this.manager = manager;
    }

    public void Parse(String filename) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader(filename));

        Set<String[]> lineSet = new HashSet<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arrayOfWords = line.split(" ");
            lineSet.add(arrayOfWords);
        }

        manager.shiftItEvent(lineSet);

    }

}
