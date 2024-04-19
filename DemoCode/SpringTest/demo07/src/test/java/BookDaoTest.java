import com.cjy.config.SpringConfig;
import com.cjy.dao.BookDao;
import com.cjy.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author cjy
 * @Date 2024/4/12 14:21
 * @Version 1.0
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookService bookService;

    @Test
    public void testBookDao() {
        bookDao.save();
        System.out.println("测试成功");
    }

    @Test
    public void testBookService() {
        bookService.save();
        System.out.println("测试成功");
    }
}
