package liqour.ravine.service;

import liqour.ravine.repositories.BarberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import liqour.ravine.entities.Barber;

import java.util.List;


@Service
public class BarberService {
    
    private final BarberRepository barberRepository;

    @Autowired
    public BarberService(BarberRepository barberRepository){
        this.barberRepository = barberRepository;
    }
    
    //create
    public Barber saveBarber(Barber barber){
        return barberRepository.save(barber);
    }
    //get
    public List<Barber> getAllBarbers(){
        return barberRepository.findAll();
    }
    //getById
    public Barber getBarberById(Integer id){
        return barberRepository.findById(id).orElse(null);
    }
    //update
    public Barber updateBarber(Barber barber){
        return barberRepository.save(barber);
    }
    //delete
    public void deleteBarber(Integer id){
        barberRepository.deleteById(id);
    }
}
