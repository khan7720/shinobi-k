FROM openjdk:17

COPY *.jar /app.jar
#地址映射
CMD ["--server.port=8080"]
#对外暴露端口
EXPOSE 8080
#执行命令
ENTRYPOINT ["java","-jar","shinobi-k-0.0.1-SNAPSHOT.jar"]