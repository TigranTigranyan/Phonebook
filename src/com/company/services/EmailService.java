package services;

import model.Email;
import model.User;

public class EmailService {

    public void addEmail(User user, Email email) {
        user.getEmails().add(email);
    }

    public String contactEmails(User user) {
        StringBuilder str = new StringBuilder();
        for (Email email : user.getEmails()) {
            str.append(email.getType()).append(" ").append(email.getEmail()).append("\n");
        }
        return str.toString();
    }

}
