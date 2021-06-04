Phải tự tạo DB cho dự án trước khi chạy
Dự án có tạo seeding khi run chương trình
Các API:

- Api tạo Road:

curl --location --request POST 'http://localhost:8081/nxp/v1/road/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "roadName":"Đường fvsasdabc",
    "townshipId":3,
    "description":"okkkkkkk",
    "status":2
}'

- Api filter

curl --location --request GET 'http://localhost:8081/nxp/v1/road/filter/Chưa/M' 

- Api tìm theo tên quận

curl --location --request GET 'http://localhost:8081/nxp/v1/town/getByName/ong'