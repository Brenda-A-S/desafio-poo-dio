import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //CURSOS
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);


        //MENTORIA
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        //BOOTCAMP E DEVS

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-------------");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluído Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------------");

        Dev devBrenda = new Dev();
        devBrenda.setNome("Brenda");
        devBrenda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Brenda: " + devBrenda.getConteudosInscritos());
        devBrenda.progredir();
        devBrenda.progredir();
        devBrenda.progredir();
        System.out.println("-------------");
        System.out.println("Conteúdos Inscritos Brenda: " + devBrenda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Brenda: " + devBrenda.getConteudosConcluidos());
        System.out.println("XP: " + devBrenda.calcularTotalXp());

    }
}