package io.quarkus.cache;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.enterprise.util.Nonbinding;
import jakarta.inject.Qualifier;

import io.quarkus.cache.runtime.UndefinedCacheKeyGenerator;
import io.smallrye.common.annotation.Experimental;

/**
 * This qualifier may be applied to injection points to instruct the container to inject a generated wrapper bean that
 * delegates all method invocations to the original bean but the return values of selected business methods are cached.
 * <p>
 * By default, all non-void non-static business methods are included. However, it is possible to exclude methods
 * whose names match one of the regular expressions defined by {@link #exclude()}.
 * <p>
 * The injected class must be either an interface or declare a no-args constructor.
 *
 * @see CacheResult
 */
@Experimental("This API is experimental and may change in the future")
@Qualifier
@Retention(RUNTIME)
@Target({ TYPE, FIELD, PARAMETER })
public @interface CachedResults {

    /**
     * Constant value for {@link #cacheName()} indicating that the name should be derived for each relevant business method.
     * <p>
     * The name consist of the binary name of the declaring class, the method name, and binary names of all parameters.
     */
    String DEFAULT = "<<default>>";

    /**
     * The cache name.
     * <p>
     * By default, the cache name is derived for each business method.
     *
     * @see CacheResult#cacheName()
     */
    String cacheName() default DEFAULT;

    /**
     * The timeout is used for all business methods.
     *
     * @see CacheResult#lockTimeout()
     */
    @Nonbinding
    long lockTimeout() default 0;

    /**
     * The generator is used for all business methods.
     *
     * @see CacheResult#keyGenerator()
     */
    @Nonbinding
    Class<? extends CacheKeyGenerator> keyGenerator() default UndefinedCacheKeyGenerator.class;

    /**
     * The regular expressions that are used to match the method names that should be excluded, i.e. the results should not be
     * cached.
     */
    @Nonbinding
    String[] exclude() default {};
}
