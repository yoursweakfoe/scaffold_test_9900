docker run --name nacos-quick -e MODE=standalone -p 9848:9848 -p 9849:9849 -p 8848:8848 -d nacos/nacos-server:v2.3.2
docker run --name postgres-quick -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e PGDATA=/var/lib/postgresql/data -v /db/pg:/var/lib/postgresql/data -p 5432:5432 -d postgres
mvn clean install