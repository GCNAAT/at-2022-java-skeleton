package cn.ianzhang.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @Author: Ian
 * @Date: 2022/11/19 10:17
 * @Description:
 */
class EdgeBase {
  WebDriver driver;

  @BeforeAll
  static void setupClass() {
    WebDriverManager.edgedriver().setup();
  }

  @BeforeEach
  void setupTest() {
    driver = new EdgeDriver();
  }

  @AfterEach
  void teardown() {
    driver.quit();
  }

}
