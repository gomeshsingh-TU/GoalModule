package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class OTPBasedLogin {
    public String loginGmailForOTP() throws InterruptedException {
        System.out.println("Checkpoint#2");
        //Separately Login in Gmail
        System.setProperty("webdriver.ie.driver", "src/test/resources/webdriver/windows/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        System.out.println("Checkpoint#3");
        driver.manage().window().maximize();
        driver.get("https://mail.google.com/");
        System.out.println("Checkpoint#4");
        Thread.sleep(2000);
        driver.findElement(By.xpath("h-c-header__nav-li-link")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("team.om@taskus.com");
        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password1234!");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        Thread.sleep(2000);
        //Check for OTP mail
        List<WebElement> unreademail = driver.findElements(By.className("zE"));
        System.out.println("Total No. of Unread Mails: " + unreademail.size());


        // real logic starts here
        for (int i = 0; i < unreademail.size(); i++) {
            System.out.println(unreademail.get(i).getText());
        }
        unreademail.get(0).click();
        Thread.sleep(3000);
        String str = new String(String.valueOf(driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tr[1]/td[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/b[1]"))));
        //Fetch OTP code from the mail

        return str;


    }

}
//
//    public class OTPBasedLogin {
//
//        public void check(String host, String storeType, String user,
//                                 String password)
//        {
//            try {
//
//                //create properties field
//                Properties properties = new Properties();
//
//                properties.put("mail.pop3.host", host);
//                properties.put("mail.pop3.port", "995");
//                properties.put("mail.pop3.starttls.enable", "true");
//                Session emailSession = Session.getDefaultInstance(properties);
//
//                //create the POP3 store object and connect with the pop server
//                Store store = emailSession.getStore("pop3s");
//
//                store.connect(host, user, password);
//
//                //create the folder object and open it
//                Folder emailFolder = store.getFolder("INBOX");
//                emailFolder.open(Folder.READ_ONLY);
//
//                // retrieve the messages from the folder in an array and print it
//                Message[] messages = emailFolder.getMessages();
//                System.out.println("messages.length---" + messages.length);
//
//                for (int i = 0, n = messages.length; i < n; i++) {
//                    Message message = messages[i];
//                    System.out.println("---------------------------------");
//                    System.out.println("Email Number " + (i + 1));
//                    System.out.println("Subject: " + message.getSubject());
//                    System.out.println("From: " + message.getFrom()[0]);
//                    System.out.println("Text: " + message.getContent().toString());
//
//                }
//
//                //close the store and folder objects
//                emailFolder.close(false);
//                store.close();
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        public void main(String[] args) {
//
//            String host = "pop.gmail.com";// change accordingly
//            String mailStoreType = "pop3";
//            String username = "team.om@taskus.com";// change accordingly
//            String password = "Password1234!";// change accordingly
//
//            check(host, mailStoreType, username, password);
//
//        }
//
//    }

