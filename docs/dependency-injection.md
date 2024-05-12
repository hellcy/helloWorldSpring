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

## Qualifier annotation
- tell Spring which implementation to use when there are multiple available
- Qualifier name is the name of the implementation class, except for the first character is lowercase

## Primary annotation
- when you have multiple implementations, `@Primary` is the default implementation that will be used.
- No need to use the `@Qualifier` annotation when we have `@Primary`.
- `@Qualifier` has higher priority and will override `@Primary`

## Lazy Initialization
- by default, all components are created when app starts
- we can specify lazy initialization using `@Lazy` before class so it will only be initialized when
  - it's needed for dependency injection
  - it's explicitly requested
- we can also set for all components in app properties file
  ```
  spring:
    main:
      lazy-initialization: true
  ```
  
# Bean Scopes
- Scopes are lifecycle about a bean
- Default scope for a bean is Singleton

## What is a Singleton?
- Spring container creates only one instance of the bean, by default
- it's cached in memory
- All dependency injection for the bean will reference to the `SAME` bean
- We can add `@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)` to ask Spring to create a new instance every time we need this dependency

## Bean Lifecycle methods
- You can add custom code during bean initialization/destruction
- add `@PostConstruct` or `@PreDestroy` on a method