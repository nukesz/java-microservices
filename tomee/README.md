# Build

mvn clean package && docker build -t com.nukesz.microservices/tomee .

# RUN

docker rm -f tomee || true && docker run -d -p 8080:8080 -p 4848:4848 --name tomee com.nukesz.microservices/tomee
