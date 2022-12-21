package in.reports.bindings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ENTRIES_DTLS")
public class Entries {

	@Id
	@GeneratedValue
	private Integer eid;
	private String ename;
	private String eemail;
	private String emobileNumber;
	private String egender;
	private Integer ssn;

}
