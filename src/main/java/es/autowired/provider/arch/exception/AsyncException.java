package es.autowired.provider.arch.exception;

public class AsyncException extends RuntimeException {
    private static final long serialVersionUID = -3319667002414187728L;

    private final Thread parentThread;
    private final Thread asyncThread;

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param exception    the detail message. The detail message is saved for
     *                     later retrieval by the {@link #getMessage()} method.
     * @param parentThread Parent of thread exception
     * @param asyncThread  Thread of exception
     */
    public AsyncException(Throwable exception,
                          Thread parentThread,
                          Thread asyncThread) {
        super(getMessage(exception.getMessage(), parentThread, asyncThread), exception);
        this.parentThread = parentThread;
        this.asyncThread = asyncThread;
    }

    /**
     * Gets a representative message from Buynet Response.
     *
     * @param message      Exception.
     * @param parentThread Parent of thread exception
     * @param asyncThread  Thread of exception
     * @return Formatted message.
     */
    private static String getMessage(String message, Thread parentThread, Thread asyncThread) {
        return message + " [Parent thread name: " +
                parentThread.getName() +
                ", Parent thread id: " +
                parentThread.getId() +
                ". Exception thread name: " +
                asyncThread.getName() +
                ", Exception thread id: " +
                asyncThread.getId() +
                "]";
    }

    public Thread getParentThread() {
        return parentThread;
    }

    public Thread getAsyncThread() {
        return asyncThread;
    }
}