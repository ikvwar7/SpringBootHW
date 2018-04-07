package dz.spring.second.controllers;

import dz.spring.second.domain.Company;
import dz.spring.second.domain.Owner;
import dz.spring.second.service.CompanyService;
import dz.spring.second.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/all")
    List<Company> findAll() {
        return companyService.getAll();
    }

    @GetMapping("/{id}")
    Company findById(@PathVariable("id") Long id) {
        return companyService.getById(id);
    }

    @PostMapping("/save")
    Company save(@RequestBody Company company) {
        return companyService.save(company);
    }

    @GetMapping("/{id}/owners")
    List<Owner> findOwnersByCompanyId(@PathVariable("id") Long id) {
        Company company = companyService.getById(id);
        Long companyId = company.getId();
        return ownerService.getAllByComapnyd(companyId);
    }
}
