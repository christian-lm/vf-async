package es.autowired.async;

import java.lang.reflect.Method;
import java.util.List;

/**
 * The API {@link AsyncExecutor} provides several features intended to execute methods in
 */
public interface AsyncExecutor {

    void executeAsync(final Thread parentThread, final Object o, final Method method, final Object... params);

    void executeAsync(final Thread parentThread, final Method method, final Object... params) throws NoSuchMethodException;

    void executeAsyncStatic(final Method method, final Object... params);

    void executeAsyncStatic(final String clazz, final String methodName, final List<Class> paramClass, final Object... params);

    void executeAsync(Integer retriesNumber, final Thread parentThread, final Object o, final Method method, final Object... params);

    void executeAsync(Integer retriesNumber,final Thread parentThread, final Method method, final Object... params) throws NoSuchMethodException;

    void executeAsyncStatic(Integer retriesNumber,final Method method, final Object... params);

    void executeAsyncStatic(Integer retriesNumber,final String clazz, final String methodName, final List<Class> paramClass, final Object... params);

}