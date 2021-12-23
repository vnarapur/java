package corejava;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Program5{
public static void main(String[] args)
{
String[] strArray = { "vijji", "sai", "vijaya", "Red", "Violet",  "pink" };



System.out.println(Arrays.stream(strArray).filter(Objects::nonNull).
map(s->s.charAt(0)).collect(Collectors.toList()));
}



}