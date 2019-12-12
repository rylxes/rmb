
<b>To test the application </b>


- client: rmbAPI </br>
- secret: AH7VNzl10054 </br>

- Non-admin username and password: john.doe and jwtpass
- Admin user: admin.admin and jwtpass



- LDAP 
- username and password: ben and benspassword
- Example of resource accessible to all authenticated users: [http://localhost:8080/api/public/cities](http://localhost:8080/api/public/cities) 
- Example of resource accessible to only an admin user: [http://localhost:8080/api/private/users](http://localhost:8080/api/private/users)

1. Generate an access token

    For this specific application, to generate an access token for the non-admin user john.doe, run:
    ```
    $ curl testjwtclientid:XY7kmzoNzl100@localhost:8080/oauth/token -d grant_type=password -d username=john.doe -d password=jwtpass
    ```
    You'll receive a response similar to below
    
    ```
         {
            "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM2MDI2NjksInVzZXJfbmFtZSI6ImFkbWluLmFkbWluIiwiYXV0aG9yaXRpZXMiOlsiU1RBTkRBUkRfVVNFUiIsIkFETUlOX1VTRVIiXSwianRpIjoiYzU0OTUwOWMtOGE2Ni00MmM4LTk4ZDQtZTIxOGMwMmQxYmFiIiwiY2xpZW50X2lkIjoidGVzdGp3dGNsaWVudGlkIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl19.hltbUwoJN9IQRLEHs_RnJS_MBaVMMzp0CjRB6paVGpY",
            "token_type": "bearer",
            "refresh_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZG1pbi5hZG1pbiIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJhdGkiOiJjNTQ5NTA5Yy04YTY2LTQyYzgtOThkNC1lMjE4YzAyZDFiYWIiLCJleHAiOjE1NDYxOTM3NjksImF1dGhvcml0aWVzIjpbIlNUQU5EQVJEX1VTRVIiLCJBRE1JTl9VU0VSIl0sImp0aSI6IjU4MTkzMTNmLTg0YTAtNGM1Mi05ZGNiLThiZWM1ZTcwNWI1NiIsImNsaWVudF9pZCI6InRlc3Rqd3RjbGllbnRpZCJ9.yvZmi5SyVmXpVEFwyE2H2lZ6VuP4ZMYQ8udnPtiWIIs",
            "expires_in": 899,
            "scope": "read write",
            "jti": "c549509c-8a66-42c8-98d4-e218c02d1bab"
        }
    
    ```
    
    Use the following command to validate an access token:
    
    ```
    $ curl testjwtclientid:XY7kmzoNzl100@localhost:8080/oauth/check_token -d 'token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NDM2MDI2NjksInVzZXJfbmFtZSI6ImFkbWluLmFkbWluIiwiYXV0aG9yaXRpZXMiOlsiU1RBTkRBUkRfVVNFUiIsIkFETUlOX1VTRVIiXSwianRpIjoiYzU0OTUwOWMtOGE2Ni00MmM4LTk4ZDQtZTIxOGMwMmQxYmFiIiwiY2xpZW50X2lkIjoidGVzdGp3dGNsaWVudGlkIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl19.hltbUwoJN9IQRLEHs_RnJS_MBaVMMzp0CjRB6paVGpY&undefined='    
    ```
    Use the following command to refresh token:
    
    ```
    $ curl -X POST testjwtclientid:XY7kmzoNzl100@localhost:8080/oauth/check_token -d 'grant_type=refresh_token&refresh_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJqb2huLmRvZSIsInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJhdGkiOiJkYmZiYjI5Mi00NjMyLTQ5ODEtYThjMi0xZjYxNGQ5MjgyY2QiLCJleHAiOjE1NDYxODk3NjcsImF1dGhvcml0aWVzIjpbIlNUQU5EQVJEX1VTRVIiXSwianRpIjoiZjdhZDNiYWMtOTViYy00ZTZhLTkzYTQtODg0NzQ0Y2M5ODc1IiwiY2xpZW50X2lkIjoidGVzdGp3dGNsaWVudGlkIn0.VD9AJeK6555CYk5DaKj7ik81c81C6gPypNhTlEs6bsY&undefined='
    ```
    
    



