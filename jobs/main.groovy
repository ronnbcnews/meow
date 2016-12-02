import com.webops.jenkins.spring.Meow

this.class.classLoader.rootLoader.addURL( new URL("file:src/main/groovy") )
app = new Meow()
app.main()

