package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Specilty> specilties;

    public Set<Specilty> getSpecilties() {
        return specilties;
    }

    public void setSpecilties(Set<Specilty> specilties) {
        this.specilties = specilties;
    }
}
