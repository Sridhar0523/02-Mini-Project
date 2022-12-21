package in.reports.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.reports.bindings.Entries;

@Service
public class EntriesReportServiceImpl implements EntriesReportService {

	@Autowired
	private EntriesReportService entriesReportService;

	@Override
	public List<Entries> getAllEntries() {
		entriesReportService.getAllEntries();
		return entriesReportService.getAllEntries();
	}

	@Override
	public Entries getEntryById(Integer eid) {
		Entries entryById = entriesReportService.getEntryById(eid);
		return entryById;
	}

}
