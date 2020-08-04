import com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.shape.Drawer;
import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSiute {
    @Test
    public void testDrawingWithCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        Assert.assertEquals("This is a circle", result);
    }
}
