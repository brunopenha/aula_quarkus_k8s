# Quarkus with Kubernetes Example
This is a Quarkus example application deployed into Kubernetes.

# Kubernetes introduction:

## Concepts

https://kubernetes.io/docs/concepts/overview/#going-back-in-time

## Installing Minikube

https://minikube.sigs.k8s.io/docs/start/

## Docker images

https://hub.docker.com/

## Installing Java

https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

## Insomnia

https://insomnia.rest/download

# Quarkus introduction

## Create the project

https://code.quarkus.io/

* RESTEasy Reactive Jackson
* Hibernate Validator https://quarkus.io/guides/validation
* Minikube https://quarkus.io/guides/deploying-to-kubernetes

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/aula_quarkus_minikube-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- Minikube ([guide](https://quarkus.io/guides/kubernetes)): Generate Minikube resources from annotations
- Hibernate Validator ([guide](https://quarkus.io/guides/validation)): Validate object properties (field, getter) and method parameters for your beans (REST, CDI, Jakarta Persistence)

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)

