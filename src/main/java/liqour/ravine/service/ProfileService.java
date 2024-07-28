package liqour.ravine.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import liqour.ravine.repositories.ProfileRepository;
import liqour.ravine.entities.Profile;

@Service
public class ProfileService {
    private final ProfileRepository profileRepository;


    @Autowired
    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }
    //create
    public Profile saveProfile(Profile profile){
        return profileRepository.save(profile);
    }
    //get
    public Iterable<Profile>getAllProfile(){
        return profileRepository.findAll();
    }
    //getById
    public Profile getProfileById(Integer id){
        return profileRepository.findById(id).orElse(null);

    }
    //update
    public Profile updateProfile(Profile profile){
        return profileRepository.save(profile);
    }
    //delete
    public void deleteProfile(Integer id){
        profileRepository.deleteById(id);
    }
    
}








