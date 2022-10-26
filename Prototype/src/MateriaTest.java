
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Materia aluno = new Materia("DRH-33",
                "Aprenderemos um pouco de tudo",
                "Dia x P1, Dia y P2, Dia z P3");

        Materia alunoClone = aluno.clone();
        alunoClone.setCodigo("DRH-34");
        alunoClone.setEmenta("Aprenderemos muito de nada");

        assertEquals("Materia{\n" +
                "Codigo: DRH-33\n" +
                "Ementa: Aprenderemos um pouco de tudo\n" +
                "Calendario: Dia x P1, Dia y P2, Dia z P3\n" +
                "}", aluno.toString());

        assertEquals("Materia{\n"+
            "Codigo: DRH-34\n"+
            "Ementa: Aprenderemos muito de nada\n"+
            "Calendario: Dia x P1, Dia y P2, Dia z P3\n"+
        "}", alunoClone.toString());
    }
}