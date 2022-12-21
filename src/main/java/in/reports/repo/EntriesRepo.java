package in.reports.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.reports.bindings.Entries;

public interface EntriesRepo extends JpaRepository<Entries, Integer>{

}