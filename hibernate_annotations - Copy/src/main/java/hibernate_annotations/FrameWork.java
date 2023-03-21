package hibernate_annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "framework_table")
public class FrameWork 
{
	@Id
	@Column(name = "framework_id")
	private int id;
	
	@Column(nullable = false , unique = true)
	private String topic;
	
	@Column(unique = true)
	private int duration;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
