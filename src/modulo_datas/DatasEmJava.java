package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		System.out.println("Dias " + date.getDate());
		System.out.println("Dia Atual em Milessegundos " + date.getTime());
		System.out.println("Ano " + (date.getYear()+1900));
		System.out.println("Mes " + date.getDate());
		System.out.println("Semana " + date.getDay());
		System.out.println("Horas " + date.getHours());
		System.out.println("Minutos " + date.getMinutes());
		System.out.println("Segundos " + date.getSeconds());
		
		
		/*------------simple date format-------------------\n*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data Atual Padrao e String: " + simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato de Banco de Dados: " + simpleDateFormat.format(date));
		
		System.out.println("Objeto date: " + simpleDateFormat.parse("1997-10-18 20:10.10"));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Objeto date: " + simpleDateFormat.parse("22/07/1993"));
		
		
	}

}
