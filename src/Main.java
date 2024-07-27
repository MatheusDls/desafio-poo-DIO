import java.awt.image.CropImageFilter;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso() ;
    curso1.setTitulo("Curso java");
    curso1.setDescricao("Descricao curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso() ;
    curso2.setTitulo("Curso js");
    curso2.setDescricao("Descricao curso js");
    curso2.setCargaHoraria(4);

//polimorfismo utilizado aqui!, tudo que tem "Conteudo" tem em curso
// mas nem tudo que tem em "Curso" tem em "Conteudo"!
    Conteudo conteudo = new Curso();

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria");
    mentoria.setDescricao("Descricao mentoria");
    mentoria.setData(LocalDate.now());

    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
    */

     Bootcamp bootcamp = new Bootcamp();
     bootcamp.setNome("Bootcamp java Developer");
     bootcamp.setDescricao("Descricao bootcamp java Developer");
     bootcamp.getConteudos().add(curso1);
     bootcamp.getConteudos().add(curso2);
     bootcamp.getConteudos().add(mentoria);

     Dev devLeonardo = new Dev();
     devLeonardo.setNome("Leonardo");
     devLeonardo.inscreverBootcamp(bootcamp);
     System.out.println("Conteudos Inscritos Leonardo" + devLeonardo.getConteudosInscritos());
     devLeonardo.progredir();
     System.out.println("-");
     System.out.println("Conteudos Inscritos Leonardo" + devLeonardo.getConteudosInscritos());
     System.out.println("Conteudos Concluidos Leonardo" + devLeonardo.getConteudosConcluidos());
     System.out.println("XP:" +devLeonardo.calcularTotalXp());

     System.out.println("----------");

     Dev devJoao = new Dev();
     devJoao.setNome("Joao");
     devJoao.inscreverBootcamp(bootcamp);
     System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
     devJoao.progredir();
     devJoao.progredir();
     devJoao.progredir();
     System.out.println("-");
     System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
     System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
     System.out.println("XP:" +devJoao.calcularTotalXp());
     //fim do programa!

    }
}