package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("c11");
		palavras.add("a1111");
		palavras.add("b");
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.forEach(s -> System.out.println(s));
		new Thread(()->System.out.println("Executando um runnable")).start();
	}
}
