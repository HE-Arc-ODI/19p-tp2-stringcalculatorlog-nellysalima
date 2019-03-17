package ch.hearc.ig.odi.logger;

import org.apache.logging.log4j.*;

public class LogClass {

  private static final Logger LOGGER = LogManager.getLogger(LogClass.class);

  public static void 	info(CharSequence message){
   System.out.println("Logger information : " + message);
  }

  public static void 	warn(CharSequence message){
    System.out.println("\u001B[31m" + "Logger warning : " + message);
  }

  public static void 	fatal(CharSequence message){
    System.out.println("\u001B[33m" + "Logger fatal : " + message);
  }

}