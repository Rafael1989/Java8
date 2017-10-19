package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CursoTest {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("a", 45));
		cursos.add(new Curso("b", 200));
		cursos.add(new Curso("c", 3));
		cursos.add(new Curso("d", 53));
		
		//cursos.stream().filter(c -> c.getAlunos() > 50).map(Curso::getNome).forEach(System.out::println);
		cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();
		cursos.stream().mapToDouble(Curso::getAlunos).average();
		
//		cursos.forEach(c -> System.out.println(c.getAlunos()));
	}
}
