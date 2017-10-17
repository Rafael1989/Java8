package java8;

import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("c11");
		palavras.add("a1111");
		palavras.add("b");
		Consumidor consumidor = new Consumidor();
		Comparador comparador = new Comparador();
		palavras.sort(comparador);
		palavras.forEach(consumidor);
	}
}
