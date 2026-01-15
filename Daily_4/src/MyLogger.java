import java.time.LocalDateTime;
public class MyLogger {

    public void logInfo(String message) {
        System.out.println("[INFO] " + LocalDateTime.now() + ": " + message);
    }
    public void logWarning(String message) {
        System.out.println("[WARNING] " + LocalDateTime.now() + ": " + message);
    }
    public void logError(String message) {
        System.out.println("[ERROR] " + LocalDateTime.now() + ": " + message);
    }
    public void logCriticalError(String message) {
        System.out.println("[CRITICAL ERROR] " + LocalDateTime.now() + ": " + message);
    }
}
