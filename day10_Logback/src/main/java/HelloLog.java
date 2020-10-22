import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @BelongsProject: Design
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-21 13:30
 */
public class HelloLog {

    Logger log = LoggerFactory.getLogger(HelloLog.class);

    @Test
    public void test1(){
        System.out.println(log.getClass());
    }

}
