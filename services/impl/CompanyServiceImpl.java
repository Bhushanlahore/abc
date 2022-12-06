package com.yash.pms.services.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.pms.exception.CompanyFoundException;
import com.yash.pms.model.product.Company;
import com.yash.pms.repository.CompanyRepository;
import com.yash.pms.services.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public Company addCompany(Company company) throws Exception {
		
		Company localCompany = this.companyRepository.findCompanyByName(company.getName());
		if(localCompany != null) {
			System.out.println("Company present");
			throw new CompanyFoundException();
		}else {
			localCompany = this.companyRepository.save(company);
		}
		return localCompany;
	}

	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return this.companyRepository.save(company);
	}

	@Override
	public Set<Company> getCompanies() {
		// TODO Auto-generated method stub
		return new HashSet<>(this.companyRepository.findAll());
	}

	@Override
	public Company getCompany(Long companyId) {
		// TODO Auto-generated method stub
		return this.companyRepository.findById(companyId).get();
	}

	@Override
	public void deleteCompany(Long companyId) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company.setId(companyId);
		
		this.companyRepository.delete(company);
		
	}

}
