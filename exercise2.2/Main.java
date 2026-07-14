class FileLogger {

    private boolean fileOpen = false;

    public void openFile() {
        if (fileOpen) {
            throw new IllegalStateException("File already open");
        }
        System.out.println("Opening log file...");
        fileOpen = true;
    }

    public void writeLine(String line) {
        if (!fileOpen) {
            throw new IllegalStateException("Cannot write - file not open");
        }
        System.out.println("LOG: " + line);
    }

    public void closeFile() {
        if (!fileOpen) {
            throw new IllegalStateException("File already closed");
        }
        System.out.println("Closing log file...");
        fileOpen = false;
    }
}

class ApplicationLogger {

    private FileLogger fileLogger = new FileLogger();

    public void logInfo(String message) {
        fileLogger.openFile();
        fileLogger.writeLine("[INFO] " + message);
        fileLogger.closeFile();
    }

    public void logError(String message) {
        fileLogger.openFile();
        fileLogger.writeLine("[ERROR] " + message);
        fileLogger.closeFile();
    }

}


public class Main {

    public static void main(String[] args) {

        FileLogger logger = new FileLogger();
        logger.openFile();
        logger.writeLine("message from the logger instance");
        logger.closeFile();


        ApplicationLogger appLogger = new ApplicationLogger();
        appLogger.logError("message from the logger instance");
        appLogger.logInfo("message from the logger instance");

    }
}

/*
What complexity does ApplicationLogger hide?

ApplicationLogger hides the fact that logging requires 3 steps in a specific order:
openFile() — must happen first
writeLine() — only works if file is open
closeFile() — must happen last

These 3 steps have strict rules and if you call them in the wrong order, the program crashes.
ApplicationLogger wraps all of this inside logInfo and logError so the caller just sends a message and the complexity is handled internally.
*/