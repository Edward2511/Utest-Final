package co.com.choucair.certification.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.util.List;
import static co.com.choucair.certification.userinterfases.Home.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Registro implements Task{
private String firstName;
private String lastName;
private String email;
private String password;
private String confirPassword;

    public Registro(String firstName, String lastName, String email, String password, String confirPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirPassword = confirPassword;
    }

    public static Registro RegistroUsuario(String firstName, String lastName, String email, String password, String confirPassword) {
            return Tasks.instrumented(Registro.class, firstName, lastName,  email, password, confirPassword);
        }
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BTN_JOINTODAY, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Click.on(BTN_JOINTODAY),
                    WaitUntil.the(INP_FIRSTNAME, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Enter.theValue(firstName).into(INP_FIRSTNAME),
                    WaitUntil.the(INP_LASTNAME, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Enter.theValue(lastName).into(INP_LASTNAME),
                    WaitUntil.the(INP_EMAIL, isCurrentlyVisible()).forNoMoreThan(90).seconds(),
                    Enter.theValue(email).into(INP_EMAIL),
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
                    Enter.theValue(password).into(PASSWORD1),
                    Enter.theValue(confirPassword).into(CONFIR_PASSWORD),
                    Click.on(PRIMER_CHECK),
                    Click.on(SEGUNDO_CHEC),
                    Click.on(TERCER_CHEC),
                    Click.on(BTN_COMPLETE)



            );
        }
    }


