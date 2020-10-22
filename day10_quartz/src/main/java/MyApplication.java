import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @BelongsProject: Design
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-21 17:55
 */
public class MyApplication {
    public static void main(String[] args) throws SchedulerException {

        //创建调度器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        //创建触发器
        //触发器用来编辑组，cron表达式
        CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1").withSchedule(CronScheduleBuilder.cronSchedule("* 37 20 * * ?")).build();

        //创建jobDetail
        //指明job
        JobDetail jobDetail = JobBuilder.newJob(HelloQuartz.class).withIdentity("job1", "group1").build();

        //调度器包含触发器以及jobDetail
        scheduler.scheduleJob(jobDetail,trigger);

        //开启调度器
        scheduler.start();
    }


}
