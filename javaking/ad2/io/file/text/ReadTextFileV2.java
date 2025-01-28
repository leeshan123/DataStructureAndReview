package javaking.ad2.io.file.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReadTextFileV2 {

    private static final String PATH = "javaking/ad2/io/temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("== Write String ==");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        //파일에 쓰기
        Files.writeString(path, writeString, UTF_8);

        //파일에서 읽기


        //한 줄에 하나씩 가져오기(조금씩 천천히 가져옴)
        System.out.println("== Read String ==");
        Stream<String> lineStream = Files.lines(path, UTF_8);
        lineStream.forEach(line -> System.out.println(line));

        //한번에 다 가져오기(메모리에 따악~ 다올림)
//        List<String> lines = Files.readAllLines(path, UTF_8);
//        for (String line : lines) {
//            System.out.println(line);
//        }

    }

}
