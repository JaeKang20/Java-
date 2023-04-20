package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		// files 클래스와 Path 클래스.
		Path currentDirectroy = Paths.get(".");
		Files.list(Paths.get(".")).forEach(System.out::println);
		/*------------ predicate를 활용한 walk메서드-------------*/
//		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
//		Files.walk(currentDirectroy, 4).filter(predicate).forEach(System.out::println);
		/*------------ matcher를 활용한 find메서드-------------*/

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attribute) -> String.valueOf(path).contains(".java");
		Files.find(currentDirectroy, 4, matcher).forEach(System.out::println);
		/*------------ matcher를 활용한 find메서드,속성을 어떻게 설정하냐에 따라 출력 값이 다르다.-------------*/
//		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
//		Files.find(currentDirectroy, 4, directoryMatcher).forEach(System.out::println);
		

	}

}
