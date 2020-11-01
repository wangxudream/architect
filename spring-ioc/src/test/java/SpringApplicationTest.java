import com.kataer.architect.springioc.FoodFactory;
import com.kataer.architect.springioc.SpringIOCApplication;
import com.kataer.architect.springioc.Student;
import com.kataer.architect.springioc.Teacher;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


/**
 * @ClassName SpringApplicationTest
 * @Description: TODO
 * @Author kataer
 * @Date 2020/11/1 13:38
 * @Version V1.0
 **/
@Slf4j
@SpringBootTest(classes = {SpringIOCApplication.class})
public class SpringApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * @return void
     * @Author kataer
     * @Description //TODO
     * @Date 13:52 2020/11/1
     * @Param []
     **/
    @Test
    public void test1() {
        Student st1 = applicationContext.getBean(Student.class);
        Student st2 = applicationContext.getBean(Student.class);
        log.info("stu1==stu2:{}", st1 == st2);
    }

    /**
     * @return void
     * @Author kataer
     * @Description //TODO
     * @Date 13:53 2020/11/1
     * @Param []
     **/
    @Test
    public void test2() {
        FoodFactory.Food food1 = applicationContext.getBean(FoodFactory.Food.class);
        FoodFactory.Food food2 = applicationContext.getBean(FoodFactory.Food.class);
        log.info("food1==food2:{}", food1 == food2);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            log.info("name:{}", beanDefinitionName);
        }
        //name:foodFactory
        //name:student
        //name:createFood 未使用别名前
    }

    /**
     * @return void
     * @Author kataer
     * @Description //TODO
     * @Date 20:54 2020/11/1
     * @Param []
     **/
    @Test
    public void test3() {
        Teacher teacher1 = applicationContext.getBean(Teacher.class);
        Teacher teacher2 = applicationContext.getBean(Teacher.class);
        log.info("teacher1==teacher2:{}", teacher1 == teacher2);
    }
}
