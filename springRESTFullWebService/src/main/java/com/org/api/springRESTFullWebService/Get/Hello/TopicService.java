package com.org.api.springRESTFullWebService.Get.Hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topic = new ArrayList<>(Arrays.asList(new Topic("1","Java","Java Tutorial"),
							 new Topic("2","Automatio","Automation with Selenium and Cucumber"),
							 new Topic("3","Spring","Develop Spring API")));
	
	public List<Topic> getAllTopics(){
		return topic;
	}
	
	public Topic getTopic(String id){
		return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		this.topic.add(topic);
	}

	public void updateTopic(Topic topic2, String id) {
		for(int i=0;i<topic.size();i++){
			Topic top=topic.get(i);
			if(top.getId().equals(id)){
				topic.set(i, topic2);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		for(int i=0;i<topic.size();i++){
			Topic top=topic.get(i);
			if(top.getId().equals(id)){
				topic.remove(i);
			}
		}
		
	}
}
