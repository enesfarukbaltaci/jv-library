package com.efb.jvbooklib.repository;

import com.efb.jvbooklib.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository  extends JpaRepository<Loan, Long> {
}
