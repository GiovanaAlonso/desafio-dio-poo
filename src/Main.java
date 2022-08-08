import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGiovana = new Dev();
        devGiovana.setNome("Giovana");
        devGiovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Giovana:" + devGiovana.getConteudosInscritos());
        devGiovana.progredir();
        devGiovana.progredir();
        System.out.println("Aluno progrediu, parabéns!");
        System.out.println("Conteúdos Inscritos de Giovana:" + devGiovana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Giovana:" + devGiovana.getConteudosConcluidos());
        System.out.println("XP:" + devGiovana.calcularTotalXp());

        System.out.println("------------------------------------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Aluno progrediu, parabéns!");
        System.out.println("Conteúdos Inscritos de Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }
}
