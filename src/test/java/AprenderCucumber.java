import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        Assert.assertEquals(int1, contador);
    }

    Date dataEntrega = new Date();

    @Dado("que o pedido foi realizado dia {int}\\/{int}\\/{int}")
    public void que_o_pedido_foi_realizado_dia(Integer dia, Integer mes, Integer ano) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, dia);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.YEAR, ano);

        dataEntrega = cal.getTime();
    }

    @Quando("a entrega atrasar {int} dias")
    public void o_sistema_calcular_que_a_entrega_será_realizada_no_dia(Integer dia) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataEntrega);
        cal.add(Calendar.DAY_OF_MONTH, dia);

        dataEntrega = cal.getTime();
    }
    @Então("O pedido deve ser entregue na data {int}\\/{int}\\/{int}")
    public void o_pedido_deve_ser_entregue_na_data(Integer dia, Integer mes, Integer ano) {
        Date dataRealEntrega = new Date();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, dia);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.YEAR, ano);

        dataRealEntrega = cal.getTime();

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataRealEntregaFormatada = sdf.format(dataRealEntrega);
        String dataEntregaFormatada = sdf.format(dataEntrega);

        Assert.assertEquals(dataRealEntregaFormatada, dataEntregaFormatada);
    }
}
