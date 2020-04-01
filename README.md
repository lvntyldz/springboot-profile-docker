Simple springboot application passing  profile to docker container as parameter

## Download(Pull)
```
git pull https://github.com/lvntyldz/springboot-profile-docker
```

## build images
```
$ docker build -t springboot-image .
```

## run as container
```
$ docker run --name springboot-container -p 8085:8085   -d springboot-image
```

OR

## pass springboot profile as parameter(uppercase)
```
$ docker run --name springboot-container -p 8085:8085  -e "SPRING_PROFILES_ACTIVE=test"    -d springboot-image
```


### Visit below URLS:
<br/>helloworld endpoint : http://localhost:8085/get-info
<br/>get active profile  :  http://localhost:8085/get-info/active-profile
<br/>get default profile : http://localhost:8085/get-info/default-profile
