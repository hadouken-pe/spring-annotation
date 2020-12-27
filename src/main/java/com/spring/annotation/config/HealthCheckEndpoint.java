package com.spring.annotation.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.util.Assert;


@Configurable
@Endpoint(id = "healthCheck")
public class HealthCheckEndpoint {

    private final HealthEndpoint healthEndpoint;

    public HealthCheckEndpoint(HealthEndpoint healthEndpoint) {
        Assert.notNull(healthEndpoint, "healthEndpoint must not be null");
        this.healthEndpoint = healthEndpoint;
    }

    @ReadOperation
    public Health health() {
        return Health.status(this.healthEndpoint.health().getStatus()).build();
    }
}