###############################################################
# Estágio de build

# Utiliza a imagem do maven para fazer o estágio de build
FROM maven:3.6.1-jdk-11-slim as build-stage

# Cria um diretório para
RUN mkdir -p /usr/src/app
# Muda o diretório padrão de execução dos scripts para o diretório criado
WORKDIR /usr/src/app
# Adiciona os arquivos do projeto para dentro do Container
ADD . /usr/src/app
# Executa o maven com o goal de construção do projeto
RUN mvn install

###############################################################
# Estágio de produção

# Utiliza a imagem do Open JDK para
FROM openjdk:8 as production-stage

# Copia os arquivos construidos na etapa anteior para ser executados
COPY --from=build-stage /usr/src/app/target/test-api-*.jar test-api.jar
# Expõe a porta 8081
EXPOSE 8081
# Executa nossa aplicação
ENTRYPOINT ["java", "-jar", "/test-api.jar"]

