import java.io.IOException;
import java.nio.file.Files;

public class S30_CreateTempFolder {

    public static void main(String[] args) throws IOException {
        var temp = Files.createTempDirectory("airhacks");
        System.out.println(temp);
    }
}