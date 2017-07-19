drools
======

Spring boot drools demo app using version 7.0.0.Final

## How to run

```
mvn spring-boot:run 
```
POST Request :

http://localhost:8080/policy/check

{
    "driver": {
        "name": "Mr XXX",
        "age": 30,
        "priorClaims": 0,
        "locationRiskProfile": "HIGH"
    },
    "policy": {
        "type": "COMPREHENSIVE",
        "approved": false,
        "discountPercent": 0,
        "basePrice": 0
    }
}
