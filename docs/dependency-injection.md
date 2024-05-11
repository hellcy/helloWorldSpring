# Dependency Injection

## Types of injection
- Constructor Injection
  - recommended approach. Use this when  you have required dependencies (Your app can't work without it)
- Setter Injection
  - when dependencies are optional and your app has default logic without them.
  - 
## Demo Example
- Coach interface has 1 implementation: CricketCoach that will provide daily workouts
- The DemoController wants to use a Coach
  - Coach is a dependency of DemoController, we need to inject Coach into DemoController
- Behind the scenes what Spring framework does
```
  // create an instance of CricketCoach
  Coach coach = new CricketCoach(); 
  
  // create an instance of DemoController
  DemoController demoController = new DemoController(coach); 
```

## Component Scanning
- Spring scans Main Spring Boot Application class and all sub-packages underneath that