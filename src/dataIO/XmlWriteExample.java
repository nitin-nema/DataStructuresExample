package dataIO;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XmlWriteExample {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Jane Doe");
        user.setAge(25);
        user.setEmail("jane.doe@example.com");

        try {
            File file = new File("user.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(user, file);
            System.out.println("XML written to file successfully.");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
