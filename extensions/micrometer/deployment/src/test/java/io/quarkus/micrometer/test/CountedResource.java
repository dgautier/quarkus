package io.quarkus.micrometer.test;

import static java.util.concurrent.CompletableFuture.supplyAsync;

import java.util.concurrent.CompletableFuture;

import io.micrometer.core.aop.MeterTags;
import jakarta.enterprise.context.ApplicationScoped;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.aop.MeterTag;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class CountedResource {
    @Counted(value = "metric.none", recordFailuresOnly = true)
    public void onlyCountFailures() {
    }

    @Counted(value = "metric.all", extraTags = { "extra", "tag" })
    public void countAllInvocations(@MeterTag(key = "do_fail", resolver = TestValueResolver.class) boolean fail) {
        if (fail) {
            throw new NullPointerException("Failed on purpose");
        }
    }

    @Counted(description = "nice description")
    public void emptyMetricName(@MeterTag boolean fail) {
        if (fail) {
            throw new NullPointerException("Failed on purpose");
        }
    }

    @Counted(value = "multiple.meterTags", extraTags = { "extra", "tag" })
    public void multipleMeterTags(@MeterTags({
            @MeterTag(key = "do_fail", resolver = TestValueResolver.class),
            @MeterTag
    }) boolean fail) {
        if (fail) {
            throw new NullPointerException("Failed on purpose");
        }
    }

    @Counted(value = "async.none", recordFailuresOnly = true)
    public CompletableFuture<?> onlyCountAsyncFailures(GuardedResult guardedResult) {
        return supplyAsync(guardedResult::get);
    }

    @Counted(value = "async.all", extraTags = { "extra", "tag" })
    public CompletableFuture<?> countAllAsyncInvocations(GuardedResult guardedResult) {
        return supplyAsync(guardedResult::get);
    }

    @Counted
    public CompletableFuture<?> emptyAsyncMetricName(GuardedResult guardedResult) {
        return supplyAsync(guardedResult::get);
    }

    @Counted(value = "uni.none", recordFailuresOnly = true)
    public Uni<?> onlyCountUniFailures(GuardedResult guardedResult) {
        return Uni.createFrom().item(guardedResult::get);
    }

    @Counted(value = "uni.all", extraTags = { "extra", "tag" })
    public Uni<?> countAllUniInvocations(GuardedResult guardedResult) {
        return Uni.createFrom().item(guardedResult::get);
    }

    @Counted
    public Uni<?> emptyUniMetricName(GuardedResult guardedResult) {
        return Uni.createFrom().item(guardedResult::get);
    }

}
