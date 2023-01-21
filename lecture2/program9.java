package lecture2;

import java.util.logging.*;

    public class program9 {
        public static void main(String[] args) {
            Logger logger = Logger.getLogger(program9.class.getName());
            logger.setLevel(Level.INFO);

            ConsoleHandler ch = new ConsoleHandler();
            logger.addHandler(ch);

            //SimpleFormatter sFormat = new SimpleFormatter();
            XMLFormatter xml = new XMLFormatter();
            //ch.setFormatter(sFormat);
            ch.setFormatter(xml);
            
            logger.log(Level.WARNING, "Тестовое логирование");
            logger.info("Тестовое логирование");
        }
    }