package io.quarkus.deployment;

import io.quarkus.deployment.builditem.FeatureBuildItem;

/**
 * Represents a feature provided by a core extension.
 *
 * @see FeatureBuildItem
 */
public enum Feature {

    AGROAL,
    AMAZON_LAMBDA,
    AZURE_FUNCTIONS,
    APICURIO_REGISTRY_AVRO,
    APICURIO_REGISTRY_JSON_SCHEMA,
    AWT,
    CACHE,
    CDI,
    COMPOSE,
    CONFIG_YAML,
    CONFLUENT_REGISTRY_AVRO,
    CONFLUENT_REGISTRY_JSON,
    ELASTICSEARCH_REST_CLIENT_COMMON,
    ELASTICSEARCH_REST_CLIENT,
    ELASTICSEARCH_REST_HIGH_LEVEL_CLIENT,
    ELASTICSEARCH_JAVA_CLIENT,
    FLYWAY,
    GRPC_CLIENT,
    GRPC_SERVER,
    HIBERNATE_ORM,
    HIBERNATE_ENVERS,
    HIBERNATE_ORM_PANACHE,
    HIBERNATE_ORM_PANACHE_KOTLIN,
    HIBERNATE_ORM_REST_DATA_PANACHE,
    HIBERNATE_REACTIVE,
    HIBERNATE_REACTIVE_PANACHE,
    HIBERNATE_REACTIVE_PANACHE_KOTLIN,
    HIBERNATE_REACTIVE_REST_DATA_PANACHE,
    HIBERNATE_SEARCH_ELASTICSEARCH,
    HIBERNATE_SEARCH_STANDALONE_ELASTICSEARCH,
    HIBERNATE_VALIDATOR,
    INFINISPAN_CLIENT,
    INFINISPAN_EMBEDDED,
    JDBC_DB2,
    JDBC_DERBY,
    JDBC_H2,
    JDBC_POSTGRESQL,
    JDBC_MARIADB,
    JDBC_MSSQL,
    JDBC_MYSQL,
    JDBC_ORACLE,
    JFR,
    KAFKA_CLIENT,
    KAFKA_STREAMS,
    KEYCLOAK_AUTHORIZATION,
    KOTLIN,
    KUBERNETES,
    KUBERNETES_CLIENT,
    LIQUIBASE,
    LIQUIBASE_MONGODB,
    LOGGING_GELF,
    MAILER,
    MICROMETER,
    MONGODB_CLIENT,
    MONGODB_PANACHE,
    MONGODB_PANACHE_KOTLIN,
    MONGODB_REST_DATA_PANACHE,
    MUTINY,
    NARAYANA_JTA,
    NARAYANA_LRA,
    NARAYANA_STM,
    NEO4J,
    OBSERVABILITY,
    OIDC,
    OIDC_CLIENT,
    OIDC_CLIENT_REGISTRATION,
    RESTEASY_CLIENT_OIDC_FILTER,
    REST_CLIENT_OIDC_FILTER,
    OIDC_CLIENT_GRAPHQL_CLIENT_INTEGRATION,
    RESTEASY_CLIENT_OIDC_TOKEN_PROPAGATION,
    REST_CLIENT_OIDC_TOKEN_PROPAGATION,
    OPENSHIFT_CLIENT,
    OPENTELEMETRY,
    OPENTELEMETRY_JAEGER_EXPORTER,
    OPENTELEMETRY_OTLP_EXPORTER,
    PICOCLI,
    QUARTZ,
    QUTE,
    REACTIVE_PG_CLIENT,
    REACTIVE_MYSQL_CLIENT,
    REACTIVE_MSSQL_CLIENT,
    REACTIVE_DB2_CLIENT,
    REACTIVE_ORACLE_CLIENT,
    REACTIVE_ROUTES,
    REDIS_CLIENT,
    RESTEASY,
    RESTEASY_JACKSON,
    RESTEASY_JAXB,
    RESTEASY_JSONB,
    RESTEASY_MULTIPART,
    RESTEASY_MUTINY,
    RESTEASY_QUTE,
    REST,
    REST_CSRF,
    REST_QUTE,
    REST_JSONB,
    REST_JAXB,
    REST_JACKSON,
    REST_KOTLIN_SERIALIZATION,
    REST_LINKS,
    RESTEASY_CLIENT,
    RESTEASY_CLIENT_JACKSON,
    RESTEASY_CLIENT_JAXB,
    RESTEASY_CLIENT_JSONB,
    RESTEASY_CLIENT_MUTINY,
    REST_CLIENT,
    REST_CLIENT_JACKSON,
    REST_CLIENT_JAXB,
    REST_CLIENT_JSONB,
    REST_CLIENT_KOTLIN_SERIALIZATION,
    SCALA,
    SCHEDULER,
    SECURITY,
    SECURITY_JDBC,
    SECURITY_LDAP,
    SECURITY_JPA,
    SECURITY_JPA_REACTIVE,
    SECURITY_PROPERTIES_FILE,
    SECURITY_OAUTH2,
    SECURITY_WEBAUTHN,
    SERVLET,
    SMALLRYE_CONTEXT_PROPAGATION,
    SMALLRYE_FAULT_TOLERANCE,
    SMALLRYE_HEALTH,
    SMALLRYE_JWT,
    SMALLRYE_METRICS,
    SMALLRYE_OPENAPI,
    MESSAGING,
    MESSAGING_KAFKA,
    MESSAGING_AMQP,
    MESSAGING_MQTT,
    MESSAGING_RABBITMQ,
    MESSAGING_PULSAR,
    SMALLRYE_REACTIVE_STREAMS_OPERATORS,
    SMALLRYE_REACTIVE_TYPE_CONVERTERS,
    SMALLRYE_GRAPHQL,
    SMALLRYE_GRAPHQL_CLIENT,
    SPRING_DI,
    SPRING_WEB,
    SPRING_DATA_JPA,
    SPRING_DATA_REST,
    SPRING_SECURITY,
    SPRING_BOOT_PROPERTIES,
    SPRING_CACHE,
    SPRING_CLOUD_CONFIG_CLIENT,
    SPRING_SCHEDULED,
    SWAGGER_UI,
    WEBSOCKETS,
    WEBSOCKETS_CLIENT,
    VAULT,
    VERTX,
    VERTX_GRAPHQL,
    WEB_DEPENDENCY_LOCATOR;

    public String getName() {
        return toString().toLowerCase().replace('_', '-');
    }

}
