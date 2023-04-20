package files;

import java.io.IOException;

public class FilesReadRunner {

	public static void main(String[] args) throws IOException {
		/* Path 지정, readAllLines or lines method using, Stream 지정 */
//		Path pathFileToRead = Paths.get("./resources/data.text");

		// 출력하기 위해서 Files.readAllLine 메서드 활용하는 방법.
//		List<String> readAllLines = Files.readAllLines(pathFileToRead);
//		readAllLines.forEach(System.out::println);

		System.out.println("\n두번째 방법");
		// line메서드로 읽는 방법
//		Predicate<? super String> predicate = line -> line.contains("A");
//		Function<? super String, ? extends String> mapper = String::toLowerCase;
//		Files.lines(pathFileToRead).filter(predicate).map(mapper).forEach(System.out::println);
	}
	/* Path 클래스를 통해 경로를 읽기 위한 클래스 생성 */
	// Files.list(Paths.get(".")).forEach(System.out::println);

	/* walk메서드는 재귀적으로 쓸 수 있음 */
	// Files.walk(currentDirectory, 2).forEach(System.out::println);

	/* find메서드는 특정 경로찾음 */
//	Path currentDirectory = Paths.get(".");
//	BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) -> String.valueOf(path).contains(".java");
//	Files.find(currentDirectory, 3, matcher).forEach(System.out::println);

}
