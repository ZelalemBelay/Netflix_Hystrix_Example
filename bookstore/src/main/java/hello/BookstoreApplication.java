package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class BookstoreApplication {

  @RequestMapping(value = "/recommended")
  public String readingList(){
    return "List of Books to read: Book 1, Book 2, Book 3 ";
  }

  public static void main(String[] args) {
    SpringApplication.run(BookstoreApplication.class, args);
  }
}
