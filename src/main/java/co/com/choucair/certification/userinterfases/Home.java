package co.com.choucair.certification.userinterfases;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target BTN_JOINTODAY = Target.the("Boton de Registro Jointoday")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INP_FIRSTNAME = Target.the("Campo de primer nombre")
            .located(By.id("firstName"));

    public static final Target INP_LASTNAME = Target.the("Campo del apellido")
            .located(By.id("lastName"));

    public static final Target INP_EMAIL = Target.the("Campo de email")
            .located(By.id("email"));

    public static final Target SELECT_BIRTMONTH = Target.the("seleccionar mes")
            .located(By.id("birthMonth"));

    public static final Target OPTION_BIRTMONTH = Target.the("campo de mes")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select/option[12]"));
    public static final Target SELECT_BIRTHDAY= Target.the("seleccionar dia")
            .located(By.id("birthDay"));

    public static final Target OPTION_BIRTHDAY = Target.the("campo de dia")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select/option[26]"));


    public static final Target SELECT_BIRTHYEAR= Target.the("seleccionar dia")
            .located(By.id("birthYear"));

    public static final Target OPTION_BIRTHYEAR = Target.the("campo de dia")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/option[7]"));

    public static final Target BTN_NEXT = Target.the("Boton de siguente")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INP_CITY = Target.the("campo de ciudad")
            .located(By.id("city"));

    public static final Target INP_ZIP = Target.the("campo de codigo postal")
            .located(By.id("zip"));

    public static final Target INP_COUNTRY = Target.the("campo de codigo postal")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

    public static final Target BTN_NEXT_2 = Target.the("Boton de siguente")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target SELECT_COMPUTER = Target.the("seleccionar so")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span"));

    public static final Target SELECT_VERSION = Target.the("seleccionar version")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_IDIOMA = Target.the("seleccionar idioma")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span"));


    public static final Target INP_MOVIL= Target.the("seleccionar movil")
            .located(By.xpath("//div[text()='Audiovox']"));

    public static final Target BTN_NEXT2= Target.the("siguiente Pantallana")
            .located(By.xpath("//a[@aria-label='Next - final step']"));

    public static final Target PASSWORD1= Target.the("password1")
            .located(By.xpath("//input[@type='password']"));

    public static final Target CONFIR_PASSWORD= Target.the("confirmar password")
            .located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target PRIMER_CHECK= Target.the("confirmar password")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target SEGUNDO_CHEC= Target.the("confirmar password")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target TERCER_CHEC= Target.the("confirmar password")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target BTN_COMPLETE= Target.the("confirmar password")
            .located(By.xpath("//a[@aria-label='Complete Setup']"));




}
