import org.junit.jupiter.api.Test;
public class MainTest extends CoreTestCase{
   MathHelper Math = new MathHelper();
    @Test
    public void myFirstTest(){
        int a = Math.calc(5, 0, '=');

        System.out.print(a);
    }
}



