# 基础镜像
FROM openjdk:8-jdk-slim

# 设置工作目录
WORKDIR /app

# 复制jar包到镜像中
COPY target/MGR.jar MGR.jar

# 暴露端口
EXPOSE 8080

# 启动容器时运行的命令
ENTRYPOINT ["java","-jar","MGR.jar"]
