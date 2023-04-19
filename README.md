# gRPC-web-with-React

Prerequisites:
1. protoc: 
https://grpc.io/docs/protoc-installation/
2. protoc-gen-grpc-java:
https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.40.1/
3. protoc-gen-grpc-web: 
https://github.com/grpc/grpc-web/releases

For grpc-app, change directory to proto folder,  and create ts files using
protoc ./MessageService.proto --js_out=import_style=commonjs:./src/output --grpc-web_out=import_style=typescript,mode=grpcwebtext:./src/output


GRPC-Server - java back-end
run maven build with goals 'clean install' to generate files



1. Setup envoy
run the docker-compose.yaml with
docker-compose up
2. Run java back-end GRPCServer
3. Run the grpc-app with 'npm start'







