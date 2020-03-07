package pl.sdacademy.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MultiValueAttributeMemoryRepository implements MultiValueAttributeRepository {

    private static long currentID = 0;
    private List<MultiValueAttribute> atributes = new ArrayList<>();


    @Override
    public MultiValueAttribute create(MultiValueAttribute mva) {
        mva.setId(++currentID);
        atributes.add(mva);
        return mva;
    }

    @Override
    public MultiValueAttribute getById(Long id) {
        Optional<MultiValueAttribute> firstMVA = atributes.stream()
                .filter(mva -> mva.getId().equals(id))
                .findFirst();
        if (firstMVA.isPresent()){
            return firstMVA.get();
        }return  null;
    }

    @Override
    public List<MultiValueAttribute> findAll() {
        return atributes;
    }
}
