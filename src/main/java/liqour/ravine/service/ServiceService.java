package liqour.ravine.service;

import liqour.ravine.repositories.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceService {
    private ServiceRepository serviceRepository;

    @Autowired
    public ServiceService(ServiceRepository serviceRepository){
        this.serviceRepository = serviceRepository;
    }
    //create
    public liqour.ravine.entities.Service saveService(liqour.ravine.entities.Service service){
        return serviceRepository.save(service);
    }
    //get
    public Iterable<liqour.ravine.entities.Service> getAllService(){
        return serviceRepository.findAll();
    }
    //getby id
    public liqour.ravine.entities.Service getServiceById(Integer id) {
        return serviceRepository.findById(id).orElse(null);
    }
    //update
    public liqour.ravine.entities.Service updateService(liqour.ravine.entities.Service service){
        return serviceRepository.save(service);
    }
    //delete
    public void deleteService(Integer id){
        serviceRepository.deleteById(id);
    }
}
