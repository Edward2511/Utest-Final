package co.com.choucair.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certification.userinterfases.Home.*;

public class RegistroQuestion implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        WaitUntil.the(TXT_MENSAJE, WebElementStateMatchers.isEnabled()).forNoMoreThan(20).seconds();
        return TXT_MENSAJE.resolveFor(actor).getText();
    }

    public static RegistroQuestion message(){
        return new RegistroQuestion();
    }
}