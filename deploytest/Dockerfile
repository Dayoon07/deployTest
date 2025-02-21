# 베이스 이미지 설정
FROM openjdk:11

# 작업 디렉토리 설정
WORKDIR /app

# 현재 디렉토리의 내용을 컨테이너의 /app 디렉토리로 복사
COPY . /app

# Maven을 사용하여 프로젝트 빌드
RUN ./mvnw package

# 컨테이너가 시작될 때 실행할 명령어
CMD ["java", "-war", "target/your-app.jar"]
