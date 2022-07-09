import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Appender;
import org.apache.log4j.PatternLayout;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class log4jExample{

   /* Get actual class name to be printed on */
   static Logger log = Logger.getLogger(log4jExample.class.getName());
   public static void main(String[] args)throws IOException,SQLException{
             // creates pattern layout
        PatternLayout layout = new PatternLayout();
        String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
        layout.setConversionPattern(conversionPattern);
 
 
        // creates file appender
        FileAppender fileAppender = new FileAppender();
        fileAppender.setFile("applog3.txt");
        fileAppender.setLayout(layout);
        fileAppender.activateOptions();
	  
	   log.debug("Hello this is a debug message");
      log.info("Hello this is an info message");
      log.error("Hellow");

      System.out.println("HELLO");

   }
}
