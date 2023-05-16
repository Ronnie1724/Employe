package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;
@Entity
@Data
public class detail {
	@Id
	int empid;
	String name;
	long number;
}
