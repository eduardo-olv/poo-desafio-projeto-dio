import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " +devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " +devJoao.getConteudosConcluidos());
        System.out.println(devJoao.contador());

        System.out.println("------------------------");

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Eduardo: " +devEduardo.getConteudosInscritos());

        devEduardo.progredir();
        devEduardo.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos Eduardo: " +devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Eduardo: " +devEduardo.getConteudosConcluidos());
        System.out.println("XP: " + devEduardo.calcularTotalXP());
        System.out.println(devEduardo.contador());

        System.out.println("------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " +devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("-");
        System.out.println("Conteúdos inscritos Camila: " +devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " +devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());
        System.out.println(devCamila.contador());
    }
}
