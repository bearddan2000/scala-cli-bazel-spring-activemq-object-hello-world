package example

import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.SpringApplication

@Configuration
@EnableAutoConfiguration
@ComponentScan
class MyApp

object App extends App {
  SpringApplication.run(classOf[App]);
}
