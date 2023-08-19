package co.com.choucair.certification.tasks;
import io.airlift.airline.Cli;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.bcel.generic.Select;

import static co.com.choucair.certification.userinterfases.Home.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Registro implements Task{




        public static Registro RegistroUsuario() {
            return Tasks.instrumented(Registro.class);
        }
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BTN_JOINTODAY, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(BTN_JOINTODAY),
                    WaitUntil.the(INP_FIRSTNAME, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Enter.theValue("Edward").into(INP_FIRSTNAME),
                    WaitUntil.the(INP_LASTNAME, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Enter.theValue("Rodriguez").into(INP_LASTNAME),
                    WaitUntil.the(INP_EMAIL, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Enter.theValue("edward.rodriguez-g@hotmail.com").into(INP_EMAIL),
                    WaitUntil.the(SELECT_BIRTMONTH, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(SELECT_BIRTMONTH),
                    WaitUntil.the(OPTION_BIRTMONTH, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(OPTION_BIRTMONTH),
                    WaitUntil.the(SELECT_BIRTHDAY, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(SELECT_BIRTHDAY),
                    WaitUntil.the(OPTION_BIRTHDAY, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(OPTION_BIRTHDAY),
                    WaitUntil.the(SELECT_BIRTHYEAR, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(SELECT_BIRTHYEAR),
                    WaitUntil.the(OPTION_BIRTHYEAR, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(OPTION_BIRTHYEAR),
                    WaitUntil.the(BTN_NEXT, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(BTN_NEXT),
                    WaitUntil.the(INP_CITY, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    WaitUntil.the(INP_ZIP, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    WaitUntil.the(INP_COUNTRY, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    WaitUntil.the(BTN_NEXT_2, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(BTN_NEXT_2),
                    WaitUntil.the(SELECT_COMPUTER, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    WaitUntil.the(SELECT_VERSION, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    WaitUntil.the(SELECT_IDIOMA, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(BTN_NEXT2),
                    WaitUntil.the(PASSWORD1, isVisible()).forNoMoreThan(90).seconds(),
                    Enter.theValue("E12345678e*").into(PASSWORD1),
                    Enter.theValue("E12345678e*").into(CONFIR_PASSWORD),
                    Click.on(PRIMER_CHECK),
                    Click.on(SEGUNDO_CHEC),
                    Click.on(TERCER_CHEC),
                    Click.on(BTN_COMPLETE)



            );
        }
    }


