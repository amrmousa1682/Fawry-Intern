package hss.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class Logger {
    private static Logger logger;
    private FileWriter logFile;
    private Logger() {
        try {
            System.out.println("log file created");
            File file = new File("logs.txt");
            file.createNewFile();
            logFile =new FileWriter(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null)
                    logger = new Logger();
            }
        }
        return logger;
    }

    public void LogSmoke() {
        try {
            System.out.println("log smoke");
            logFile.write(LocalTime.now() + ":smoke detection\n");
            logFile.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void LogMotion() {
        try {
            System.out.println("log motion");
            logFile.write(LocalTime.now() + ":motion detection\n");
            logFile.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
