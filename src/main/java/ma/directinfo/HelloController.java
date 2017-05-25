package ma.directinfo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	 List<String> newList = new ArrayList<>();

	 @RequestMapping("/test")
	public  List<String> helloWorld(){
		
		newList.add("test");
		
		return newList;
		
	}

}
