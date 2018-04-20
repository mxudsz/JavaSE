import org.junit.Test;

public class TestChar01 {
    @Test
    public void testChar(){
        //char can stoe any unicode;
        char char01='顾';
        System.out.println(char01);
        System.out.println((int) char01);
        System.out.println(char01+98);
    }
}
