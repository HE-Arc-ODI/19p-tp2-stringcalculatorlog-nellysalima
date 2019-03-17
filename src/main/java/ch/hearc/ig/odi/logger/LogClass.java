package ch.hearc.ig.odi.logger;


import org.apache.logging.log4j.*;
public class LogClass {

  private static final Logger LOGGER = LogManager.getLogger(LogClass.class);

  public static void 	info(CharSequence message){}

  public static void 	warn(CharSequence message){}

  public static void 	fatal(CharSequence message){}

}