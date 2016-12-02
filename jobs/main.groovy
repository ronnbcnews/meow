import com.webops.jenkins.spring.Meow

// returns null
/* Jenkins Output
Dec 01, 2016 4:32:09 PM hudson.model.AsyncPeriodicWork$1 run
INFO: Finished Fingerprint cleanup. 3 ms
null

Dec 02, 2016 6:48:52 AM hudson.model.Run execute
INFO: job-spring #39 main build action completed: SUCCESS

 */
System.out.println(System.getenv("CLASSPATH")+"\n");
app = new Meow()
app.main()

