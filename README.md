# JWT-AUTH
Java SpringBoot PostgreSQL Jwt Authenthication

1. First of all pull the image of postgresql
docker pull postgres    

2. Run the postgresqldb container
docker run -d \                                                            
  --name postgres-container \
  -e POSTGRES_DB=forsakenneondb \
  -e POSTGRES_USER=root \
  -e POSTGRES_PASSWORD=root \
  -p 5432:5432 \
  postgres

3. Via DBeaver add roles in postgresql table roles.
4. Run the SpringBoot auth microservice
5. Testing:
 
POST
http://localhost:8080/api/auth/signup
{
    "username": "name",
    "email": "name@example.com",
    "password": "1234",
    "role": ["admin"]
}

POST
http://localhost:8080/api/auth/signin
{
    "username": "name",
    "password": "1234"
}

GET (content for all)
http://localhost:8080/api/test/all

GET (admin board content)
http://localhost:8080/api/test/admin

Add Barear Access token from signin response.


