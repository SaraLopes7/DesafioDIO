import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ConcurrentModificationException;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso de Java");
    curso1.setDescricao("Descrição do curso");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de magia");
    curso2.setDescricao("Descrição do curso");
    curso2.setCargaHoraria(7);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria de java");
    mentoria.setDescricao("Descrição do curso");
    mentoria.setData(LocalDate.now());

    /*    System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição do bootcamp");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devSara = new Dev();
    devSara.setNome("Sara");
    devSara.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos de Sara: " + devSara.getConteudosInscritos());
    devSara.progredir();
    devSara.progredir();
    System.out.println("---");
    System.out.println("Conteúdos ainda Inscritos de Sara: " + devSara.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos de Sara: " + devSara.getConteudosConcluidos());
    System.out.println("XP:" + devSara.calcularXp());

        System.out.println("-----------------------------------------------------------");

    Dev devHermione = new Dev();
    devHermione.setNome("Hermione");
    devHermione.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos de Hermione: " + devHermione.getConteudosInscritos());
    devHermione.progredir();
    devHermione.progredir();
    devHermione.progredir();
    System.out.println("---");
    System.out.println("Conteúdos ainda Inscritos de Hermione: " + devHermione.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos de Hermione: " + devHermione.getConteudosConcluidos());
    System.out.println("XP:" + devHermione.calcularXp());

    }
}
