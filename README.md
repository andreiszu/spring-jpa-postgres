# spring-jpa-postgres

Simple Spring Web application that connects to a PostgreSql database running in a Docker container

First create, setup and run the Docker container with the database and then start the application.

1. docker pull postgres
2. docker run -d --name dev-postgres -v ${HOME}/postgres-data/:/var/lib/postgresql/data -p 5432:5432 postgres