# spring-boot-docker

cd spring-boot-docker
docker build -t spring-boot-docker . 
docker run -it -p 8080:8080 --name app spring-boot-docker
