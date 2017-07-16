package com.org.api.springRESTFullWebService.Get.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestFulController {
	private List<String> dataList= new ArrayList<String>(Arrays.asList("Sid","first","Spring"));
	
	@RequestMapping("/getData")
	//handle query string param id and is mapped to id parameter
	//doesn't returns a view return a data object
	public Data getData(@RequestParam(value="id",defaultValue="0") Integer id){
		return new Data(id,dataList.get(id));
	}
}
