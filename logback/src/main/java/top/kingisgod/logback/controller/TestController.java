package top.kingisgod.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanggj on 2018/12/17 15:41
 */
@Controller
public class TestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**验证logback异步到mysql
     * 访问地址：http://127.0.0.1:8080/test/logback
     * @ Author yanggj
     * @return
     */
    @RequestMapping("/test/logback")
    @ResponseBody
    public Map testLogBack(){
        Map retMap = new HashMap();
        logger.error("测试logback成功");
        retMap.put("msg","logback异步到数据库成功,请到数据库表logging_event中查看");
        return retMap;
    }
}
