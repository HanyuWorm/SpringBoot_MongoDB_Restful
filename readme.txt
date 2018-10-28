Để tránh việc config file và folder cho file json thì em để string json đấy trong util cho dễ chạy .

Cài mongodb , Tạo schemma adcampaign rồi tạo table test4 để chạy .

config table trong AdCampaign.java của  entities  package.

Chạy file App.java trong package create data để tạo dữ liệu


Get All data : using url : 
http://localhost:8081/api/GET/all

Get data by ID or name :
http://localhost:8081/api/GET/id/{id}
like this : 
http://localhost:8081/api/GET/id/100000001

get by name : 
http://localhost:8081/api/GET/name/{name}
http://localhost:8081/api/GET/name/Test Ad 1