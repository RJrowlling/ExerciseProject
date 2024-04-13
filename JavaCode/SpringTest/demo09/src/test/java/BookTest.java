import com.cjy.config.SpringConfig;
import com.cjy.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @Author cjy
 * @Date 2024/4/13 10:26
 * @Version 1.0
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testService() {
        bookService.save();

    }
}
