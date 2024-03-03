# Reproducing Spring Cloud AWS Issue [#1003](https://github.com/awspring/spring-cloud-aws/issues/1003)

1. Start Localstack and create parameter in SSM

```console
$ localstack start
$ aws --endpoint-url=http://localhost:4566 --region=eu-west-1 ssm put-parameter --name /config/message --value value1
```

2. Run Spring Boot application.
3. Observe value in console
4. Update parameter in SSM
```console
$ aws --endpoint-url=http://localhost:4566 --region=eu-west-1 ssm put-parameter --name /config/message --value new-value
```
5. Observer new value in console