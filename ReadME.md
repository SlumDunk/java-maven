## day 01
    settings.xml
        config the local repository and the mirror
       
    jar -cvfm hello.jar META-INF/MENIFEST.MF com
    
    java -jar hello.jar
    
     mvn archetype:generate -DgroupId=com.slam.dunk -DartifactId=test -DarchetypeArtifactId=maven-archetype-quickstart
     
     life cycle of maven
        clean-compile-test-package-install-deploy
        
        use the plugin to implement concrete tasks. (Template Pattern)
        
        
     Clean
        pre-clean
        clean
        post-clean
        
     Default (build)
        process-resources
        compile
        test-compile
        test
        package
        process-classes
        install
        deploy
     
     Site (generate java doc)
        site
        post-site
        site-deploy
        
     mvn clean-- execute the clean phase in the lifecyle of clean
     
     
     ##create my own maven plugin
        install the plugin first
        execute the plugin with maven command:
            mvn com.slam.dunk:slam-plugin:1.0-SNAPSHOT:log
            mvn com.slam.dunk:slam-plugin:1.0-SNAPSHOT:log -Dlog.name=Jira (with parameter)
            
     
     ##active environment profile
        <profile></profile>
        mvn package -P dev
        mvn package -P test         
        
     ##Transitive dependency
        jar confliction
            jvm ----- classloader -----> find class in all classpath
            ---------------pom.xml -------> depend a.jar:1.0
            ---------------pom.xml -------> depend a.jar:2.0
            only one can make effection
            
        decision mechanism:
            shortest path first
            same path length, who declare first, use who
            use exclusion to exclude
         
        <scope></scope>
            compile -- default scope
            provided -- servlet-api
            runtime -- jdk driver
            test
            system
            
        mvn dependency:tree
        
     --declare the dependencies so that the child modules don't need to config the version explicitly
     <dependencyManagement></dependencyManagement>
    
    ##maven repository
        local repository
        
        private repository
            save bandwidth
            accelerate the building process
            
            config the central repository
            
            host repository to store the local jar of company
            
            open the upload priviledge
                upload jar
                config username and password in the setting.xml
                config distributionManagement in the pom.xml
                
                
            
        remote repository
            
        central repository
            
    ## create my own archetype from project             
    mvn archetype:create-from-project
    mvn clean install