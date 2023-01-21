package lecture2;

import java.util.logging.*;

    public class program8 {
        public static void main(String[] args) {
        
            Logger logger = Logger.getLogger(program8.class.getName());
            logger.setLevel(Level.INFO);

            ConsoleHandler ch = new ConsoleHandler();
            logger.addHandler(ch);

            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter (sFormat);

            logger.log(Level.WARNING, "Тестовое логирование 1" );
            //logger.info("Тестовое логирование 2" );
    }
}