package com.SpringProject.myJobApp.company;


import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    void createCompany(Company company);

    Company getCompanyById(Long id);

    boolean deleteCompanyById(Long id);

    boolean updateCompanyById(Long id, Company updateCompany);


}
