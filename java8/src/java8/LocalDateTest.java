package java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate outroDia = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(outroDia);
		
		Period periodo = Period.between(hoje, outroDia);
		System.out.println(periodo.getYears() + " anos " + periodo.getMonths() + " meses " + periodo.getDays() + " dias");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
	}
}
