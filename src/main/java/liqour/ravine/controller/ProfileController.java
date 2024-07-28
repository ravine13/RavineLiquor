package liqour.ravine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import liqour.ravine.entities.Profile;
import liqour.ravine.service.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
    private final ProfileService profileService;

    @Autowired
    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Profile> registerProfile(@RequestBody Profile profile) {
        Profile savedProfile = profileService.saveProfile(profile);
        return ResponseEntity.ok(savedProfile);
    }
    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>getAllProfile() {
        return ResponseEntity.ok(profileService.getAllProfile());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?>getAllProfile(@PathVariable Integer id) {
        return ResponseEntity.ok(profileService.getProfileById(id));
    }

   @PutMapping(value = "path/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateProfile(@PathVariable Integer id, @RequestBody Profile profile) {
        Profile updatedProfile = profileService.updateProfile(profile);
        return ResponseEntity.ok(updatedProfile);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteProfile(@PathVariable Integer id) {
        profileService.deleteProfile(id);
        return ResponseEntity.ok().build();
    }
}
