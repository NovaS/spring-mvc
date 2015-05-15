package net.novasaputra.springmvc;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

/**
 * @author NovaS
 */
@Service
public class HelloService {
	public String sayHello() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		StringBuilder sb = new StringBuilder();
		sb.append("Hello! Time: ");
		sb.append(df.format(new Date()));
		return sb.toString();
	}
}
