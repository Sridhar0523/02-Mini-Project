package in.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.reports.bindings.Entries;
import in.reports.service.EntriesReportService;

@RestController
public class EntriesRestController {
	
	@Autowired
	private EntriesReportService entriesReportService;
	
	@GetMapping("/entries")
	public List<Entries> getAllContacts() {
		return entriesReportService.getAllEntries();
	}

	@GetMapping("/contact/{contactId}")
	public Entries getgetEntryById(@PathVariable Integer eid) {
		return entriesReportService.getEntryById(eid);
	}


}
