package java8;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("c11");
		palavras.add("a1111");
		palavras.add("b");
		palavras.sort((s1,s2)-> Integer.compare(s1.length(), s2.length()));
		palavras.forEach(s -> System.out.println(s));
		new Thread(()->System.out.println("Executando um runnable")).start();
	}
}
