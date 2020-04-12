package atguigu;

import com.atguigu.modules.app.utils.JwtUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JwtTest {
  @Resource private JwtUtils jwtUtils;

  @Test
  public void test() {
    String token = jwtUtils.generateToken(1);

    System.out.println(token);
  }
}
