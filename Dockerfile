# 사용할 베이스 이미지 선택
FROM openjdk:17-jdk-slim

# 작업 디렉토리 설정
WORKDIR /app

# 그래들을 사용하여 애플리케이션 빌드
COPY hello-springBoot_t /app
RUN ./gradlew build

# 호스트의 JAR 파일을 컨테이너로 복사
COPY build/libs/*.jar app.jar

# 빌드된 JAR 파일 실행
CMD ["java", "-jar", "app.jar"]
