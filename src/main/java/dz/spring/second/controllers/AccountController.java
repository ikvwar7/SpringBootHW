package dz.spring.second.controllers;

import dz.spring.second.domain.Account;
import dz.spring.second.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/save")
    Account save(@RequestBody Account account) {
        return accountService.save(account);
    }

    @GetMapping("/all")
    List<Account> findAll() {
        return accountService.getAll();
    }

    @GetMapping("/{id}")
    Account findById(@PathVariable("id") Long id) {
        return accountService.getById(id);
    }


}
