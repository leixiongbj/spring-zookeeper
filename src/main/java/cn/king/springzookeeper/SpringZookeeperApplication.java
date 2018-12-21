package cn.king.springzookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

/**
 * @author king
 */
@SpringBootApplication
public class SpringZookeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZookeeperApplication.class, args);
		Set<Thread> threads = Thread.getAllStackTraces().keySet();
		for (Thread thread : threads){
			System.out.println(thread.getName() + "---------" + thread.isDaemon());
		}
	}
}
