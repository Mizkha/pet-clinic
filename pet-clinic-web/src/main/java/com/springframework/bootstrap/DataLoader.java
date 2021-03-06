package com.springframework.bootstrap;

import com.springframework.petclinic.model.Owner;
import com.springframework.petclinic.model.Vet;
import com.springframework.petclinic.services.OwnerService;
import com.springframework.petclinic.services.VetService;
import com.springframework.petclinic.services.map.OwnerServiceMap;
import com.springframework.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){

        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();


    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Mizha");
        owner1.setLastName("Whiz");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Vasha");
        owner2.setLastName("EEEEE");

        ownerService.save(owner2);

        System.out.println("owners loaded");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Red");
        vet1.setLastName("Cross");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("United");
        vet2.setLastName("Organization");

        vetService.save(vet2);

        System.out.println("vets loaded");

    }
}
