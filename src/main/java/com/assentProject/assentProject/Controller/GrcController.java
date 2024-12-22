package com.assentProject.assentProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assentProject.assentProject.Entity.Organization;
import com.assentProject.assentProject.Entity.OrganizationProductMapping;
import com.assentProject.assentProject.Entity.Product;
import com.assentProject.assentProject.Service.GrcService;

@RestController
@RequestMapping("/grc")
public class GrcController {

    @Autowired
    private GrcService grcService;

    // Product Endpoints
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return grcService.getAllProducts();
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        return grcService.saveProduct(product);
    }

    // Organization Endpoints
    @GetMapping("/organizations")
    public List<Organization> getAllOrganizations() {
        return grcService.getAllOrganizations();
    }

    @PostMapping("/organizations")
    public Organization saveOrganization(@RequestBody Organization organization) {
        return grcService.saveOrganization(organization);
    }

    // Mapping Endpoints
    @GetMapping("/mappings")
    public List<OrganizationProductMapping> getAllMappings() {
        return grcService.getAllMappings();
    }

    @PostMapping("/mappings")
    public OrganizationProductMapping saveMapping(@RequestBody OrganizationProductMapping mapping) {
        return grcService.saveMapping(mapping);
    }
}

