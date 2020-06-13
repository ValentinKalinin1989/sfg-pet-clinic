package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties",
            joinColumns = @JoinColumn(name = "vets_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Specilty> specilties = new HashSet<>();

    public Set<Specilty> getSpecilties() {
        return specilties;
    }

    public void setSpecilties(Set<Specilty> specilties) {
        this.specilties = specilties;
    }
}
