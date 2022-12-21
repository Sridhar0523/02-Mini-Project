package in.reports.bindings;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Plan_DTLS")
public class Plan {

	@Id
	@GeneratedValue
	private Integer planId;
	private String planName;
	private String planStatus;
	private Date startDate;
	private Date endDate;

}
