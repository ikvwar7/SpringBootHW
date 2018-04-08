package dz.spring.second.controllers;

import com.sun.deploy.net.HttpResponse;
import dz.spring.second.domain.Account;
import dz.spring.second.domain.Owner;
import dz.spring.second.service.AccountService;
import dz.spring.second.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/all")
    public List<Owner> findAll() {
        return ownerService.getAll();
    }

    @GetMapping("/{id}")
    Owner findById(@PathVariable("id") Long id) {
        return ownerService.getById(id);
    }

    @PostMapping("/save")
    Owner save(@RequestBody Owner owner) {
        return ownerService.save(owner);
    }

    @GetMapping("/{id}/accounts")
    List<Account> findAccountsByOwnerId(@PathVariable("id") Long id) {
        return accountService.getAllByOwnerId(id);
    }

}
