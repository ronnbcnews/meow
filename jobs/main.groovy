import com.webops.jenkins.spring.Meow
import java.lang.ClassLoader

System.out.println(System.getenv("CLASSPATH")+"\n");
def printClassPath(classLoader) {
  println "$classLoader"
  classLoader.getURLs().each {url->
    println "- ${url.toString()}"
  }
  if (classLoader.parent) {
    printClassPath(classLoader.parent)
  }
}
printClassPath this.class.classLoader
println "---"

app = new Meow()
app.main()

