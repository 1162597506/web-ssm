package applicationTest;

import com.liuzhe.ssm.controller.BookController;
import com.liuzhe.ssm.entity.Book;
import com.liuzhe.ssm.service.BookService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;

/**
 * Created by Alan on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class ApplicationTest {

        private final Logger logger = Logger.getLogger(this.getClass());

        @Autowired
        BookService service;

        @Test
        public void testgetNewestDevelopment() {

            System.out.println(service.addBook(new Book(1,1,"liuzhe")));
        }

}
