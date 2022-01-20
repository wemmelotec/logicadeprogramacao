package hackerhank.day26;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rascunho {
    public static void main(String[] args) {
        int dia = 10;
        int mes = 06;
        int ano = 2019;

        int diam = 9;
        int mesm = 06;
        int anom = 2021;

        LocalDate localDate = LocalDate.of(ano,mes,dia);
        LocalDate localDatem = LocalDate.of(anom,mesm,diam);

        long diferenca = ChronoUnit.DAYS.between(localDate,localDatem);
        System.out.println(diferenca);
    }
}
