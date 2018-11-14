package school.cesar.agile.unit.project;

import java.util.Collection;

public class EmailClient {

    private EmailService emailService;

    public void setEmailService(EmailService emailService){
        this.emailService = emailService;
    }

    public boolean isValidAddress(String emailAddress){
        // TODO: Implement the logic here!
        throw new UnsupportedOperationException();
    }

    public boolean isValidEmail(Email email){
        // TODO: Implement the logic here!
        throw new UnsupportedOperationException();
    }

    public Collection<Email> emailList(EmailAccount account){
        // TODO: Implement the logic here!
        throw new UnsupportedOperationException();
    }

    public void sendEmail(Email email){
        // TODO: Implement the logic here!
        throw new UnsupportedOperationException();
    }

    public boolean createAccount(EmailAccount account){
        // TODO: Implement the logic here!
        throw new UnsupportedOperationException();
    }
}
