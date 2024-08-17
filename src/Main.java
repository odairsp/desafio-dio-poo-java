import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoPhp = new Curso("PHP", "Php essentials", 5);
        Curso cursoPython = new Curso("Python", "Python essentials", 12);
        Curso cursoVerilog = new Curso("Verilog", "Verilog essentials", 25);

        Mentoria php = new Mentoria("Introdução php", "Códigos básicos de php", LocalDate.now().minusDays(5));
        Mentoria cplusplus = new Mentoria("Introdução C++", "Códigos básicos de C++", LocalDate.now().plusDays(5));
        Mentoria verilog = new Mentoria("Introdução a Verilog", "Códigos básicos Verilog", LocalDate.now().plusWeeks(1));


        System.out.println(cursoPhp);
        System.out.println(cursoVerilog);
        System.out.println(cursoPython);
        System.out.println(php);
    }
}