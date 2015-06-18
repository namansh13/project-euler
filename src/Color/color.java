package Color;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class color
{
  public static void main(String[] args)
  {
    AnsiConsole.systemInstall();

    System.out.println(ansi().fg(RED).a("Hello World").reset());
    System.out.println("My Name is Raman");

    AnsiConsole.systemUninstall();
  }
}