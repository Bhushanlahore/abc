package com.yash.pms.services;

import java.util.Set;

import com.yash.pms.model.product.Company;

public interface CompanyService {

	
	public Company addCompany(Company company) throws Exception;
	
	public Company updateCompany(Company company);
	
	public Set<Company> getCompanies();
	
	public Company getCompany(Long companyId);
	
	public void deleteCompany(Long companyId);
}
