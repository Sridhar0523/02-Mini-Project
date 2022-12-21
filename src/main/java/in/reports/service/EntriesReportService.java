package in.reports.service;

import java.util.List;

import in.reports.bindings.Entries;

public interface EntriesReportService {
	
	public List<Entries> getAllEntries();
	
	public Entries getEntryById(Integer eid);


}
