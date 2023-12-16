FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .main ./main
COPY .tester ./tester
