# beer-service

* Simple SpringBoot application to play with RESTful CRUD operations.

## Build Application

```
mvn clean install
```

## Create a database in CloudFoundry

* Create MySQL database in PCF
```
cf create-service p-mysql 100mb-dev mysql-database
```

* Create MySQL database in PWS (free tier)
```
cf create-service cleardb spark mysql-database
```

* Create PostgreSQL database in PWS (free tier)
```
cf create-service elephantsql turtle postgresql-database
```

* Create SQL Server database in Azure 
```
cf create-service azure-sqldb basic sqlserver-database -c database.json
```

See https://github.com/Azure/meta-azure-service-broker/blob/master/examples/sqldb-example-config.json

## Deploy to CloudFoundry (or Pivotal Web Services)

* Push with `manifest.yml` file
```
cf push
```

* Push SQL Server version 
```
cf push -f manifest-sqlserver.yml
```

* Push MySQL version
```
cf push -f manifest-mysql.yml
```

* Push PostgreSQL version
```
cf push -f manifest-postgresql.yml
```

## Test the application

* CRUD repository:
  * http://localhost:8080/beers
  * http://beer-service.CLOUD_URL/beers
  * http://beer-service.cfapps.io/beers

* Inserting 100 `Beer` records
  * http://localhost:8080/init?count=100
  * http://beer-service.CLOUD_URL/init?count=100
  * http://beer-service.cfapps.io/init?count=100
