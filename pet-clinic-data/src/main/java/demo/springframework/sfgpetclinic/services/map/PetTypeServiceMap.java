package demo.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import demo.springframework.sfgpetclinic.model.PetType;
import demo.springframework.sfgpetclinic.services.PetTypeSevice;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeSevice {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
