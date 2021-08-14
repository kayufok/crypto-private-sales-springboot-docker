# build docker image

docker build --tag=springboot:latest .

# run docker image

docker run -p 8080:8080 springboot:latest --network nginx-net --name crypto_private_sale_springboot

# Operaion

```bat
sudo docker container stop crypto_private_sale_springboot
sudo docker container start crypto_private_sale_springboot
sudo docker container rm crypto_private_sale_springboot
```