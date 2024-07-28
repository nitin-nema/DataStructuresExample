package dataIO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlReadExample {
    public static void main(String[] args) {
        try {
            File file = new File("user.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            User user = (User) unmarshaller.unmarshal(file);
            System.out.println(user);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
