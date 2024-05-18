Quarkus guide: https://quarkus.io/guides/rest-client-multipart
https://www.baeldung.com/resteasy-tutorial


Serverseitig

```
  mvn qurkus:dev
```

Clientseitig

```
  curl -v -X GET http://localhost:8091/rest/movies
  curl -v -X GET http://localhost:8091/rest/movies/getinfo
  curl -v -X POST http://localhost:8091/rest/movies/addmovie -H "Content-Type: application/json" -d "{\"imdbId\":\"tt0096895\",\"title\":\"Batman\"}"
  curl -v -X GET http://localhost:8091/rest/movies/listmovies
  curl -v -X GET http://localhost:8091/rest/movies/getinfo?imdbId=tt0096896 -H "Content-Type: application/json"
  curl -v -X DELETE http://localhost:8091/rest/movies/deletemovie?imdbId=tt0096895
```


# Produces Annotation

https://docs.oracle.com/cd/E19776-01/820-4867/ghrns/index.html
https://docs.oracle.com/cd/E19776-01/820-4867/index.html
https://docs.oracle.com/en/cloud/saas/warehouse-management/24b/owmre/optional-trailing-slashes.html#u30226251
