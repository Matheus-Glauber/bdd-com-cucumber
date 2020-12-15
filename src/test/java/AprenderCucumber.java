import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class AprenderCucumber {
    @Dado("que criei o arquivo corretamente")
    public void que_criei_o_arquivo_corretamente() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Criado o arquivo!");
    }

    @Quando("executá-lo")
    public void executá_lo() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Então("a especificação deve finalizar com sucesso")
    public void a_especificação_deve_finalizar_com_sucesso() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    private Integer contador = 0;

    @Dado("que o contador é {int}")
    public void que_o_contador_é(Integer int1) {
        contador = int1;
    }

    @Quando("eu adicionar em {int}")
    public void eu_adicionar_em(Integer int1) {
        contador += int1;
    }
    @Então("o valor do contador será {int}")
    public void o_valor_do_contador_será(Integer int1) {
        Assert.assertEquals(contador, int1);
    }
}
