# Dependency Injection

## Types of injection
- Constructor Injection
  - recommended approach. Use this when  you have required dependencies (Your app can't work without it)
- Setter Injection
  - when dependencies are optional and your app has default logic without them.
- Field Injection (not recommended)
  - hard to unit test
  - inject by setting field values on your class directly using Java `reflection`
  
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

## Component Scanning and AutoWiring
- Spring scans Main Spring Boot Application class and all sub-packages underneath that
- When Spring wants to inject Coach implementation, it will scan for `@Component`
- When they find an implementation, it will inject it e.g. CricketCoach