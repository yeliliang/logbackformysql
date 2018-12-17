package top.kingisgod.logback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 本项目例子主要研究logback日志异步到数据库
 * @author kingisgod
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackApplication.class, args);
    }

}

