package es.autowired.async;

import java.lang.reflect.Method;

public interface AsyncExecutor {

    void executeAsyncNonStatic(Thread parentThread, Object o, Method method, Object... params);

    void executeAsyncNonStatic(Thread parentThread, Method method, Object... params);

}