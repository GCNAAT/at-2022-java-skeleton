package cn.ianzhang.selenium;

import org.junit.jupiter.api.Test;

/**
 * @Author: Ian
 * @Date: 2022/11/19 10:18
 * @Description:
 */
public class QuizTest extends EdgeBase {
  @Test
  void registerTest() {
    driver.get("https://www.ianzhang.cn/temp/at/202212/index.html");
  }
}
