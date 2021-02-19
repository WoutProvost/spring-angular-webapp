# spring-angular-webapp
A small example web application using a [Spring Boot](https://spring.io/projects/spring-boot) backend and an [Angular](https://angular.io/) frontend.

### Dependencies
```bash
sudo apt install default-jre default-jdk maven nodejs npm
sudo npm install -g @angular/cli
```

### Sources
```bash
git clone https://github.com/WoutProvost/spring-angular-webapp
```

### Building and running
```bash
cd spring-angular-webapp
cd spring
mvn spring-boot:run

cd angular
npm install
ng serve --open
```