Quarkus guide: https://quarkus.io/guides/rest-client-multipart

Serverseitig
```
  mvn qurkus:dev
```

Clientseitig
```
  curl -X POST http://localhost:8080/client/multipart
```

```
curl -X POST http://localhost:8080/client/multipart
--7100b331-5962-43eb-abc8-5149b6f356aa
Content-Disposition: form-data; name="file"
Content-Type: application/octet-stream

HELLO WORLD
--7100b331-5962-43eb-abc8-5149b6f356aa
Content-Disposition: form-data; name="fileName"
Content-Type: text/plain

greeting.txt
--7100b331-5962-43eb-abc8-5149b6f356aa--
```

