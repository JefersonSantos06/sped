package br.com.wmixvideo.sped.leiaute.blocoe;

import br.com.wmixvideo.sped.enums.SFIndicadorProcessoOrigem;
import br.com.wmixvideo.sped.util.SFReferencia;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class SFE116ObrigacoesICMSRecolherOperacoesPropriasTest {

    @Test
    public void geraTextoReferenteNovembro2008() {
        final SFE116ObrigacoesICMSRecolherOperacoesProprias linha = new SFE116ObrigacoesICMSRecolherOperacoesProprias()
                .setReferencia(SFReferencia.of(2008, Month.NOVEMBER))
                .setCodigo("000")
                .setCodigoReceita("1449")
                .setValor(new BigDecimal("279062.69"))
                .setDataVencimento(LocalDate.of(2008, Month.DECEMBER, 10))
                .setIndicadorProcessoOrigem(SFIndicadorProcessoOrigem.SEFAZ);

        Assert.assertEquals("|E116|000|279062,69|10122008|1449||0|||112008|", linha.toString());
    }

    @Test
    public void geraTextoReferenteJaneiro2013() {
        final SFE116ObrigacoesICMSRecolherOperacoesProprias linha = new SFE116ObrigacoesICMSRecolherOperacoesProprias()
                .setReferencia(SFReferencia.of(2013, Month.JANUARY))
                .setCodigo("000")
                .setCodigoReceita("144910014")
                .setValor(new BigDecimal("655580.89"))
                .setDataVencimento(LocalDate.of(2013, Month.FEBRUARY, 10))
                .setIndicadorProcessoOrigem(SFIndicadorProcessoOrigem.SEFAZ);

        Assert.assertEquals("|E116|000|655580,89|10022013|144910014||0|||012013|", linha.toString());
    }

}