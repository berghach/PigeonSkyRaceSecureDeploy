package com.example.PigeonsVoyageurs.breeder;

import com.example.PigeonsVoyageurs.dtos.request.UserRequestDTO;
import com.example.PigeonsVoyageurs.dtos.response.UserResponseDTO;
import com.example.PigeonsVoyageurs.breeder.service.BreederService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/breeder")
public class BreederController {
    
    private final BreederService breederService;

    @Autowired
    public BreederController(BreederService breederService) {
        this.breederService = breederService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(@RequestBody UserRequestDTO breederDTO) {
        UserResponseDTO breeder = breederService.register(breederDTO);
        return ResponseEntity.ok(breeder);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        Optional<String> result = breederService.login(email, password);
        return result.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(401).body("Invalid credentials"));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> findById(@PathVariable String id) {
        Optional<UserResponseDTO> breederOpt = breederService.findById(id);
        return breederOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserResponseDTO> findByEmail(@PathVariable String email) {
        Optional<UserResponseDTO> breederOpt = breederService.findByEmail(email);
        return breederOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        List<UserResponseDTO> breeders = breederService.findAll();
        return ResponseEntity.ok(breeders);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> update(@PathVariable String id, @RequestBody UserRequestDTO breederDTO) {
        UserResponseDTO updatedBreeder = breederService.update(id, breederDTO);
        return ResponseEntity.ok(updatedBreeder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        breederService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
