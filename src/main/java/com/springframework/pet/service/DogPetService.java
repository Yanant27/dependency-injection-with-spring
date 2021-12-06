package com.springframework.pet.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Htoo Yanant Khin
 */
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService{
    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}