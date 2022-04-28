import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.*;
/**
 * This file is intended to test the functionalities of MarkDownParse.
 */
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinksForTestFile1() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("https://something.com",
        "some-page.html");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksForTestFile2() throws IOException {
        Path fileName = Path.of("testfile2.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("www.myspace.com",
        "www.facebook.com");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }
    @Test
    public void testGetLinksForTestFile3() throws IOException {
        Path fileName = Path.of("testfile3.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of("www.speedrunners.com",
        "www.google.com");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }

    @Test
    public void testGetLinksForTestFile4() throws IOException {
        Path fileName = Path.of("try-break.md");
        String content = Files.readString(fileName);
        List<String> expected = List.of(
            "https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        assertEquals(expected,MarkdownParse.getLinks(content));
    }
    @Test 
    public void testIfActualLink() throws IOException {
        Path fileName = Path.of("testfarlink.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }

    @Test 
    public void failingtest() throws IOException {
        Path fileName = Path.of("test-filepdf.md");
        String content = Files.readString(fileName);
        List<String> expected = new ArrayList<>();
        assertEquals(expected, MarkdownParse.getLinks(content));
    }
    
    
}