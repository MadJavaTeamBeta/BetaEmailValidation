package MadJavaBeta;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Student on 12/7/2015.
 */
public class EmailValidationBetaTest {

    @Test
    public void testIsEmailValidJson() throws Exception {

    }

    @Test
    public void testIsEmailValidHtml() throws Exception {

    }

    @Test
         public void testParseRegex() throws Exception {
        EmailValidationBeta validate = new EmailValidationBeta();
        Email email = new Email();

        email.setEmailAdress("EAlbee@madisoncollege.edu");
        email.setIsValid(validate.parseRegex(email.getEmailAdress()));

        assertEquals(email.getIsValid(), true);
    }

    @Test
    public void testParseRegex2() throws Exception {
        EmailValidationBeta validate = new EmailValidationBeta();
        Email email = new Email();

        email.setEmailAdress("EAlbee@madisoncollege");
        email.setIsValid(validate.parseRegex(email.getEmailAdress()));

        assertEquals(email.getIsValid(), false);
    }
}