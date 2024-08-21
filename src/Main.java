import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoPhp = new Curso("PHP", "Php essentials", 5);
        Curso cursoPython = new Curso("Python", "Python essentials", 12);
        Curso cursoVerilog = new Curso("Verilog", "Verilog essentials", 25);
        Mentoria php = new Mentoria("Introdução php", "Códigos básicos de php", LocalDate.now().minusDays(5));
        Mentoria phpPoo = new Mentoria("Poo php", "Aplicando Poo em php", LocalDate.now().minusDays(10));
        Mentoria python = new Mentoria("Introdução Python", "Códigos básicos de Python", LocalDate.now().plusDays(5));
        Mentoria verilog = new Mentoria("Introdução a Verilog", "Códigos básicos Verilog", LocalDate.now().plusWeeks(1));
        Mentoria verilogAplicado = new Mentoria("Aplicando Verilog", "Aplicando Verilog - Mão na Massa", LocalDate.now().plusWeeks(1));

        Bootcamp pythonBootcamp = new Bootcamp("Python Bootcamp","Descrição Bootcamp python");
        pythonBootcamp.addConteudo(cursoPython);
        pythonBootcamp.addConteudo(python);

        Bootcamp phpBootcamp = new Bootcamp("PHP Bootcamp","Descrição Bootcamp php");
        phpBootcamp.addConteudo(cursoPhp);
        phpBootcamp.addConteudo(php);
        phpBootcamp.addConteudo(phpPoo);

        Bootcamp verilogBootcamp = new Bootcamp("VERILOG Bootcamp","Descrição Bootcamp verilog");
        verilogBootcamp.getConteudos().add(cursoVerilog);
        verilogBootcamp.getConteudos().add(verilog);
        verilogBootcamp.getConteudos().add(verilogAplicado);

        Dev odair = new Dev();
        odair.setNome("Odair");

        Dev simone = new Dev();
        simone.setNome("Simone");
        simone.inscreverBootcamp(verilogBootcamp);

        System.out.println(simone);

    }
}