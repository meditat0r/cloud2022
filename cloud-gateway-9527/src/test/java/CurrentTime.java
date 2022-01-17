import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

/**
 * @Author meditat0r
 * @create 2022/1/17 10:12
 */
public class CurrentTime {

    /**
     * 获取当前时区的时间
     */
    @Test
    public void getCurrentTime(){
        System.out.println(ZonedDateTime.now());
    }
}
