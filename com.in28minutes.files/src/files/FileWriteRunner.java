package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		/* Path 경로 지정, List<String> list.of 쓸 내용 지정,Files.write */
		Path fileWirtePath = Paths.get("./resources/files.text");
		/* Files Write */
		List<String> list = List.of("ABCDE FGHIJK", "Hello World!");
		Files.write(fileWirtePath, list);

		/* Files Read */
		Files.lines(fileWirtePath).forEach(System.out::println); // *fileReadPath로 변경해줄 필요가 있음
	}

}
