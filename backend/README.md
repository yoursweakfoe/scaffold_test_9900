docker run --name nacos -e MODE=standalone -p 9848:9848 -p 9849:9849 -p 8848:8848 -d nacos/nacos-server:v2.3.2

docker run --name postgres-quick -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e PGDATA=/var/lib/postgresql/data -v D:\Dev\Docker\postgresql\data:/var/lib/postgresql/data -p 5432:5432 -d postgres
mvn clean install
request->controller->service->mapper->mapper xml->db->entity->service->controller

Spring Cloud Alibaba
Nacos(service discovery,config center)
openfeign
spring gateway
seata
sentinel
loadbalancer
mybatis
mybatis-plus
postgresql
junit
druid