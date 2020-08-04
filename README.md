

#### 1 spring: @Configuration(@ComponentScan, @Bean), @Component, @Service, @Repository

#### 2 spring app.properties @Value:

#### 3 spring aspect for logging:

#### 4 spring event publisher and eventListener and 




        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(filePath).getFile());
        br = new BufferedReader(new FileReader(file));
        
        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();