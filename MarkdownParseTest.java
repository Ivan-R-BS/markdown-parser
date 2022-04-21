import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import org.junit.*;

public class MarkdownParseTest
{
    @Test
    public void addition() 
    {
    assertEquals(2, 1 + 1);
    }
    @Test
    public void linktest() throws IOException
    {
        ArrayList<String> test1= new ArrayList<>();
        test1.add("https://something.com");
        test1.add("some-thing.html");
        String tss = "test-file.md";
        Path fileName = Path.of(tss);
        String content = Files.readString(fileName);
        assertEquals(test1,MarkdownParse.getLinks(content));
    }



}
