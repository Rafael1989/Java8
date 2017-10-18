package java8;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("c11");
		palavras.add("a1111");
		palavras.add("b");
		palavras.sort(comparing(String::length));
		palavras.forEach(s -> System.out.println(s));
		new Thread(()->System.out.println("Executando um runnable")).start();
	}
}
