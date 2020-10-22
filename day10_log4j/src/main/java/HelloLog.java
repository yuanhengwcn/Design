import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * @BelongsProject: Design
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-21 11:02
 */
public class HelloLog {

    Log log = LogFactory.getLog(HelloLog.class);

    @Test
    public void test1(){
        log.trace("hello trace");
        log.debug("hello debug");
        log.info("hello info");
        log.warn("hello warn");
        log.error("hello error");
        log.fatal("hello fatal");
    }
}
