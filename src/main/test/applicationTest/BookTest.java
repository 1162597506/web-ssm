package applicationTest;

import com.liuzhe.ssm.controller.BookController;
import com.liuzhe.ssm.entity.Book;
import com.liuzhe.ssm.mapper.BookMapper;
import com.liuzhe.ssm.service.BookService;
import com.liuzhe.ssm.service.LuceneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

/**
 * Created by Alan on 2017/7/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class BookTest {

    @Autowired
    BookService mapper;

    @Test
    public void testBook() throws IOException {
        System.out.println("kaishi------------------------------");

        List<Book> list = mapper.find("2");
        for (Book book : list){
            System.out.println(book.toString());
        }

        System.out.println("jieshu------------------------------");
    }



}
