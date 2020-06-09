package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Specilty;
import guru.springframework.sfgpetclinic.services.SpecialitesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityMapService extends AbstractMapService<Specilty, Long> implements SpecialitesService {
    @Override
    public Set<Specilty> findAll() {
        return super.findAll();
    }

    @Override
    public Specilty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specilty save(Specilty specilty) {
        return super.save(specilty);
    }

    @Override
    public void delete(Specilty specilty) {
        super.delete(specilty);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
