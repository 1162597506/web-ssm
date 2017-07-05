package applicationTest;

import com.liuzhe.ssm.entity.Book;
import com.liuzhe.ssm.mapper.BookMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Alan on 2017/7/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
public class BookTest {

    @Autowired
    BookMapper mapper;

    @Test
    public void testBook(){
        mapper.insert(new Book(2,2,"liuzhe"));
    }

}
