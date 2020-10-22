import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @BelongsProject: Design
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-21 17:51
 */
public class HelloQuartz implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDetail jobDetail = context.getJobDetail();
        String name = jobDetail.getKey().getName();
        String group = jobDetail.getKey().getGroup();

        System.out.println(new Date() + ", name:" + name + ", group" + group);
    }
}
