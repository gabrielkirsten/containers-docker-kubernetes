# Considera como base a ultima versão da imagem do Debian
FROM debian:stretch 

# Executa os comandos do debian para atualizar o repositório
# do apt-get, atualizar os pacotes instalados e instalar o
# apache2, respectivamente.
RUN apt-get update && \  
    apt-get upgrade && \
    apt-get install -y apache2 

# Executa o apache todas as vezes que o container é iniciado
CMD ["apachectl", "-D", "FOREGROUND"]

# Expomos a porta 80 para poder acessar externamente 
EXPOSE 80
