package aplha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Student;


@RestController
public class MyController {

		@RequestMapping("/")
	public String myMethod() {
		return "\r\n"
				+ "<style>\r\n"
				+ "    body {\r\n"
				+ "        background-color: skyblue;\r\n"
				+ "    }\r\n"
				+ "    div {\r\n"
				+ "        height: 200px;\r\n"
				+ "        margin: 20px;\r\n"
				+ "        border: 5px solid;\r\n"
				+ "        background-color: yellow;\r\n"
				+ "    }\r\n"
				+ "</style>\r\n"
				+ "<body>\r\n"
				+ "    <div>\r\n"
				+ "        <p>Welcome to Spring Web Tutorile</p>\r\n"
				+ "\r\n"
				+ "        <div>\r\n"
				+ "            <p>I am Pavan</p>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "</body>";
		}
		@RequestMapping("/pqr")
		public String method2() {
			return "\r\n"
					+ "<style>\r\n"
					+ "    body {\r\n"
					+ "        background-color: skyblue;\r\n"
					+ "    }\r\n"
					+ "    div {\r\n"
					+ "        height: 200px;\r\n"
					+ "        margin: 20px;\r\n"
					+ "        border: 5px solid;\r\n"
					+ "        background-color: green;\r\n"
					+ "    }\r\n"
					+ "</style>\r\n"
					+ "<body>\r\n"
					+ "    <div>\r\n"
					+ "        <p>Inside pqr</p>\r\n"
					+ "\r\n"
					+ "        <div>\r\n"
					+ "            <p>No Error</p>\r\n"
					+ "        </div>\r\n"
					+ "    </div>\r\n"
					+ "</body>";
		}
		
	
	
		
	
}
