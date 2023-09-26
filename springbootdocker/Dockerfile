FROM amazoncorretto:17
EXPOSE 8088
COPY target/*.war springbootdocker.war
ENTRYPOINT ["java","-jar","springbootdocker.war"]

#FROM 파일이 동작되는 기본환경 이미지
#EXPOSE 내부로 연결되는 포트
#COPY는 프로젝트에서 복사해서 사용될 아카이브 파일
#ENTRYPOINT는 컨테이너가 실행될 때 수행되어야 하는 명령어 전달
#VOLUME ["/var/www/html","/etc/httpd"]